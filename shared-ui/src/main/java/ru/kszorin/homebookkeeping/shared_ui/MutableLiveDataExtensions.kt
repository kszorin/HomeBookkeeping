package ru.kszorin.homebookkeeping.shared_ui

import androidx.core.widget.addTextChangedListener
import androidx.lifecycle.LifecycleOwner
import androidx.lifecycle.MutableLiveData
import androidx.lifecycle.observe
import com.google.android.material.textfield.TextInputEditText

fun MutableLiveData<String>.bind(lifecycleOwner: LifecycleOwner, editText: TextInputEditText) {
	editText.addTextChangedListener {
		if (this.value != it.toString()) {
			this.value = it.toString()
		}
	}
	this.observe(lifecycleOwner, editText::setText)
}