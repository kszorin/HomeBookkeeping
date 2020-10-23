package ru.kszorin.homebookkeeping.shared_user.data.converter

import ru.kszorin.homebookkeeping.shared_user.data.model.UserModel
import ru.kszorin.homebookkeeping.shared_user.domain.entity.User
import javax.inject.Inject

class UserConverter @Inject constructor(){

	fun convertToEntity(model: UserModel): User =
		User(
			id = model.id,
			login = model.login,
			email = model.email,
			password = model.password,
			pin = model.pin
		)

	fun convertToModel(entity: User): UserModel =
		UserModel(
			id = entity.id,
			login = entity.login,
			email = entity.email,
			password = entity.password,
			pin = entity.pin
		)

}