package com.agilezhu.core

import android.app.Application
import com.agilezhu.core.base.BaseApplication

/**
 * TODO 请添加说明
 *
 * @author zhujie
 * @date 2019/9/10
 * @time 16:13
 */
class CoreApplication : BaseApplication() {
    override fun onCreate() {
        super.onCreate()
        init(this)
    }

    override fun init(application: Application) {

    }
}