package com.example.shoestoretask.screens.instructions

import android.os.Bundle
import android.util.Log
import androidx.fragment.app.Fragment
import android.view.LayoutInflater
import android.view.View
import android.view.ViewGroup
import androidx.databinding.DataBindingUtil
import androidx.databinding.ViewDataBinding
import androidx.navigation.Navigation
import androidx.navigation.findNavController
import com.example.shoestoretask.R
import com.example.shoestoretask.databinding.FragmentInstructionsBinding
import com.example.shoestoretask.databinding.FragmentShoeDetailsBinding
import com.example.shoestoretask.databinding.FragmentWelcomeBinding
import com.example.shoestoretask.screens.welcome.WelcomeFragmentDirections


class InstructionsFragment : Fragment() {
//    private lateinit var binding: FragmentInstructionsBinding

    override fun onCreateView(
        inflater: LayoutInflater, container: ViewGroup?,
        savedInstanceState: Bundle?
    ): View? {
        // Inflate the layout for this fragment
        val binding: FragmentInstructionsBinding? =
            DataBindingUtil.inflate(inflater, R.layout.fragment_instructions,
                container, false)
        binding?.instNxtBtn?.setOnClickListener { view: View -> Log.i("loginFragment", "test the first button")
            view.findNavController().navigate(InstructionsFragmentDirections.actionInstructionsFragmentToShoeListFragment())
        }
        return binding?.root

    }

}