package com.example.contohrecycleview

import android.view.LayoutInflater
import android.view.View
import android.view.ViewGroup
import android.widget.TextView
import androidx.recyclerview.widget.RecyclerView


class ListAdapter(
    var item: List<Item>
) : RecyclerView.Adapter<ListAdapter.ListViewHolder>(){
    inner class ListViewHolder(itemView: View) : RecyclerView.ViewHolder(itemView)

    override fun onCreateViewHolder(parent: ViewGroup, viewType: Int): ListViewHolder {
        val view = LayoutInflater.from(parent.context).inflate(R.layout.list_item, parent, false)
        return ListViewHolder(view)
    }

    override fun onBindViewHolder(holder: ListViewHolder, position: Int) {
        holder.itemView.apply {
            val tvPanggilan = findViewById<TextView>(R.id.tvPanggilan)
            tvPanggilan.text = item[position].panggilan;

            val tvNamaLengkap = findViewById<TextView>(R.id.tvNamaLengkap)
            tvNamaLengkap.text = item[position].namaLengkap;

            val tvNIM = findViewById<TextView>(R.id.tvNIM)
            tvNIM.text = item[position].NIM;

        }
    }

    override fun getItemCount(): Int {
        return item.size
    }
}