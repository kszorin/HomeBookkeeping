package ru.kszorin.homebookkeeping.app.di.app_scope

import dagger.Module

@Module(includes = [
	GsonModule::class,
	SharedPreferencesModule::class,
	UserModule::class
])
interface DataModule