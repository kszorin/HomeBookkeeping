package ru.kszorin.homebookkeeping.shared_user.di

import dagger.Binds
import dagger.Module
import ru.kszorin.homebookkeeping.shared_user.data.repository.UserRepositoryImpl
import ru.kszorin.homebookkeeping.shared_user.domain.repository.UserRepository

@Module
interface UserModule {

	@Binds
	fun bindUserRepository(userRepositoryImpl: UserRepositoryImpl): UserRepository

	/*@Binds
	fun bindUserDataSource(userLocalDataSourceImpl: UserLocalDataSourceImpl): UserDataSource*/
}