package com.example.shoestoretask.screens.shoeList

import android.os.Bundle
import android.view.*
import androidx.fragment.app.Fragment
import androidx.databinding.DataBindingUtil
import androidx.lifecycle.ViewModelProvider
import androidx.navigation.findNavController
import androidx.navigation.fragment.findNavController
import com.example.shoestoretask.R
import com.example.shoestoretask.ShoeViewModel
import com.example.shoestoretask.databinding.FragmentShoeItemsBinding
import com.example.shoestoretask.databinding.FragmentShoeListBinding


class ShoeListFragment : Fragment() {
    private lateinit var viewModel: ShoeViewModel

    override fun onCreateView(
        inflater: LayoutInflater, container: ViewGroup?,
        savedInstanceState: Bundle?
    ): View? {
        // Inflate the layout for this fragment
        val binding: FragmentShoeListBinding? =
            DataBindingUtil.inflate(inflater, R.layout.fragment_shoe_list,
                container, false)

        //call the viewModel
        viewModel = ViewModelProvider(requireActivity())[ShoeViewModel::class.java]

        binding?.addBotn?.setOnClickListener { view: View ->
            view.findNavController().navigate(ShoeListFragmentDirections.actionShoeListFragmentToShoeDetailsFragment())
        }
        val linearLayoutView = binding?.linearLayout

        //observe the viewmodel
        viewModel.shoeListLivedata.observe(viewLifecycleOwner){ shoeList ->
            for (i in 0 until shoeList.size){
                val view: FragmentShoeItemsBinding = DataBindingUtil.inflate(inflater,
                    R.layout.fragment_shoe_items, linearLayoutView ,false)
                view.shoe = shoeList[i]

                //add the linear view programmatically
                linearLayoutView?.addView(view.root)
            }

        }
        setHasOptionsMenu(true)
        return binding?.root
    }

    override fun onCreateOptionsMenu(menu: Menu, inflater: MenuInflater) {
        inflater.inflate(R.menu.menu, menu)
    }


    override fun onOptionsItemSelected(item: MenuItem): Boolean {
        findNavController().navigate(R.id.action_shoeListFragment_to_loginFragment)
        return  super.onOptionsItemSelected(item)
    }
}