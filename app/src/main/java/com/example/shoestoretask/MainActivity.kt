package com.example.shoestoretask

import android.os.Bundle
import androidx.appcompat.app.AppCompatActivity
import androidx.navigation.findNavController
import androidx.navigation.fragment.NavHostFragment
import androidx.navigation.ui.AppBarConfiguration
import androidx.navigation.ui.setupActionBarWithNavController

class MainActivity : AppCompatActivity() {
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)

        setContentView(R.layout.activity_main)
        setSupportActionBar(findViewById(R.id.toolBar))

         setUpNavController()
    }

    override fun onSupportNavigateUp(): Boolean {
        val navigation = this.findNavController(R.id.nav_host_fragment)
        return if (navigation.currentDestination?.id == R.id.shoeListFragment ||
                navigation.currentDestination?.id == R.id.loginFragment){
            finish()
            true
        }else{
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