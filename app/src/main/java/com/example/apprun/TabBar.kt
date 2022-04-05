package com.example.apprun

import android.content.Intent
import android.net.Uri
import android.os.Bundle
import com.google.android.material.bottomnavigation.BottomNavigationView
import androidx.appcompat.app.AppCompatActivity
import androidx.navigation.findNavController
import androidx.navigation.ui.AppBarConfiguration
import androidx.navigation.ui.setupActionBarWithNavController
import androidx.navigation.ui.setupWithNavController
import com.example.apprun.databinding.ActivityTabBarBinding

class TabBar : AppCompatActivity() {

    private lateinit var binding: ActivityTabBarBinding

    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)

        binding = ActivityTabBarBinding.inflate(layoutInflater)
        setContentView(binding.root)
        getSupportActionBar()?.hide()

        val navView: BottomNavigationView = binding.navView

        val navController = findNavController(R.id.nav_host_fragment_activity_tab_bar)
        // Passing each menu ID as a set of Ids because each
        // menu should be considered as top level destinations.
        val appBarConfiguration = AppBarConfiguration(
            setOf(
                R.id.navigation_home, R.id.navigation_dashboard, R.id.navigation_notifications
            )
        )
        setupActionBarWithNavController(navController, appBarConfiguration)
        navView.setupWithNavController(navController)

        with(binding){

            button1.setOnClickListener {
                //Abrir un url
                var uri = Uri.parse("https://www.spartanrace.mx/es/race/detail/7674/overview")
                startActivity(Intent(Intent.ACTION_VIEW, uri))
            }

            button2.setOnClickListener {
                //Abrir un url
                var uri = Uri.parse("https://www.spartanrace.mx/es/race/detail/7674/overview")
                startActivity(Intent(Intent.ACTION_VIEW, uri))
            }
            button3.setOnClickListener {
                //Abrir un url
                var uri = Uri.parse("https://asdeporte.com/evento/tune-up-city-santander-cdmx-space-edition-sw3e/resultados/5K")
                startActivity(Intent(Intent.ACTION_VIEW, uri))
            }
            button4.setOnClickListener {
                //Abrir un url
                var uri = Uri.parse("https://asdeporte.com/evento/tune-up-city-santander-cdmx-space-edition-sw3e/resultados/5K")
                startActivity(Intent(Intent.ACTION_VIEW, uri))
            }
            button5.setOnClickListener {
                //Abrir un url
                var uri = Uri.parse("https://asdeporte.com/evento/tune-up-city-santander-cdmx-space-edition-sw3e/resultados/5K")
                startActivity(Intent(Intent.ACTION_VIEW, uri))
            }
            button6.setOnClickListener {
                //Abrir un url
                var uri = Uri.parse("https://maraton.cdmx.gob.mx")
                startActivity(Intent(Intent.ACTION_VIEW, uri))
            }

        }


    }
}