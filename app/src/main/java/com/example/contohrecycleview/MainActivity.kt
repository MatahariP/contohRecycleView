package com.example.contohrecycleview

import android.annotation.SuppressLint
import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import android.widget.TextView
import androidx.recyclerview.widget.GridLayoutManager
import androidx.recyclerview.widget.LinearLayoutManager
import androidx.recyclerview.widget.RecyclerView

class MainActivity : AppCompatActivity() {
    @SuppressLint("MissingInflatedId")
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_main)

        var itemList = mutableListOf(
            Item(R.drawable.c_programming_language_svg),
            Item(R.drawable.csharp),
            Item(R.drawable.js),
            Item(R.drawable.r),
            Item(R.drawable.html),
            Item(R.drawable.java_logo),
            Item(R.drawable.kotlin),
            Item(R.drawable.phytob)

            )
        val rvItem = findViewById<RecyclerView>(R.id.rvItem)


        val adapter = ListAdapter(itemList)
        rvItem.adapter = adapter
        rvItem.layoutManager = GridLayoutManager(this,2)
    }
}
