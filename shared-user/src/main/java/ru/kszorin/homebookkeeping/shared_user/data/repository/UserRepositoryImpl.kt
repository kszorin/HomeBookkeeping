package ru.kszorin.homebookkeeping.shared_user.data.repository

import ru.kszorin.homebookkeeping.shared_user.data.converter.UserConverter
import ru.kszorin.homebookkeeping.shared_user.data.datasource.UserDataSource
import ru.kszorin.homebookkeeping.shared_user.domain.entity.User
import ru.kszorin.homebookkeeping.shared_user.domain.repository.UserRepository

class UserRepositoryImpl(
    private val userDataSource: UserDataSource,
    private val userConverter: UserConverter
) : UserRepository {

	override fun create(login: String, email: String, password: String): User =
		userDataSource.create(login, email, password).let {
			userConverter.convertToEntity(it)
		}
}