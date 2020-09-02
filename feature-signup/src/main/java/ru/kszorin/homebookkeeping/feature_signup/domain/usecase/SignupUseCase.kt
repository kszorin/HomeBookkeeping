package ru.kszorin.homebookkeeping.feature_signup.domain.usecase

import javax.inject.Inject

class SignupUseCase @Inject constructor(/*private val userRepository: UserRepository*/) {

	operator fun invoke(email: String, password: String, passwordConfirmation: String) {
		/*if (password != passwordConfirmation) throw DomainException(ErrorCode.PASSWORDS_NOT_MATCH)

		userRepository.create(email, email, password)*/
	}
}