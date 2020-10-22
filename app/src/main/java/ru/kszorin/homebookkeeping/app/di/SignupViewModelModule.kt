package ru.kszorin.homebookkeeping.app.di

import androidx.lifecycle.ViewModel
import androidx.lifecycle.ViewModelProvider
import dagger.Binds
import dagger.Module
import dagger.multibindings.IntoMap
import ru.kszorin.homebookkeeping.feature_signup.presentation.viewmodel.SignupViewModel
import ru.kszorin.homebookkeeping.feature_signup.presentation.viewmodel.ViewModelFactory

@Module
interface SignupViewModelModule {

	@Binds
	fun bindViewModelFactory(factory: ViewModelFactory): ViewModelProvider.Factory

	@Binds
	@IntoMap
	@ViewModelKey(SignupViewModel::class)
	fun bindViewModel(viewModel: SignupViewModel): ViewModel

}