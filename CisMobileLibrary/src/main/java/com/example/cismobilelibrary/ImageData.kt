package com.example.cismobilelibrary

import android.content.Context
import android.net.Uri
import android.provider.MediaStore
import java.io.File

class ImageData {

    companion object {

        fun getAbsolutePath(uri: Uri, context: Context): String {
            val projection = arrayOf(MediaStore.MediaColumns.DATA)
            val cursor = context.contentResolver.query(
                uri, projection,
                null, null, null
            )
            var filePath = ""
            if (cursor != null) {
                val columnIndex = cursor.getColumnIndexOrThrow(MediaStore.MediaColumns.DATA)
                cursor.moveToFirst()
                filePath = cursor.getString(columnIndex)
            }
            cursor?.close()
            return filePath
        }

        fun getFile(uri: Uri): File {
            val file = File(uri.toString())
            return file
        }

    }

}