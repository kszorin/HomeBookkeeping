package ru.kszorin.homebookkeeping.app.di.fragment_scope

import dagger.Module
import dagger.android.ContributesAndroidInjector
import ru.kszorin.homebookkeeping.app.di.FragmentScope
import ru.kszorin.homebookkeeping.feature_signup.ui.SignupFragment

@Module
interface SignupFragmentModule {

	@FragmentScope
	@ContributesAndroidInjector(modules = [SignupViewModelModule::class])
	fun provideSignupFragment(): SignupFragment
}