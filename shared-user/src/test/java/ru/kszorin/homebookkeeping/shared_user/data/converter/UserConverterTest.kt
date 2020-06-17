package ru.kszorin.homebookkeeping.shared_user.data.converter

import org.junit.Assert.assertEquals
import org.junit.Test
import ru.kszorin.homebookkeeping.shared_user.domain.entity.User

class UserConverterTest {

	private val userConverter = UserConverter()

	@Test
	fun `WHEN convert from model EXPECT correct entity`() {
		val model = ru.kszorin.homebookkeeping.shared_user.data.model.UserModel(
			id = 1,
			login = "ivan",
			email = "ivan@ya.ru",
			password = "qwerty",
			pin = "1234"
		)

		val expectedEntity = User(
			id = 1,
			login = "ivan",
			email = "ivan@ya.ru",
			password = "qwerty",
			pin = "1234"
		)

		val actualEntity = userConverter.convertToEntity(model)

		assertEquals(expectedEntity,actualEntity)
	}

	@Test
	fun `WHEN convert from model with null pin EXPECT entity with null pin`() {
		val model = ru.kszorin.homebookkeeping.shared_user.data.model.UserModel(
			id = 1,
			login = "ivan",
			email = "ivan@ya.ru",
			password = "qwerty",
			pin = null
		)

		val expectedEntity = User(
			id = 1,
			login = "ivan",
			email = "ivan@ya.ru",
			password = "qwerty",
			pin = null
		)

		val actualEntity = userConverter.convertToEntity(model)

		assertEquals(expectedEntity,actualEntity)
	}

	@Test
	fun `WHEN convert from entity EXPECT correct model`() {
		val entity = User(
			id = 1,
			login = "ivan",
			email = "ivan@ya.ru",
			password = "qwerty",
			pin = "1234"
		)

		val expectedModel =
			ru.kszorin.homebookkeeping.shared_user.data.model.UserModel(
				id = 1,
				login = "ivan",
				email = "ivan@ya.ru",
				password = "qwerty",
				pin = "1234"
			)

		val actualModel = userConverter.convertToModel(entity)

		assertEquals(expectedModel,actualModel)
	}

	@Test
	fun `WHEN convert from entity with null pin EXPECT model with null pin`() {
		val entity = User(
			id = 1,
			login = "ivan",
			email = "ivan@ya.ru",
			password = "qwerty",
			pin = null
		)

		val expectedModel =
			ru.kszorin.homebookkeeping.shared_user.data.model.UserModel(
				id = 1,
				login = "ivan",
				email = "ivan@ya.ru",
				password = "qwerty",
				pin = null
			)

		val actualModel = userConverter.convertToModel(entity)

		assertEquals(expectedModel,actualModel)
	}
}