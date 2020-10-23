package ru.kszorin.homebookkeeping.app.ui

import android.os.Bundle
import androidx.appcompat.app.AppCompatActivity
import ru.kszorin.homebookkeeping.R
import ru.kszorin.homebookkeeping.feature_signup.ui.SignupFragment

class MainActivity : AppCompatActivity() {

	override fun onCreate(savedInstanceState: Bundle?) {
		super.onCreate(savedInstanceState)
		setContentView(R.layout.main_activity)

		supportFragmentManager
			.beginTransaction()
			.add(R.id.fragment_container, SignupFragment())
			.commit()
	}
}