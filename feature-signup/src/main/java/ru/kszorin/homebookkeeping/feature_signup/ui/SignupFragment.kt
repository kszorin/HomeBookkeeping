package ru.kszorin.homebookkeeping.feature_signup.ui

import android.os.Bundle
import android.view.LayoutInflater
import android.view.View
import android.view.ViewGroup
import androidx.databinding.DataBindingUtil
import androidx.fragment.app.Fragment
import androidx.fragment.app.viewModels
import ru.kszorin.homebookkeeping.feature_signup.R
import ru.kszorin.homebookkeeping.feature_signup.databinding.SignupFragmentBinding
import ru.kszorin.homebookkeeping.feature_signup.presentation.viewmodel.SignupViewModel

class SignupFragment : Fragment() {

    private val viewModel: SignupViewModel by viewModels()

	override fun onCreateView(inflater: LayoutInflater, container: ViewGroup?, savedInstanceState: Bundle?): View? {
        val dataBinding = DataBindingUtil.inflate<SignupFragmentBinding>(inflater, R.layout.signup_fragment, container, false)
		dataBinding.setLifecycleOwner(this)
		dataBinding.bindingViewModel = viewModel
		return dataBinding.root
	}
}