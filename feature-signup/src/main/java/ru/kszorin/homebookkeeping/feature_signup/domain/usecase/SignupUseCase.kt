package ru.kszorin.homebookkeeping.feature_signup.domain.usecase

import ru.kszorin.homebookkeeping.shared_error.domain.entity.DomainException
import ru.kszorin.homebookkeeping.shared_error.domain.entity.ErrorCode
import ru.kszorin.homebookkeeping.shared_user.domain.repository.UserRepository

class SignupUseCase(private val userRepository: UserRepository) {

    operator fun invoke(email: String, password: String, passwordConfirmation: String) {
        if (password != passwordConfirmation) throw DomainException(ErrorCode.PASSWORDS_NOT_MATCH)

        userRepository.create(email, email, password)
    }
}