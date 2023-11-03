package com.example.test02

import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import android.util.Log

class MainActivity : AppCompatActivity() {
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_main)
        var tlist = mutableListOf("MON","TUE","WED")
        for (a in tlist){ Log.d("test02-list","list : ${a}") } //출력
        Log.d("test02-list","---삭제---")
        tlist.removeAt(1) //인덱스 1 삭제
        for (a in tlist){ Log.d("test02-list","list : ${a}") }

        var tmap = mutableMapOf<String,String>()
        tmap.put("키1","값1")
        tmap.put("키2","값2")
        tmap.put("키3","값3")
        for (a in tmap){ Log.d("test02-map","key : ${a.key}, value : ${a.value}") }
        Log.d("test02-map","---삭제---")
        tmap.remove("키2")
        for (a in tmap){ Log.d("test02-map","key : ${a.key}, value : ${a.value}") }

        var tset = mutableSetOf<String>("MON","TUE","WED")
        for (a in tset){ Log.d("test02-set","set : ${a}") }
        Log.d("test02-set","---삭제---")
        tset.remove("WED")
        for (a in tset){ Log.d("test02-set","set : ${a}") }
    }
}