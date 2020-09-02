package ru.kszorin.homebookkeeping.feature_signup.presentation.viewmodel

import io.mockk.mockk
import ru.kszorin.homebookkeeping.feature_signup.domain.usecase.SignupUseCase

class SignupViewModelTest {

	val signUpUseCase = mockk<SignupUseCase>()
	val viewModel = SignupViewModel(signUpUseCase)


}