package com.example.home

import android.app.Application

/**
 * TODO 请添加说明
 *
 * @author zhujie
 * @date 2019-09-11
 * @time 11:00
 */
class HomeApplication : Application() {
    override fun onCreate() {
        super.onCreate()
        init(this)
    }

    companion object {
        fun init(application: Application) {

        }
    }
}