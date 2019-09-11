package com.agilezhu.core

import android.app.Application

/**
 * TODO 请添加说明
 *
 * @author zhujie
 * @date 2019/9/10
 * @time 16:13
 */
public class CoreApplication : Application() {
    override fun onCreate() {
        super.onCreate()
        init(this)
    }

    companion object {
        fun init(application: Application) {

        }
    }
}