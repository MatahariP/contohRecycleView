package com.example.contohrecycleview

import android.annotation.SuppressLint
import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import android.widget.TextView
import androidx.recyclerview.widget.LinearLayoutManager
import androidx.recyclerview.widget.RecyclerView

class MainActivity : AppCompatActivity() {
    @SuppressLint("MissingInflatedId")
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_main)

        var itemList = mutableListOf(
            Item("Adip", "Matahari Pradipta", "2110512086"),
            Item("Adip", "Matahari Pradipta", "2110512086"),
            Item("Adip", "Matahari Pradipta", "2110512086"),
            Item("Adip", "Matahari Pradipta", "2110512086"),
            Item("Adip", "Matahari Pradipta", "2110512086"),
            Item("Adip", "Matahari Pradipta", "2110512086"),
            Item("Adip", "Matahari Pradipta", "2110512086"),
            Item("Adip", "Matahari Pradipta", "2110512086"),
            Item("Adip", "Matahari Pradipta", "2110512086"),
            Item("Adip", "Matahari Pradipta", "2110512086"),
            Item("Adip", "Matahari Pradipta", "2110512086"),
            Item("Adip", "Matahari Pradipta", "2110512086")

            )
        val rvItem = findViewById<RecyclerView>(R.id.rvItem)


        val adapter = ListAdapter(itemList)
        rvItem.adapter = adapter
        rvItem.layoutManager = LinearLayoutManager(this)
    }
}
