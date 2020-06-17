package ru.kszorin.homebookkeeping.shared_user.domain.repository

import ru.kszorin.homebookkeeping.shared_user.domain.entity.User

interface UserRepository {

    fun create(login: String, email: String, password: String): User
}