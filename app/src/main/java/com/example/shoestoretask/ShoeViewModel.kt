package com.example.shoestoretask

import android.util.Log
import androidx.lifecycle.LiveData
import androidx.lifecycle.MutableLiveData
import androidx.lifecycle.ViewModel
import com.example.shoestoretask.models.Shoe

class ShoeViewModel : ViewModel() {
    private val _shoeList = MutableLiveData<List<Shoe>>()
    val shoeList: LiveData<List<Shoe>>
    get() = _shoeList

    init{
        Log.i("ShoeViewmodel", "ShoeViewmodel created")
        initList()
    }

        fun addshoe (name: String, size: Double, company: String, description: String){
//        _shoeList.value = _shoeList?.plus(
//            Shoe(name, size, company, description)
//        )
    }
    override fun onCleared() {
        super.onCleared()
        Log.i("ShoeViewmodel", "ShoeViewmodel destroid")
    }

    private fun initList() {
        _shoeList.value = listOf()
        for (i in 2 downTo 1){
            addshoe("Shoe#$i" , 40.0, "company #$i", "this is the shoe #$i in list")
        }
    }
}