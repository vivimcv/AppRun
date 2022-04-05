package com.example.apprun

import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import com.example.apprun.databinding.ActivityMainBinding

class HomeActivity : AppCompatActivity() {

    private lateinit var mBinding: ActivityMainBinding
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_home)
        getSupportActionBar()?.hide()

    }
}