package com.example.shoestoretask

import android.os.Bundle
import android.widget.Toast
import androidx.appcompat.app.AppCompatActivity
import androidx.databinding.DataBindingUtil
import androidx.databinding.ViewDataBinding
import com.example.shoestoretask.R
import com.example.shoestoretask.databinding.ActivityMainBinding

class MainActivity : AppCompatActivity() {

    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        val binding = DataBindingUtil.setContentView<ViewDataBinding>(this, R.layout.activity_main)
       // DataBindingUtil.setContentView<ActivityMainBinding>(this, R.layout.activity_main)

    }

}