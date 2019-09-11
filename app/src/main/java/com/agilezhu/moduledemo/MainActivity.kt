package com.agilezhu.moduledemo

import android.content.Intent
import android.os.Bundle
import com.agilezhu.core.base.BaseActivity
import com.agilezhu.core.utils.ActivityUtil

class MainActivity : BaseActivity() {

    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.app_activity_main)

        val intent = Intent()
        intent.putExtra("message", "欢迎使用")
        ActivityUtil.open(this, "com.example.home.HomeActivity", intent)
        finish()
    }
}
