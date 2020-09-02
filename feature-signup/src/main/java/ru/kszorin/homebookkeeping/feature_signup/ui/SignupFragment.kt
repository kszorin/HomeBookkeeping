package ru.kszorin.homebookkeeping.feature_signup.ui

import android.content.Context
import android.os.Bundle
import android.view.LayoutInflater
import android.view.View
import android.view.ViewGroup
import androidx.fragment.app.Fragment
import androidx.fragment.app.viewModels
import kotlinx.android.synthetic.main.signup_fragment.button
import kotlinx.android.synthetic.main.signup_fragment.email
import kotlinx.android.synthetic.main.signup_fragment.password
import kotlinx.android.synthetic.main.signup_fragment.passwordConfirmation
import ru.kszorin.homebookkeeping.feature_signup.R
import ru.kszorin.homebookkeeping.feature_signup.di.SignupComponentProvider
import ru.kszorin.homebookkeeping.feature_signup.presentation.viewmodel.SignupViewModel
import ru.kszorin.homebookkeeping.shared_ui.bind

class SignupFragment : Fragment() {

    private val viewModel: SignupViewModel by viewModels()

    override fun onCreateView(inflater: LayoutInflater, container: ViewGroup?, savedInstanceState: Bundle?): View? =
        inflater.inflate(R.layout.signup_fragment, container, false)

	override fun onViewCreated(view: View, savedInstanceState: Bundle?) {
		super.onViewCreated(view, savedInstanceState)
	}

	override fun onAttach(context: Context) {
		super.onAttach(context)
		(context.applicationContext as SignupComponentProvider).provideSignupComponent().inject(this)
		initListeners()
	}

	private fun initListeners() {
		viewModel.email.bind(viewLifecycleOwner, email)
		viewModel.password.bind(viewLifecycleOwner, password)
		viewModel.passwordConfirmation.bind(viewLifecycleOwner, passwordConfirmation)

		button.setOnClickListener {
			viewModel.signupUser()
		}
	}
}