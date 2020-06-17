package ru.kszorin.homebookkeeping.shared_user.data.model

data class UserModel (
	val id: Int,
	val login: String,
	val email: String,
	val password: String,
	val pin: String? = null
)