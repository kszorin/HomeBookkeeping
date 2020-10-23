package ru.kszorin.homebookkeeping.app

import android.app.Application
import dagger.android.AndroidInjector
import dagger.android.DispatchingAndroidInjector
import dagger.android.HasAndroidInjector
import ru.kszorin.homebookkeeping.app.di.DaggerApplicationComponent
import javax.inject.Inject

class HomeBookkeepingApplication : Application(), HasAndroidInjector {

	@Inject
	lateinit var dispatchingAndroidInjector: DispatchingAndroidInjector<Any>

	override fun androidInjector(): AndroidInjector<Any> =
		dispatchingAndroidInjector

	override fun onCreate() {
		super.onCreate()
		DaggerApplicationComponent.builder()
			.context(this)
			.create(this)
			.inject(this)
	}

}