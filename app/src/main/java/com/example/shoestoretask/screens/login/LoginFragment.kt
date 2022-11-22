package com.example.shoestoretask.screens.login

import android.os.Bundle
import android.util.Log
import androidx.fragment.app.Fragment
import android.view.LayoutInflater
import android.view.View
import android.view.ViewGroup
import androidx.databinding.DataBindingUtil
import androidx.navigation.findNavController
import com.example.shoestoretask.R
import com.example.shoestoretask.databinding.FragmentLoginBinding
import com.example.shoestoretask.screens.login.LoginFragmentDirections.Companion.actionLoginFragmentToWelcomeFragment
import com.google.android.material.dialog.MaterialAlertDialogBuilder

class LoginFragment : Fragment() {

    private lateinit var binding: FragmentLoginBinding

    override fun onCreateView(
        inflater: LayoutInflater, container: ViewGroup?,
        savedInstanceState: Bundle?
    ): View? {
        //return inflater.inflate(R.layout.fragment_login, container, false)
        binding =
            DataBindingUtil.inflate(inflater, R.layout.fragment_login,
                container, false)
       binding?.loginB?.setOnClickListener { view: View -> Log.i("loginFragment", "test the first button")
            view.findNavController().navigate(LoginFragmentDirections.actionLoginFragmentToWelcomeFragment())
        }
        Log.i("loginFragment", "test the second button")
        binding?.regB?.setOnClickListener {
                view: View -> view.findNavController().navigate(LoginFragmentDirections.actionLoginFragmentToWelcomeFragment())
    }

        return binding.root

    }

}