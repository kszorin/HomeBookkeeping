package ru.kszorin.homebookkeeping.feature_signup.presentation.viewmodel

import androidx.lifecycle.MutableLiveData
import androidx.lifecycle.ViewModel

class SignupViewModel : ViewModel() {

	val email = MutableLiveData<String>()
	val password = MutableLiveData<String>()
	val passwordConfirmation = MutableLiveData<String>()


}