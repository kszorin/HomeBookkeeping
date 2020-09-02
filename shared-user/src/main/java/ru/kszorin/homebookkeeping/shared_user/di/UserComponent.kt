package ru.kszorin.homebookkeeping.shared_user.di

import dagger.Subcomponent

@Subcomponent(modules = [UserModule::class])
interface UserComponent {

	@Subcomponent.Factory
	interface Factory {
		fun createComponent(): UserComponent
	}
}