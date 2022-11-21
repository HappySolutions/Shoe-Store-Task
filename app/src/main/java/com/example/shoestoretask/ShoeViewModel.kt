package com.example.shoestoretask

import androidx.lifecycle.MutableLiveData
import androidx.lifecycle.ViewModel
import com.example.shoestoretask.models.Shoe

class ShoeViewModel : ViewModel() {
    val shoeListLiveData = MutableLiveData<ArrayList<Shoe>>()
    var shoeList = ArrayList<Shoe>()


}