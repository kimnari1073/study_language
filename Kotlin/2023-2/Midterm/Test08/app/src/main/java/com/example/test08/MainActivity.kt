package com.example.test08

import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import com.example.test08.databinding.ActivityMainBinding

class MainActivity : AppCompatActivity() {
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)

        var binding = ActivityMainBinding.inflate(layoutInflater)
        setContentView(binding.root)

        binding.ratingBar.setOnRatingBarChangeListener { ratingBar, fl, b ->
            binding.textView.text="$fl"
        }
    }
}