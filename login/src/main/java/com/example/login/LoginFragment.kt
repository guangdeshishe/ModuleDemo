package com.example.login

import android.app.Activity
import android.os.Bundle
import android.view.LayoutInflater
import android.view.View
import android.view.ViewGroup
import android.widget.Button
import androidx.fragment.app.Fragment
import com.agilezhu.core.config.RouterPath
import com.alibaba.android.arouter.launcher.ARouter

/**
 * TODO 请添加说明
 *
 * @author zhujie
 * @date 2019-09-12
 * @time 15:03
 */
class LoginFragment : Fragment() {

    override fun onCreateView(
        inflater: LayoutInflater,
        container: ViewGroup?,
        savedInstanceState: Bundle?
    ): View? {
        val contentView = inflater.inflate(R.layout.login_activity_main, container, false)
        val button = contentView.findViewById<Button>(R.id.mLoginButton)

        button.setOnClickListener {
            ARouter.getInstance().build(RouterPath.HOME_HOME_ACTIVITY).navigation()
            (context as Activity).finish()
        }
        return contentView
    }
}