package ru.kszorin.homebookkeeping.feature_signup.di

import dagger.Subcomponent
import ru.kszorin.homebookkeeping.feature_signup.ui.SignupFragment

@Subcomponent
interface SignupComponent {

	@Subcomponent.Factory
	interface Factory {
		fun createComponent(): SignupComponent
	}

	fun inject(signupFragment: SignupFragment)
}