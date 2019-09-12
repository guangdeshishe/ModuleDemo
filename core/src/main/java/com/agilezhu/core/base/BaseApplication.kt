package com.agilezhu.core.base

import android.app.Application
import com.agilezhu.core.ExceptionHandler

/**
 * TODO 请添加说明
 *
 * @author zhujie
 * @date 2019-09-12
 * @time 11:00
 */
abstract class BaseApplication : Application() {
    override fun onCreate() {
        super.onCreate()
        init(this)
        Thread.setDefaultUncaughtExceptionHandler(ExceptionHandler())
    }

    abstract fun init(application: Application)
}