package com.zhxh.xproject

import android.os.Bundle
import android.support.v7.app.AppCompatActivity


import kotlinx.android.synthetic.main.fragment_main.*

class MainActivity : AppCompatActivity() {

    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_main)

        // Example of a call to a native method
        // 从原生方法中获取文本
        sample_text.text = "d"
    }

}
