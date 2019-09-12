package com.agilezhu.moduledemo

import android.os.Bundle
import com.agilezhu.core.base.BaseActivity
import com.agilezhu.core.config.RouterPath
import com.alibaba.android.arouter.launcher.ARouter

class MainActivity : BaseActivity() {

    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.app_activity_main)

        ARouter.getInstance()
            .build(RouterPath.HOME_HOME_ACTIVITY)
            .withString("message", "欢迎使用")
            .navigation()

//        finish()
    }
}
