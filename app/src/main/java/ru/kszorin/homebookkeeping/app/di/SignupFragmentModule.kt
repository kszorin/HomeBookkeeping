package ru.kszorin.homebookkeeping.app.di

import dagger.Module
import dagger.android.ContributesAndroidInjector
import ru.kszorin.homebookkeeping.feature_signup.ui.SignupFragment

@Module
interface SignupFragmentModule {
	@ContributesAndroidInjector(modules = [SignupViewModelModule::class])
	fun provideSignupFragment(): SignupFragment
}