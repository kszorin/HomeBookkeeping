package ru.kszorin.homebookkeeping.feature_signup.ui

import android.content.Context
import android.os.Bundle
import android.view.LayoutInflater
import android.view.View
import android.view.ViewGroup
import androidx.fragment.app.Fragment
import androidx.lifecycle.ViewModelProvider
import dagger.android.support.AndroidSupportInjection
import kotlinx.android.synthetic.main.signup_fragment.email
import kotlinx.android.synthetic.main.signup_fragment.password
import kotlinx.android.synthetic.main.signup_fragment.passwordConfirmation
import ru.kszorin.homebookkeeping.feature_signup.R
import ru.kszorin.homebookkeeping.feature_signup.presentation.viewmodel.SignupViewModel
import ru.kszorin.homebookkeeping.feature_signup.presentation.viewmodel.ViewModelFactory
import ru.kszorin.homebookkeeping.shared_ui.bind
import javax.inject.Inject

class SignupFragment : Fragment() {

	@Inject
	lateinit var viewModelFactory: ViewModelFactory

	private lateinit var viewModel: SignupViewModel

    override fun onCreateView(inflater: LayoutInflater, container: ViewGroup?, savedInstanceState: Bundle?): View? =
        inflater.inflate(R.layout.signup_fragment, container, false)

	override fun onViewCreated(view: View, savedInstanceState: Bundle?) {
		super.onViewCreated(view, savedInstanceState)
		viewModel = ViewModelProvider(this, viewModelFactory).get(SignupViewModel::class.java)
		initListeners()
	}

	private fun initListeners() {
		viewModel.email.bind(viewLifecycleOwner, email)
		viewModel.password.bind(viewLifecycleOwner, password)
		viewModel.passwordConfirmation.bind(viewLifecycleOwner, passwordConfirmation)
	}

	override fun onAttach(context: Context) {
		AndroidSupportInjection.inject(this)
		super.onAttach(context)
	}
}