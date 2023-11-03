package com.example.test09

import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import com.example.test09.databinding.ActivityMainBinding

class MainActivity : AppCompatActivity() {
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        val binding = ActivityMainBinding.inflate(layoutInflater)
        setContentView(binding.root)

        binding.button.setOnClickListener{
            binding.textView.text="Become a programmer!!!"
        }

    }
}