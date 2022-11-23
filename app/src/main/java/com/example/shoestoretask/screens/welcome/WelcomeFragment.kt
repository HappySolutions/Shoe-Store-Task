package com.example.shoestoretask.screens.welcome

import android.os.Bundle
import android.util.Log
import androidx.fragment.app.Fragment
import android.view.LayoutInflater
import android.view.View
import android.view.ViewGroup
import androidx.databinding.DataBindingUtil
import androidx.databinding.ViewDataBinding
import androidx.navigation.findNavController
import com.example.shoestoretask.R
import com.example.shoestoretask.databinding.FragmentLoginBinding
import com.example.shoestoretask.databinding.FragmentWelcomeBinding
import com.example.shoestoretask.screens.login.LoginFragmentDirections


class WelcomeFragment : Fragment() {
    private lateinit var binding: FragmentWelcomeBinding

    override fun onCreateView(
        inflater: LayoutInflater, container: ViewGroup?,
        savedInstanceState: Bundle?
    ): View? {
        // Inflate the layout for this fragment
        binding =
            DataBindingUtil.inflate(inflater, R.layout.fragment_welcome,
                container, false)

        binding?.nxtBtn?.setOnClickListener { view: View -> Log.i("loginFragment", "test the first button")
            view.findNavController().navigate(WelcomeFragmentDirections.actionWelcomeFragmentToInstructionsFragment())
        }
        return binding?.root

}
}