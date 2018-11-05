package com.example.wzb.testlibrary

import android.support.v7.app.AppCompatActivity
import android.os.Bundle
import android.util.Log

class MainActivity : AppCompatActivity() {

    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_main)
        Log.i("out", "这里啥也没有，就是拿来测试的")
    }

    companion object {
        fun testLibrary() {

        }
    }
}
