package ru.kszorin.homebookkeeping.app.di.app_scope

import dagger.Binds
import dagger.Module
import ru.kszorin.homebookkeeping.shared_user.data.datasource.UserDataSource
import ru.kszorin.homebookkeeping.shared_user.data.datasource.UserLocalDataSourceImpl
import ru.kszorin.homebookkeeping.shared_user.data.repository.UserRepositoryImpl
import ru.kszorin.homebookkeeping.shared_user.domain.repository.UserRepository

@Module
interface UserModule {

	@Binds
	fun bindUserDataSource(userLocalDataSourceImpl: UserLocalDataSourceImpl): UserDataSource

	@Binds
	fun bindUserRepository(userRepositoryImpl: UserRepositoryImpl): UserRepository

}