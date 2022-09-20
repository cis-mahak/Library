package com.example.cismobilelibrary

import android.content.Context
import android.util.Log
import android.widget.Toast
import java.text.SimpleDateFormat
import java.util.*

class CisDate {
    companion object{
    public val TAG = "CisDateKotlin"

    fun myToast(ctx: Context, msg: String) {
        Toast.makeText(ctx, msg, Toast.LENGTH_SHORT).show()
    }

    fun getCurrentDateTime(): String? {
        val smsTime = Calendar.getInstance()
        val simpleDateFormat = SimpleDateFormat("dd MMM yyyy'&'HH:mm:ss")
        return simpleDateFormat.format(smsTime.time)
    }

    fun printLog(MSG: String, VALUE: Any?) {
        Log.d(TAG, "$MSG\t-->\t$VALUE")
    }
    }
}
