package ru.kszorin.homebookkeeping.feature_signup.domain.usecase

import io.mockk.every
import io.mockk.mockk
import io.mockk.verify
import org.junit.Test
import ru.kszorin.homebookkeeping.shared_error.domain.entity.DomainException
import ru.kszorin.homebookkeeping.shared_user.data.repository.UserRepositoryImpl
import ru.kszorin.homebookkeeping.shared_user.domain.entity.User

class SignupUseCaseTest {

    private val userRepository = mockk<UserRepositoryImpl>()
    private val useCase = SignupUseCase(userRepository)

    @Test(expected = DomainException::class)
    fun `WHEN passwords dont match EXPECT exception with code=1`() {
        useCase("ivan@ya.ru", "pass1", "pass2")
    }

    @Test
    fun `WHEN passwords match EXPECT call new user creation in repository`() {
        val expectedUser = User(id = 1, login = "ivan@ya.ru", password = "qwerty", email = "invan@ya.ru")
        every { userRepository.create("ivan@ya.ru", "ivan@ya.ru", "pass1") } returns expectedUser

		useCase( "ivan@ya.ru", "pass1", "pass1")

		verify { userRepository.create("ivan@ya.ru", "ivan@ya.ru", "pass1") }
    }
}