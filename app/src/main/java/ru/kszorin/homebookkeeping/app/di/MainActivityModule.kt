package ru.kszorin.homebookkeeping.app.di

import android.app.Activity
import dagger.Binds
import dagger.Module
import ru.kszorin.homebookkeeping.app.ui.MainActivity

@Module(includes = [SignupFragmentModule::class])
interface MainActivityModule {

	@Binds
	fun bindActivity(activity: MainActivity): Activity

}

