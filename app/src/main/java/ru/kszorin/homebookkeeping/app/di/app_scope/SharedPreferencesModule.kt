package ru.kszorin.homebookkeeping.app.di.app_scope

import android.content.Context
import android.content.SharedPreferences
import dagger.Module
import dagger.Provides

@Module
class SharedPreferencesModule {

	@Provides
	fun providePreferences(context: Context): SharedPreferences =
		context.getSharedPreferences("preferencesFile", Context.MODE_PRIVATE)
}