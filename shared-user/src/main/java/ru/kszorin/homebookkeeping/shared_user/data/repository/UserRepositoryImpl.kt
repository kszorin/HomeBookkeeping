package ru.kszorin.homebookkeeping.shared_user.data.repository

import ru.kszorin.homebookkeeping.shared_user.domain.entity.User
import ru.kszorin.homebookkeeping.shared_user.domain.repository.UserRepository
import javax.inject.Inject

class UserRepositoryImpl @Inject constructor(
    /*private val userDataSource: UserDataSource,
    private val userConverter: UserConverter*/
) : UserRepository {

	override fun create(login: String, email: String, password: String): User =
	TODO()
	/*userDataSource.create(login, email, password).let {
			userConverter.convertToEntity(it)
		}*/
}