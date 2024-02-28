package com.jorge.app_marvelapi_firebase_testes_room.presentation

import android.os.Bundle
import com.google.android.material.bottomnavigation.BottomNavigationView
import androidx.appcompat.app.AppCompatActivity
import androidx.navigation.NavController
import androidx.navigation.findNavController
import androidx.navigation.fragment.NavHostFragment
import androidx.navigation.ui.AppBarConfiguration
import androidx.navigation.ui.setupActionBarWithNavController
import androidx.navigation.ui.setupWithNavController
import com.jorge.app_marvelapi_firebase_testes_room.R
import com.jorge.app_marvelapi_firebase_testes_room.databinding.ActivityMainBinding

class MainActivity : AppCompatActivity() {

    private lateinit var binding: ActivityMainBinding

    private lateinit var navController: NavController
    private lateinit var appBarConfiguration: AppBarConfiguration

    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)

        binding = ActivityMainBinding.inflate(layoutInflater)
        setContentView(binding.root)


        val navHostFragment = supportFragmentManager.findFragmentById(R.id.nav_host_fragment_activity_main) as NavHostFragment

        navController = navHostFragment.navController
        binding.navView.setupWithNavController(navController)

        appBarConfiguration = AppBarConfiguration(
            setOf(
                R.id.home, R.id.favorite, R.id.info
            ))
        binding.Toolbar.setupWithNavController(navController, appBarConfiguration)


        navController.addOnDestinationChangedListener{_, destination, _ ->
            val isTopLavelDestination = appBarConfiguration.topLevelDestinations.contains(destination.id)
            if (isTopLavelDestination){
                binding.Toolbar.setNavigationIcon(R.drawable.baseline_arrow_back_24)
            }
        }

    }
}