package ru.kszorin.homebookkeeping.shared_user.data.datasource

import android.content.SharedPreferences
import com.google.gson.Gson
import ru.kszorin.homebookkeeping.shared_user.data.model.UserModel
import javax.inject.Inject

class UserLocalDataSourceImpl @Inject constructor(
	private val userPreferences: SharedPreferences,
	private val gson: Gson
) : UserDataSource {
	private companion object {
		const val lastUserIdKey = "LAST_USER_ID"
	}

	override fun create(login: String, email: String, password: String): UserModel {
		val nextId = userPreferences.getInt(lastUserIdKey, -1) + 1

		val newUserModel = UserModel(nextId, login, email, password)
		with(userPreferences.edit()) {
			putInt(lastUserIdKey, nextId)
			putString(nextId.toString(), gson.toJson(newUserModel))
			apply()
		}
		return newUserModel
	}
}