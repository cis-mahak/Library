package com.example.cismobilelibrary

import android.annotation.SuppressLint
import android.content.ContentValues
import android.util.Log
import java.text.ParseException
import java.text.SimpleDateFormat
import java.util.*

class DateConversion {

    val ddMMYYYY  = "dd MM yyyy"
    val dd_MM_YYYY  = "dd-MM-yyyy"
    val ddMMYYYYSlash = "dd/MM/yyyy"
    val YYYYMMdd = "yyyy MM dd"
    val YYYY_MM_dd = "yyyy-MM-dd"
    val YYYYMMddSlash = "yyyy/MM/dd"
    val ddMMMYYYY = "dd MMM yyyy"
    val ddMMYYYYhhmmaa = "dd MM YYYY hh:mm aa"
    val dd_MM_YYYYhhmmaa = "dd-MM-YYYY hh:mm aa"
    val ddMMYYYYhhmmaaSlash = "dd/MM/YYYY hh:mm aa"
    val ddMMYYYYHHmm = "dd MM YYYY HH:mm"
    val dd_MM_YYYYHHmm = "dd-MM-YYYY HH:mm"
    val ddMMYYYYHHmmsSplash = "dd/MM/YYYY HH:mm"
    val HHmm = "HH:mm"
    val hhmmaa = "hh:mm aa"

    companion object{

        @SuppressLint("SimpleDateFormat")
        fun getCurrentDateTime(): String? {
            val smsTime = Calendar.getInstance()
            val simpleDateFormat = SimpleDateFormat("dd MMM yyyy'&'HH:mm:ss")
            return simpleDateFormat.format(smsTime.time)
        }

        @SuppressLint("SimpleDateFormat")
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

}