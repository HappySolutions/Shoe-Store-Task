package com.example.shoestoretask.screens.login

import android.os.Bundle
import androidx.fragment.app.Fragment
import android.view.LayoutInflater
import android.view.View
import android.view.ViewGroup
import androidx.databinding.DataBindingUtil
import androidx.navigation.findNavController
import com.example.shoestoretask.R
import com.example.shoestoretask.databinding.FragmentLoginBinding
import com.example.shoestoretask.screens.login.LoginFragmentDirections.Companion.actionLoginFragmentToWelcomeFragment

class LoginFragment : Fragment() {


    override fun onCreateView(
        inflater: LayoutInflater, container: ViewGroup?,
        savedInstanceState: Bundle?
    ): View? {
        //return inflater.inflate(R.layout.fragment_login, container, false)
        val binding: FragmentLoginBinding? =
            DataBindingUtil.inflate(inflater, R.layout.fragment_login,
                container, false)
        binding?.loginB?.setOnClickListener {
                view: View -> view.findNavController().navigate(LoginFragmentDirections.actionLoginFragmentToWelcomeFragment())
        }
        binding?.regB?.setOnClickListener {
                view: View -> view.findNavController().navigate(LoginFragmentDirections.actionLoginFragmentToWelcomeFragment())
        }

        return binding?.root
    }


}