package com.example.kede.myapplication1

import android.support.v7.app.AppCompatActivity
import android.os.Bundle

class TestGridLayoutActivity : AppCompatActivity() {

    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_test_grid_layout)
    }
}

/**
 * GirdLayout 设置过列后如何让列占满布局且均分宽度
 *
 *  可以设置layout_gravity为fill来占满， 问题：均分需要如何设置？
 * */