package com.agilezhu.moduledemo

import android.app.Application

//import com.example.home.HomeApplication

/**
 * TODO 请添加说明
 *
 * @author zhujie
 * @date 2019-09-11
 * @time 10:08
 */
class AppApplication : Application() {
    override fun onCreate() {
        super.onCreate()
//        HomeApplication.init(this)
    }
}