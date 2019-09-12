package com.agilezhu.moduledemo

import android.app.Application
import com.agilezhu.core.base.BaseApplication
import com.agilezhu.core.config.ApplicationConfig
import com.alibaba.android.arouter.launcher.ARouter

/**
 * TODO 请添加说明
 *
 * @author zhujie
 * @date 2019-09-11
 * @time 10:08
 */
class AppApplication : BaseApplication() {

    override fun init(application: Application) {
        ARouter.openLog()    // 打印日志
        ARouter.openDebug()
        ARouter.init(this)

        ApplicationConfig.init(this)
    }
}