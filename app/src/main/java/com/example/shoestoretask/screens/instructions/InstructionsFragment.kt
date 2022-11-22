package com.example.shoestoretask.screens.instructions

import android.os.Bundle
import androidx.fragment.app.Fragment
import android.view.LayoutInflater
import android.view.View
import android.view.ViewGroup
import androidx.databinding.DataBindingUtil
import androidx.databinding.ViewDataBinding
import androidx.navigation.Navigation
import com.example.shoestoretask.R
import com.example.shoestoretask.databinding.FragmentInstructionsBinding
import com.example.shoestoretask.databinding.FragmentShoeDetailsBinding


class InstructionsFragment : Fragment() {

    override fun onCreateView(
        inflater: LayoutInflater, container: ViewGroup?,
        savedInstanceState: Bundle?
    ): View? {
        // Inflate the layout for this fragment
        val binding: FragmentShoeDetailsBinding? =
            DataBindingUtil.inflate(inflater, R.layout.fragment_shoe_details,
                container, false)
//        binding.instNxtBtn.setOnClickListener(
//            Navigation.createNavigateOnClickListener(R.id.action_instructionsFragment_to_shoeListFragment)
  //      )

        return binding?.root
    }

}