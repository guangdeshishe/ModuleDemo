package com.agilezhu.core.config

import android.app.Application
import com.agilezhu.core.base.BaseApplication

/**
 * TODO 请添加说明
 *
 * @author zhujie
 * @date 2019-09-12
 * @time 11:03
 */
class ApplicationConfig {
    companion object {
        val APPLICATION_LIST = arrayOf(
            "com.example.home.HomeApplication",
            "com.example.login.LoginApplication"
        )

        fun init(application: Application) {
            for (applicationClassString: String in APPLICATION_LIST) {
                try {
                    val applicationClass = Class.forName(applicationClassString)
                    val applicationInstance = applicationClass.newInstance()
                    if (applicationInstance is BaseApplication) {
                        applicationInstance.init(application)
                    }
                } catch (e: Throwable) {
                    e.printStackTrace()
                }

            }
        }
    }
}