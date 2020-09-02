package ru.kszorin.homebookkeeping.app.di

import dagger.Component
import ru.kszorin.homebookkeeping.feature_signup.di.SignupComponent

@Component(modules = [SubcomponentsModule::class])
interface ApplicationComponent {

	fun getSignupComponentFactory(): SignupComponent.Factory
}