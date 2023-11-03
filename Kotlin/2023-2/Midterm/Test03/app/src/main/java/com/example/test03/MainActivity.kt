package com.example.test03

import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import android.util.Log

class MainActivity : AppCompatActivity() {
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_main)

        var i = 1
        var sum = 0
        while(i <= 100){
            sum += i
            i++
        }
        Log.d("test03","${sum}")
    }
}