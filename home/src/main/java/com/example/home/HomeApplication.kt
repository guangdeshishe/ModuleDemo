package com.example.home

import android.app.Application
import com.agilezhu.core.base.BaseApplication
import com.agilezhu.core.utils.AppLogger
import com.alibaba.android.arouter.launcher.ARouter

/**
 * TODO 请添加说明
 *
 * @author zhujie
 * @date 2019-09-11
 * @time 11:00
 */
class HomeApplication : BaseApplication() {
    override fun onCreate() {
        super.onCreate()
        init(this)
    }

    override fun init(application: Application) {
        AppLogger.log(this.javaClass, "初始化HomeApplication成功")
        ARouter.init(application)
    }
}