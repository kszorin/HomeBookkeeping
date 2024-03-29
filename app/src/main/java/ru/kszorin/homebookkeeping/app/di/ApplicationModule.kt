package ru.kszorin.homebookkeeping.app.di

import dagger.Module
import dagger.android.AndroidInjectionModule
import dagger.android.ContributesAndroidInjector
import ru.kszorin.homebookkeeping.app.di.activity_scope.MainActivityModule
import ru.kszorin.homebookkeeping.app.ui.MainActivity

@Module(includes = [AndroidInjectionModule::class])
interface ApplicationModule {

	@ActivityScope
	@ContributesAndroidInjector(modules = [MainActivityModule::class])
	fun provideMainActivity(): MainActivity
}