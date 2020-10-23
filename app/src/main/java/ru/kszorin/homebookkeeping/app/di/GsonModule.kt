package ru.kszorin.homebookkeeping.app.di

import com.google.gson.Gson
import com.google.gson.GsonBuilder
import dagger.Module
import dagger.Provides

@Module
abstract class GsonModule {

	@Module
	companion object {
		@JvmStatic
		@Provides
		fun provideGson(): Gson = GsonBuilder().create()
	}
}