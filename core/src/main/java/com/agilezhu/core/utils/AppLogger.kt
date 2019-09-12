package com.agilezhu.core.utils

import android.util.Log

/**
 * TODO 请添加说明
 *
 * @author zhujie
 * @date 2019-09-12
 * @time 11:13
 */
class AppLogger {
    companion object {
        fun log(clazz: Class<*>, message: String) {
            Log.d("mylog " + clazz.simpleName, message)
        }
    }
}