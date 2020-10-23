package ru.kszorin.homebookkeeping.app.di

import dagger.Module

@Module(includes = [
	GsonModule::class,
	SharedPreferencesModule::class,
	UserModule::class
])
interface DataModule