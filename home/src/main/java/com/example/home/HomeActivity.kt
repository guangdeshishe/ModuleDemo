package com.example.home

import android.os.Bundle
import com.agilezhu.core.base.BaseActivity
import com.agilezhu.core.utils.ActivityUtil
import com.jakewharton.rxbinding2.view.RxView
import kotlinx.android.synthetic.main.home_activity_main.*

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
                ActivityUtil.open(this, "com.example.login.LoginActivity")
            })
    }
}
