package com.example.shoestoretask

import android.util.Log
import androidx.lifecycle.MutableLiveData
import androidx.lifecycle.ViewModel
import com.example.shoestoretask.models.Shoe

class ShoeViewModel : ViewModel() {
    val shoeListLiveData = MutableLiveData<ArrayList<Shoe>>()
    var shoeList = ArrayList<Shoe>()
    init{
        Log.i("ShoeViewmodel", "ShoeViewmodel created")
    }

    override fun onCleared() {
        super.onCleared()
        Log.i("ShoeViewmodel", "ShoeViewmodel destroid")
    }
}