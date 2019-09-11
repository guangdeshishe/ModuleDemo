package com.example.login

import android.os.Bundle
import com.agilezhu.core.base.BaseActivity
import com.jakewharton.rxbinding2.view.RxView
import kotlinx.android.synthetic.main.login_activity_main.*

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
