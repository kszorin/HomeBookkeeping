package ru.kszorin.homebookkeeping.app

import android.app.Application
import ru.kszorin.homebookkeeping.app.di.DaggerApplicationComponent
import ru.kszorin.homebookkeeping.feature_signup.di.SignupComponent
import ru.kszorin.homebookkeeping.feature_signup.di.SignupComponentProvider

class HomeBookkeepingApplication: Application(), SignupComponentProvider {

    private val appComponent = DaggerApplicationComponent.create()

    override fun provideSignupComponent(): SignupComponent =
        appComponent.getSignupComponentFactory().createComponent()
}