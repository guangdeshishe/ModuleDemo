package com.agilezhu.core.service

/**
 * 服务管理类
 *
 * @author zhujie
 * @date 2019-09-12
 * @time 15:08
 */
class ServiceManager {
    lateinit var loginService: ILoginService //登录模块的服务

    companion object {
        fun getInstance(): ServiceManager {
            return InstanceHolder.instance
        }

        private class InstanceHolder {
            companion object {
                val instance = ServiceManager()
            }
        }
    }
}