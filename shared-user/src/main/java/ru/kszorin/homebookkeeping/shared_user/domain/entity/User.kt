package ru.kszorin.homebookkeeping.shared_user.domain.entity

data class User(
    val id: Int,
    val login: String,
    val email: String,
    val password: String,
    val pin: String? = null
)