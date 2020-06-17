package ru.kszorin.homebookkeeping.shared_user.data.repository

import io.mockk.every
import io.mockk.mockk
import org.junit.Assert.assertEquals
import org.junit.Test
import ru.kszorin.homebookkeeping.shared_user.data.converter.UserConverter
import ru.kszorin.homebookkeeping.shared_user.data.datasource.UserDataSource
import ru.kszorin.homebookkeeping.shared_user.data.model.UserModel
import ru.kszorin.homebookkeeping.shared_user.domain.entity.User

class UserRepositoryImplTest {

	private val userDataSource = mockk<UserDataSource>()
	private val userConverter = mockk<UserConverter>()
	private val userRepository = UserRepositoryImpl(userDataSource, userConverter)

	private val userModel = UserModel(
		id = 1,
		login = "ivan",
		password = "qwerty",
		email = "ivan@ya.ru",
		pin = "1234"
	)

	val user = User(
		id = 1,
		login = "ivan",
		password = "qwerty",
		email = "ivan@ya.ru",
		pin = "1234"
	)

	@Test
	fun `WHEN create user EXPECT converted user from data source`() {
		every { userDataSource.create(login = "ivan", email = "ivan@ya.ru", password = "qwerty") } returns userModel
		every { userConverter.convertToEntity(userModel) } returns user

		val actualEntity = userRepository.create(login = "ivan", email = "ivan@ya.ru", password = "qwerty")

		assertEquals(user, actualEntity)
	}
}