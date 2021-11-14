package com.gpscoding.testmodule

import android.util.Log

class Template {
    companion object {
        @JvmStatic
        fun showLog() {
            Log.d("*Test*", "showLog: " + "This is for test log")
        }
    }
}