package com.example.login

import android.os.Bundle
import com.agilezhu.core.base.BaseActivity
import com.agilezhu.core.config.RouterPath
import com.alibaba.android.arouter.facade.annotation.Route
import com.jakewharton.rxbinding2.view.RxView
import kotlinx.android.synthetic.main.login_activity_main.*

@Route(path = RouterPath.LOGIN_LOGIN_ACTIVITY)
class LoginActivity : BaseActivity() {

    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.login_activity_main)
        addDisposable(RxView.clicks(mLoginButton)
            .subscribe {
                showToast("登录成功")
                finish()
            })
    }
}
