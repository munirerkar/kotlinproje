package com.example.yemektariflerisqlite

import android.view.View
import android.view.ViewGroup
import androidx.recyclerview.widget.RecyclerView

class ListeRecyclerAdapter(val yemekListesi:ArrayList<String>,val idListesi:ArrayList<Int>) : RecyclerView.Adapter<ListeRecyclerAdapter.YemekHolder>() {
    class YemekHolder(itemView: View) : RecyclerView.ViewHolder(itemView)

    override fun onCreateViewHolder(parent: ViewGroup, viewType: Int): YemekHolder {
        TODO("Not yet implemented")
    }

    override fun getItemCount(): Int {
        TODO("Not yet implemented")
    }

    override fun onBindViewHolder(holder: YemekHolder, position: Int) {
        TODO("Not yet implemented")
    }
}