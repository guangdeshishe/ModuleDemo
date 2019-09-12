package com.example.home

import android.os.Bundle
import com.agilezhu.core.base.BaseActivity
import com.agilezhu.core.config.RouterPath
import com.alibaba.android.arouter.facade.annotation.Route
import com.alibaba.android.arouter.launcher.ARouter
import com.jakewharton.rxbinding2.view.RxView
import kotlinx.android.synthetic.main.home_activity_main.*

@Route(path = RouterPath.HOME_HOME_ACTIVITY)
class HomeActivity : BaseActivity() {

    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.home_activity_main)

        val message = intent.getStringExtra("message")
        if (!message.isNullOrEmpty()) {
            showToast(message)
        }

        addDisposable(RxView.clicks(mHomeLoginButton)
            .subscribe {
                ARouter.getInstance().build(RouterPath.LOGIN_LOGIN_ACTIVITY).navigation()
            })
    }
}
