package com.example.andersenhw2

import android.os.Bundle
import androidx.appcompat.app.AppCompatActivity
import com.bumptech.glide.Glide
import com.example.andersenhw2.databinding.ActivityMainBinding
import com.example.andersenhw2.fragments.ImageScreenFragment

class MainActivity : AppCompatActivity(R.layout.activity_main) {
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        supportFragmentManager.beginTransaction().add(R.id.container,ImageScreenFragment()).commit()
    }
}