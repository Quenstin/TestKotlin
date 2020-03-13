package com.kotlin.testkotlin

import android.app.Application
import android.content.Context
import com.blankj.utilcode.util.Utils

/**
 * Created by zhgq on 2020/3/13
 * Describe：
 */
class LQApplication : Application() {

   private var mContext: Context?=null

    fun getLQApplication(): LQApplication? {
        return mContext as LQApplication
    }

    override fun onCreate() {
        super.onCreate()
        mContext=this
        Utils.init(this)

    }
}