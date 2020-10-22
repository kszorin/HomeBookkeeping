package ru.kszorin.homebookkeeping.app.ui

import android.os.Bundle
import androidx.appcompat.app.AppCompatActivity
import dagger.android.AndroidInjection
import dagger.android.AndroidInjector
import dagger.android.DispatchingAndroidInjector
import dagger.android.HasAndroidInjector
import ru.kszorin.homebookkeeping.R
import ru.kszorin.homebookkeeping.feature_signup.ui.SignupFragment
import javax.inject.Inject

class MainActivity : AppCompatActivity(), HasAndroidInjector {

	@Inject
	lateinit var dispatchingAndroidInjector: DispatchingAndroidInjector<Any>

	override fun androidInjector(): AndroidInjector<Any> =
		dispatchingAndroidInjector

	override fun onCreate(savedInstanceState: Bundle?) {
		AndroidInjection.inject(this)
		super.onCreate(savedInstanceState)
		setContentView(R.layout.main_activity)

		supportFragmentManager
			.beginTransaction()
			.add(R.id.fragment_container, SignupFragment())
			.commit()
	}
}