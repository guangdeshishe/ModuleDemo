package com.agilezhu.core.utils

import android.app.Activity
import android.content.Context
import android.content.Intent
import android.widget.Toast

/**
 * TODO 请添加说明
 *
 * @author zhujie
 * @date 2019-09-11
 * @time 16:45
 */
class ActivityUtil {
    companion object {
        fun open(context: Context, activityClassName: String) {
            open(context, activityClassName, Intent())
        }

        fun open(context: Context, activityClassName: String, intent: Intent) {
            try {
                val clazz = Class.forName(activityClassName)
                intent.setClass(context, clazz)
                if (context !is Activity) {
                    intent.addFlags(Intent.FLAG_ACTIVITY_NEW_TASK)
                }
                context.startActivity(intent)
            } catch (e: Throwable) {
                Toast.makeText(context, e.message, Toast.LENGTH_SHORT).show()
            }
        }
    }
}