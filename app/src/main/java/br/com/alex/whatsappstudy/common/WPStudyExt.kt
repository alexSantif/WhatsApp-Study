package br.com.alex.whatsappstudy.common

import android.view.View
import androidx.lifecycle.coroutineScope
import androidx.lifecycle.findViewTreeLifecycleOwner
import kotlinx.coroutines.CoroutineDispatcher
import kotlinx.coroutines.Dispatchers
import kotlinx.coroutines.Job
import kotlinx.coroutines.delay
import kotlinx.coroutines.launch

const val DATE_MASK_FORMAT = "yyyy-MM-dd'T'HH:mm:ss'Z'"

fun View.onSingleClick(
    durationInMillis: Long = 1000L,
    dispatcher: CoroutineDispatcher = Dispatchers.Main,
    block: (View) -> Unit
): Job? = findViewTreeLifecycleOwner()?.let { lifecycleOwner ->
    lifecycleOwner.lifecycle.coroutineScope.launch(dispatcher) {
        delay(durationInMillis)
        println(">>>> funciona o delay")
        setOnClickListener(block)
    }
}
