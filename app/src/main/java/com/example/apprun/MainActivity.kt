package com.example.apprun

import android.content.Intent
import android.graphics.Typeface
import android.os.Bundle
import android.view.View
import android.widget.TextView
import androidx.appcompat.app.AppCompatActivity
import com.example.apprun.databinding.ActivityMainBinding


class MainActivity : AppCompatActivity() {
    private lateinit var mBinding: ActivityMainBinding
    private lateinit var tvRegistrarse: TextView

    override fun onCreate(savedInstanceState: Bundle?) {
        Thread.sleep(3000)
        setTheme(R.style.Theme_AppRun)
        mBinding= com.example.apprun.databinding.ActivityMainBinding.inflate(layoutInflater)
        setContentView(mBinding.root)
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_main)
        getSupportActionBar()?.hide()





      //  val face = Typeface.createFromAsset(assets, "fonts/nombre_fuente.ttf")
      //  tvRegistrarse.setTypeface(face)
    }

    fun Onclick(view: View) {
        startActivity(Intent(this, TabBar::class.java))
        finish()
    }


}