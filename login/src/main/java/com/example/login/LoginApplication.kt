package com.example.login

import android.app.Application
import com.agilezhu.core.base.BaseApplication
import com.agilezhu.core.utils.AppLogger

/**
 * TODO 请添加说明
 *
 * @author zhujie
 * @date 2019-09-12
 * @time 10:57
 */
class LoginApplication : BaseApplication() {
    override fun onCreate() {
        super.onCreate()
        init(this)
    }

    override fun init(application: Application) {
        AppLogger.log(this.javaClass, "初始化LoginApplication成功")
//        ARouter.init(application)
    }
}