package ru.kszorin.homebookkeeping.feature_signup.presentation.viewmodel

import android.util.Log
import androidx.lifecycle.MutableLiveData
import androidx.lifecycle.ViewModel

class SignupViewModel : ViewModel() {

	var email = MutableLiveData<String>()


	fun printEmail() {
		Log.d("LOGGING", "printEmail: ${email.value}")
		email.value += "_added"
	}

}