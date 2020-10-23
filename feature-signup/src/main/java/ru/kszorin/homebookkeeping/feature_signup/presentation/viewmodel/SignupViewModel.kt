package ru.kszorin.homebookkeeping.feature_signup.presentation.viewmodel

import androidx.lifecycle.MutableLiveData
import androidx.lifecycle.ViewModel
import ru.kszorin.homebookkeeping.feature_signup.domain.usecase.SignupUseCase
import javax.inject.Inject

class SignupViewModel @Inject constructor(signupUseCase: SignupUseCase) : ViewModel() {

	val email = MutableLiveData<String>()
	val password = MutableLiveData<String>()
	val passwordConfirmation = MutableLiveData<String>()

}