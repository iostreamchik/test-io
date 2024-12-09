package com.example.toast

import android.content.Context
import android.widget.Toast

object ToastLib {

    fun use(context: Context) {
        Toast.makeText(context, "ToastLib enabled", Toast.LENGTH_SHORT).show()
    }
}