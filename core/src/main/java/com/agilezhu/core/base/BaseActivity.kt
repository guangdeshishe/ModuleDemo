package com.agilezhu.core.base

import android.widget.Toast
import androidx.appcompat.app.AppCompatActivity
import io.reactivex.disposables.CompositeDisposable
import io.reactivex.disposables.Disposable

/**
 * TODO 请添加说明
 *
 * @author zhujie
 * @date 2019-09-11
 * @time 17:01
 */
open class BaseActivity : AppCompatActivity() {
    private val mCompositeDisposable = CompositeDisposable()

    protected fun addDisposable(mDisposable: Disposable) {
        mCompositeDisposable.add(mDisposable)
    }

    override fun onDestroy() {
        super.onDestroy()
        mCompositeDisposable.clear()
    }

    protected fun showToast(message: String) {
        Toast.makeText(this, message, Toast.LENGTH_SHORT).show()
    }
}