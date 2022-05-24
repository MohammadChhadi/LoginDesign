package com.ids.logindesign.Controller.Adapters

import android.view.LayoutInflater
import android.view.View
import android.view.ViewGroup
import android.widget.ImageView
import android.widget.TextView
import androidx.recyclerview.widget.RecyclerView
import com.ids.logindesign.R
import model.Movie

class MyAdapter( private val movieList:ArrayList<Movie>) :
    RecyclerView.Adapter<MyAdapter.MyViewHolder>() {


    override fun onCreateViewHolder(parent: ViewGroup, viewType: Int): MyViewHolder {
        val itemView = LayoutInflater.from(parent.context).inflate(R.layout.list_item,
        parent,false)
        return MyViewHolder(itemView)
    }

    override fun onBindViewHolder(holder: MyViewHolder, position: Int) {

        val currentItem = movieList[position]
        holder.imV.setImageResource(currentItem.imageItem)
        holder.title.text = currentItem.title

    }

    override fun getItemCount(): Int {
        return movieList.size
    }


    class MyViewHolder(itemView :View) : RecyclerView.ViewHolder(itemView){

        val imV : ImageView  = itemView.findViewById(R.id.imV)
        val title : TextView = itemView.findViewById(R.id.tvTitle)

    }

}