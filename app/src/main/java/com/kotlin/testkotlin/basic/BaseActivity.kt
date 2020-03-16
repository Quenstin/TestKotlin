package com.kotlin.testkotlin.basic

import android.os.Bundle
import androidx.appcompat.app.AppCompatActivity

/**
 * Created by zhgq on 2020/3/14
 * Describe：
 */
 abstract class BaseActivity :AppCompatActivity() {

    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(getLayoutId())
        setView()
        setData()
    }



    abstract fun getLayoutId():Int
    abstract fun setView()
    abstract fun setData()
}