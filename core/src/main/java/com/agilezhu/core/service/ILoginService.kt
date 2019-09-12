package com.agilezhu.core.service

import androidx.fragment.app.Fragment

/**
 * Login模块服务
 *
 * @author zhujie
 * @date 2019-09-12
 * @time 14:59
 */
interface ILoginService {
    /**
     * 是否已经登录
     */
    fun isLogin(): Boolean

    /**
     * 获取登录界面的Fragment
     */
    fun getLoginFragment(): Fragment
}