package com.example.login

import androidx.fragment.app.Fragment
import com.agilezhu.core.service.ILoginService

/**
 * TODO 请添加说明
 *
 * @author zhujie
 * @date 2019-09-12
 * @time 15:05
 */
class LoginService : ILoginService {
    private val mIsLogin = true
    override fun isLogin(): Boolean {
        return mIsLogin
    }

    override fun getLoginFragment(): Fragment {
        return LoginFragment()
    }
}