package com.example.test04

import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import android.util.Log

class MainActivity : AppCompatActivity() {
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_main)

        //서브 함수
        fun sumFun (x : Int) : Int{
            var sum = 0
            for ( i in x downTo 1){
                sum += i
            }
            return sum
        }
        //원래 함수
        fun inputFun(x : Int){
            Log.d("test04","${sumFun(x)}")
        }
        inputFun(5) //함수 실행
    }
}