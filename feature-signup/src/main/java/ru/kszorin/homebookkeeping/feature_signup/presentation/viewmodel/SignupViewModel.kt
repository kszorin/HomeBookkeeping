package ru.kszorin.homebookkeeping.feature_signup.presentation.viewmodel

import androidx.lifecycle.MutableLiveData
import androidx.lifecycle.ViewModel
import ru.kszorin.homebookkeeping.feature_signup.domain.usecase.SignupUseCase
import javax.inject.Inject

class SignupViewModel @Inject constructor(val signUpUseCase: SignupUseCase) : ViewModel() {

	val email = MutableLiveData<String>()
	val password = MutableLiveData<String>()
	val passwordConfirmation = MutableLiveData<String>()

	init {
		initData()
	}

	fun initData() {
		email.value = ""
		password.value = ""
		passwordConfirmation.value = ""
	}

	fun signupUser() {
//		signUpUseCase(email.value.orEmpty(), password.value.orEmpty(), passwordConfirmation.value.orEmpty())
	}

}