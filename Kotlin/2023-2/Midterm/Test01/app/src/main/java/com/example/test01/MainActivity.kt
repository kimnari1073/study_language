package com.example.test01

import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import android.util.Log

class MainActivity : AppCompatActivity() {
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_main)
        var age = 888
        when (age) {
            in 10..19 -> { //10대일때
                Log.d("test01","당신는 10대입니다.")
            }
            in 20..29 -> {
                Log.d("test01","당신는 20대입니다.")
            }
            in 30..39 -> {
                Log.d("test01","당신는 30대입니다.")
            }
            in 40..49 -> {
                Log.d("test01","당신는 40대입니다.")
            }
            in 50..59 -> {
                Log.d("test01","당신는 50대입니다.")
            }
            else -> { //10~59살 이외일때 ex) 9살, 60살
                Log.d("test01","당신의 나이를 알 수 없습니다.")
            }
        }
    }
}