package com.example.shoestoretask.screens.shoeList

import android.os.Bundle
import android.util.Log
import android.view.*
import androidx.fragment.app.Fragment
import androidx.databinding.DataBindingUtil
import androidx.navigation.findNavController
import androidx.navigation.ui.NavigationUI
import com.example.shoestoretask.R
import com.example.shoestoretask.databinding.FragmentShoeDetailsBinding
import com.example.shoestoretask.databinding.FragmentShoeListBinding
import com.example.shoestoretask.screens.welcome.WelcomeFragmentDirections


class ShoeListFragment : Fragment() {
    override fun onCreateView(
        inflater: LayoutInflater, container: ViewGroup?,
        savedInstanceState: Bundle?
    ): View? {
        // Inflate the layout for this fragment
        val binding: FragmentShoeListBinding? =
            DataBindingUtil.inflate(inflater, R.layout.fragment_shoe_list,
                container, false)
        binding?.addBotn?.setOnClickListener { view: View -> Log.i("loginFragment", "test the first button")
            view.findNavController().navigate(ShoeListFragmentDirections.actionShoeListFragmentToShoeDetailsFragment())
        }
        setHasOptionsMenu(true)
        return binding?.root
    }

    override fun onCreateOptionsMenu(menu: Menu, inflater: MenuInflater) {
        inflater.inflate(R.menu.menu, menu)
    }


    override fun onOptionsItemSelected(item: MenuItem): Boolean {
        return NavigationUI.onNavDestinationSelected(item, requireView().findNavController() ) || super.onOptionsItemSelected(item)
    }
}