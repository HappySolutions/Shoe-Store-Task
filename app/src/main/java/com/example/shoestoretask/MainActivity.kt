package com.example.shoestoretask

import android.os.Bundle
import android.util.Log
import androidx.appcompat.app.AppCompatActivity
import androidx.appcompat.widget.Toolbar
import androidx.databinding.DataBindingUtil
import androidx.databinding.ViewDataBinding
import androidx.lifecycle.ViewModelProvider
import androidx.navigation.findNavController
import androidx.navigation.fragment.NavHostFragment
import androidx.navigation.ui.AppBarConfiguration
import androidx.navigation.ui.setupActionBarWithNavController
import androidx.navigation.ui.setupWithNavController
import com.google.android.material.dialog.MaterialAlertDialogBuilder

class MainActivity : AppCompatActivity() {
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)

        setContentView(R.layout.activity_main)
        setSupportActionBar(findViewById(R.id.toolBar))

        //val navController = findNavController(R.id.nav_host_fragment)
       // val config = AppBarConfiguration(navController.graph)

       // findViewById<Toolbar>(R.id.toolBar).setupWithNavController(navController, config)
         setUpNavController()
    }

    override fun onSupportNavigateUp(): Boolean {
val navigation = this.findNavController(R.id.nav_host_fragment)
        return if (navigation.currentDestination?.id == R.id.shoeListFragment ||
                navigation.currentDestination?.id == R.id.loginFragment){
            finish()
            true} else{
                navigation.navigateUp()
        }
    }

    override fun onBackPressed() {
        onSupportNavigateUp()
    }

    private fun setUpNavController() {
val navHostFragment = supportFragmentManager.findFragmentById(R.id.nav_host_fragment) as NavHostFragment
        val navController = navHostFragment.navController
        val appBarConfiguration = AppBarConfiguration(navController.graph)
        setupActionBarWithNavController(navController, appBarConfiguration)
    }


}