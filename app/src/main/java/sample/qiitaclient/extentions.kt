package sample.qiitaclient

import android.support.annotation.IdRes
import android.view.View

/**
 * Created by kakehi on 2018/02/17.
 */

fun <T : View> View.bindView(@IdRes id: Int): Lazy<T> = lazy {
    findViewById(id) as T
}
