package com.example.shoestoretask

import android.util.Log
import androidx.lifecycle.MutableLiveData
import androidx.lifecycle.ViewModel
import com.example.shoestoretask.models.Shoe

class ShoeViewModel : ViewModel() {
    val shoeListLivedata = MutableLiveData<ArrayList<Shoe>>()
    val shoeList = ArrayList<Shoe>()

    init{
        Log.i("ShoeViewmodel", "ShoeViewmodel created")
    }

    override fun onCleared() {
        super.onCleared()
        Log.i("ShoeViewmodel", "ShoeViewmodel destroid")
    }

     fun initList(shoe: Shoe) {
        shoeList.add(shoe)
        shoeListLivedata.value = shoeList
    }
    }
