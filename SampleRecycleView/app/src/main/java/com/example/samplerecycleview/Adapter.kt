package com.example.samplerecycleview

import android.view.LayoutInflater
import android.view.View
import android.view.ViewGroup
import android.widget.TextView
import androidx.recyclerview.widget.RecyclerView
import com.google.android.material.imageview.ShapeableImageView

class Adapter (private val newsList: ArrayList<News>): RecyclerView.Adapter<Adapter.MyViewHolder>() {
    override fun onCreateViewHolder(parent: ViewGroup, viewType: Int): MyViewHolder {
        val adapterLayout = LayoutInflater.from(parent.context)
            .inflate(R.layout.list_item, parent, false)

        return MyViewHolder(adapterLayout)
    }

    override fun onBindViewHolder(holder: MyViewHolder, position: Int) {
        val item = newsList[position]
        holder.titleImage.setImageResource(item.titleImage)
        holder.tvheading.text = item.heading
    }

    override fun getItemCount(): Int {
        return newsList.size
    }

    class MyViewHolder (itemview : View): RecyclerView.ViewHolder (itemview){
        val titleImage: ShapeableImageView = itemview.findViewById(R.id.title_image)
        val tvheading: TextView = itemview.findViewById(R.id.tvheading)
    }
}