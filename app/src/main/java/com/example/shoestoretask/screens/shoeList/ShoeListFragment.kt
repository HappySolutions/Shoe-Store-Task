package com.example.shoestoretask.screens.shoeList

import android.os.Bundle
import androidx.fragment.app.Fragment
import android.view.LayoutInflater
import android.view.View
import android.view.ViewGroup
import androidx.databinding.DataBindingUtil
import com.example.shoestoretask.R
import com.example.shoestoretask.databinding.FragmentShoeDetailsBinding


class ShoeListFragment : Fragment() {
    override fun onCreateView(
        inflater: LayoutInflater, container: ViewGroup?,
        savedInstanceState: Bundle?
    ): View? {
        // Inflate the layout for this fragment
        val binding: FragmentShoeDetailsBinding? =
            DataBindingUtil.inflate(inflater, R.layout.fragment_shoe_list,
                container, false)
        return binding?.root
    }

}