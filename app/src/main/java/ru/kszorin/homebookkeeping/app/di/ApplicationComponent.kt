package ru.kszorin.homebookkeeping.app.di

import android.content.Context
import dagger.BindsInstance
import dagger.Component
import dagger.android.AndroidInjector
import ru.kszorin.homebookkeeping.app.HomeBookkeepingApplication
import ru.kszorin.homebookkeeping.app.di.app_scope.DataModule

@AppScope
@Component(
	modules = [
		ApplicationModule::class,
		DataModule::class
	]
)
interface ApplicationComponent : AndroidInjector<HomeBookkeepingApplication> {

	@Suppress("DEPRECATION")
	@Component.Builder
	abstract class Builder : AndroidInjector.Builder<HomeBookkeepingApplication>() {

		@BindsInstance
		abstract fun context(context: Context): Builder

	}
}