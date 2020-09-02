package ru.kszorin.homebookkeeping.app.di

import dagger.Module
import ru.kszorin.homebookkeeping.feature_signup.di.SignupComponent
import ru.kszorin.homebookkeeping.shared_user.di.UserComponent

@Module(subcomponents = [SignupComponent::class, UserComponent::class])
class SubcomponentsModule {
}