package ru.kszorin.homebookkeeping.app.di

import dagger.Component
import dagger.android.AndroidInjector
import ru.kszorin.homebookkeeping.app.HomeBookkeepingApplication

@Component(modules = [ApplicationModule::class])
interface ApplicationComponent : AndroidInjector<HomeBookkeepingApplication>