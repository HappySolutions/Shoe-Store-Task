package com.example.shoestoretask.screens.shoeDetails

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
import com.example.shoestoretask.databinding.FragmentShoeDetailsBinding
import com.example.shoestoretask.screens.welcome.WelcomeFragmentDirections


class ShoeDetailsFragment : Fragment() {

    override fun onCreateView(
        inflater: LayoutInflater, container: ViewGroup?,
        savedInstanceState: Bundle?
    ): View? {
        // Inflate the layout for this fragment
        val binding: FragmentShoeDetailsBinding? =
            DataBindingUtil.inflate(inflater, R.layout.fragment_shoe_details,
                container, false)
        binding?.svBtn?.setOnClickListener { view: View ->
            view.findNavController().navigate(ShoeDetailsFragmentDirections.actionShoeDetailsFragmentToShoeListFragment())
        }
        binding?.cnclBtn?.setOnClickListener { view: View ->
            view.findNavController().navigate(ShoeDetailsFragmentDirections.actionShoeDetailsFragmentToShoeListFragment())
        }
    return binding?.root
    }

}