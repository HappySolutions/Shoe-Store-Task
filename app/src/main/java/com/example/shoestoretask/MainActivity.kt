package com.example.shoestoretask

import android.os.Bundle
import android.widget.Toast
import androidx.appcompat.app.AppCompatActivity
import androidx.databinding.DataBindingUtil
import androidx.databinding.ViewDataBinding
import com.example.shoestoretask.R
import com.example.shoestoretask.databinding.ActivityMainBinding

class MainActivity : AppCompatActivity() {
    private var backPressedTime: Long = 0
    private var backToast: Toast? = null

    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        val binding = DataBindingUtil.setContentView<ViewDataBinding>(this, R.layout.activity_main)
       // DataBindingUtil.setContentView<ActivityMainBinding>(this, R.layout.activity_main)

    }
    //handle when user press back button
    override fun onBackPressed() {
        if (backPressedTime + 2000 > System.currentTimeMillis())
        {
            backToast?.cancel()
            super.onBackPressed()
            return
        }
        else
        {
            backToast = Toast.makeText(
                getBaseContext(),
                "Press back again to exit",
                Toast.LENGTH_SHORT
            )
            backToast?.show()
        }
        backPressedTime = System.currentTimeMillis()
    }
}