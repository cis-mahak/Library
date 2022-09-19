package com.example.cismobilelibrary

import android.annotation.SuppressLint
import android.content.ContentValues
import android.content.ContentValues.TAG
import android.os.Bundle
import android.util.Log
import androidx.appcompat.app.AppCompatActivity
import java.text.ParseException
import java.text.SimpleDateFormat
import java.util.*

class MainActivity : AppCompatActivity() {
    @SuppressLint("SimpleDateFormat")
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_main)

        val smsTime = Calendar.getInstance()
        Log.d(TAG, "onCreate: ${smsTime.time}")

        val simpleDateFormat = SimpleDateFormat("dd MMM yyyy'&'HH:mm:ss")
        Log.d(TAG, "onCreate: ${simpleDateFormat.format(smsTime.time)}")

        val simpleDateFormat1 = SimpleDateFormat("dd MM yyyy")
        Log.d(TAG, "onCreate: ${simpleDateFormat1.format(smsTime.time)}")

        val simpleDateFormat2 = SimpleDateFormat("dd/MM/yyyy")
        Log.d(TAG, "onCreate: ${simpleDateFormat2.format(smsTime.time)}")

        val simpleDateFormat3 = SimpleDateFormat("dd-MM-yyyy")
        Log.d(TAG, "onCreate: ${simpleDateFormat3.format(smsTime.time)}")

        val simpleDateFormat4 = SimpleDateFormat("yyyy/MM/dd")
        Log.d(TAG, "onCreate: ${simpleDateFormat4.format(smsTime.time)}")

        val simpleDateFormat5 = SimpleDateFormat("hh:mm aa")
        Log.d(TAG, "onCreate: ${simpleDateFormat5.format(smsTime.time)}")

        val originalFormat = SimpleDateFormat("dd MM yyyy")
        val targetFormat = SimpleDateFormat("yyyy/MM/dd hh:mm aa")
        val date: Date
        try {
            date = originalFormat.parse("21 6 2013")
            println("Old Format :   " + originalFormat.format(date))
            println("New Format :   " + targetFormat.format(date))
            Log.d(TAG, "onCreate: ${targetFormat.format(date)}")
        } catch (ex: ParseException) {
            // Handle Exception.
            Log.d(TAG, "onCreate: ${ex.message}")
        }

        convert("12-08-1999 15:00", "dd-MM-yyyy HH:mm", "yyyy/MM/dd hh:mm aa")

    }

    fun convert(value: String, input: String, output: String): String {
        val originalFormat = SimpleDateFormat(input)
        val targetFormat = SimpleDateFormat(output)
        var date: Date? = null
        try {
            date = originalFormat.parse(value)
            println("Old Format :   " + originalFormat.format(date!!))
            println("New Format :   " + targetFormat.format(date))
            Log.d(ContentValues.TAG, "onCreate: ${targetFormat.format(date)}")
        } catch (ex: ParseException) {
            // Handle Exception.
        }
        return date.toString()
    }
}