package ru.kszorin.homebookkeeping.shared_user.data.datasource

import android.content.SharedPreferences
import com.google.gson.Gson
import io.mockk.*
import org.junit.Assert.assertEquals
import org.junit.Before
import org.junit.Test
import ru.kszorin.homebookkeeping.shared_user.data.model.UserModel

class UserLocalDataSourceImplTest {

	private val sharedPreferences = mockk<SharedPreferences>()
	private val sharedPreferencesEditor = mockk<SharedPreferences.Editor>()

	private val userDataSource = UserLocalDataSourceImpl(sharedPreferences, Gson())

	@Before
	fun setUp() {
		every { sharedPreferences.edit() } returns sharedPreferencesEditor
		every { sharedPreferencesEditor.putInt(any(), any()) } returns sharedPreferencesEditor
		every { sharedPreferencesEditor.putString(any(), any()) } returns sharedPreferencesEditor
		every { sharedPreferencesEditor.apply() } just Runs
	}

	@Test
	fun `WHEN create new user EXPECT save new last id value`() {
		every { sharedPreferences.getInt("LAST_USER_ID", -1) } returns 1

		userDataSource.create(login = "ivan",
							  email = "ivan@ya.ru",
							  password = "qwerty")

		verify { sharedPreferencesEditor.putInt("LAST_USER_ID", 2) }
	}

	@Test
	fun `WHEN create new user EXPECT return new userModel`() {
		every { sharedPreferences.getInt("LAST_USER_ID", -1) } returns 1
		val expectedUserModel = UserModel(id = 2,
										  login = "ivan",
										  email = "ivan@ya.ru",
										  password = "qwerty")

		val actualUserModel = userDataSource.create(login = "ivan",
													email = "ivan@ya.ru",
													password = "qwerty")

		assertEquals(expectedUserModel, actualUserModel)
	}

	@Test
	fun `WHEN create new user EXPECT save it`() {
		every { sharedPreferences.getInt("LAST_USER_ID", -1) } returns 1
		val gsonUserModel = "{\"id\":2,\"login\":\"ivan\",\"email\":\"ivan@ya.ru\",\"password\":\"qwerty\"}"

		val userDataSource = UserLocalDataSourceImpl(sharedPreferences, Gson())
		userDataSource.create(login = "ivan",
							  email = "ivan@ya.ru",
							  password = "qwerty")

		verify { sharedPreferencesEditor.putString("2", gsonUserModel) }
	}
}