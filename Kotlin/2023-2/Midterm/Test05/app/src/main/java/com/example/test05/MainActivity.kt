package com.example.test05

import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import android.util.Log

class MainActivity : AppCompatActivity() {
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_main)
        Personob.age = 15
        Personob.printAge()

        var p = Person()
        p.age=20
        p.printAge()
    }
}
class Personob {
    companion object{
        var age =0
        fun printAge(){
            Log.d("test05","${age}")
        }
    }
}
class Person {
    var age = 10
    fun printAge(){
        Log.d("test05","${age}")
    }
}