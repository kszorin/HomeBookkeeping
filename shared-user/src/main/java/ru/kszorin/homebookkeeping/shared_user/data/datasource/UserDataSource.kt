package ru.kszorin.homebookkeeping.shared_user.data.datasource

import ru.kszorin.homebookkeeping.shared_user.data.model.UserModel

interface UserDataSource {

	fun create(login: String, email: String, password: String): UserModel

}