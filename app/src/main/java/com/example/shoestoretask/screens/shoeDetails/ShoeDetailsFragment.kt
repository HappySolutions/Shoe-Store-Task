package com.example.shoestoretask.screens.shoeDetails

import android.os.Bundle
import androidx.fragment.app.Fragment
import android.view.LayoutInflater
import android.view.View
import android.view.ViewGroup
import android.widget.Toast
import androidx.databinding.DataBindingUtil
import androidx.lifecycle.ViewModelProvider
import androidx.navigation.findNavController
import com.example.shoestoretask.R
import com.example.shoestoretask.ShoeViewModel
import com.example.shoestoretask.databinding.FragmentShoeDetailsBinding
import com.example.shoestoretask.models.Shoe


class ShoeDetailsFragment : Fragment() {
    private lateinit var viewModel: ShoeViewModel

    override fun onCreateView(
        inflater: LayoutInflater, container: ViewGroup?,
        savedInstanceState: Bundle?
    ): View? {
        // Inflate the layout for this fragment
        val binding: FragmentShoeDetailsBinding? =
            DataBindingUtil.inflate(inflater, R.layout.fragment_shoe_details,
                container, false)
        //call the viewModel
        viewModel = ViewModelProvider(requireActivity())[ShoeViewModel::class.java]

        var newShoe = Shoe("", 0.0, "", "")
        binding?.shoe = newShoe
        binding?.szEdtTxt?.setOnFocusChangeListener{ _, hasFocuse ->
            if(hasFocuse) binding?.szEdtTxt.text.clear()
        }

        binding?.svBtn?.setOnClickListener { view: View ->
            //adding the new shoe data
            if (binding?.nmEdtTxt?.text.toString().isEmpty())
                Toast.makeText(context, "Name Cannot be Empty", Toast.LENGTH_SHORT).show()
            else if (binding?.compEdtTxt?.text.toString().isEmpty())
                Toast.makeText(context, "Company Cannot be Empty", Toast.LENGTH_SHORT).show()
            else if (binding?.szEdtTxt?.text.toString().isEmpty())
                Toast.makeText(context, "Shoe Size Cannot be Empty", Toast.LENGTH_SHORT).show()
            else if (binding?.dscEdtTxt?.text.toString().isEmpty())
                Toast.makeText(context, "Shoe Description Cannot be Empty", Toast.LENGTH_SHORT).show()
            else {
                newShoe = binding?.shoe as Shoe
                viewModel.initList(newShoe)
                view.findNavController().navigate(ShoeDetailsFragmentDirections.actionShoeDetailsFragmentToShoeListFragment())
            }

        }
        binding?.cnclBtn?.setOnClickListener { view: View ->
            view.findNavController().navigate(ShoeDetailsFragmentDirections.actionShoeDetailsFragmentToShoeListFragment())
        }
    return binding?.root
    }

}