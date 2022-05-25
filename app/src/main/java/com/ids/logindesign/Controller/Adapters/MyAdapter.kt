package com.ids.logindesign.Controller.Adapters

import android.view.LayoutInflater
import android.view.View
import android.view.ViewGroup
import android.widget.ImageView
import android.widget.TextView
import android.widget.Toast
import androidx.recyclerview.widget.RecyclerView
import com.ids.logindesign.R
import com.ids.logindesign.Controller.Adapters.RVOnItemClickListener.RVOnItemClickListener
import model.Movie

class MyAdapter( private val items:ArrayList<Movie>,private val itemClickListener: RVOnItemClickListener) :
    RecyclerView.Adapter<MyAdapter.MyViewHolder>() {



    override fun onCreateViewHolder(parent: ViewGroup, viewType: Int): MyViewHolder {
        val itemView = LayoutInflater.from(parent.context).inflate(R.layout.list_item,
        parent,false)
        return MyViewHolder(itemView)
    }

    override fun onBindViewHolder(holder: MyViewHolder, position: Int) {

        items[position].imageItem?.let { holder.imV.setImageResource(it) }
        holder.title.text = items[position].title
        holder.tvRight.text = items[position].numRight.toString()
        holder.tvLeft.text = items[position].numLeft.toString()

    }


    override fun getItemCount(): Int {
        return items.size
    }


    inner class MyViewHolder

    constructor (itemView :View) : RecyclerView.ViewHolder(itemView),View.OnClickListener{

        val imV : ImageView  = itemView.findViewById(R.id.imV)
        val title : TextView = itemView.findViewById(R.id.tvTitle)
        val tvRight : TextView = itemView.findViewById(R.id.tvRight)
        val tvLeft : TextView = itemView.findViewById(R.id.tvleft)


        override fun onClick(v: View) {
            itemClickListener.onItemClicked(v,layoutPosition)
        }

        init {

            itemView.setOnClickListener(this)
        }

    }

}