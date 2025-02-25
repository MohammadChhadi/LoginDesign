package com.ids.logindesign.Controller.Activities

import Base.AppCompactBase
import android.content.Intent
import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import android.view.View
import androidx.recyclerview.widget.ItemTouchHelper
import androidx.recyclerview.widget.LinearLayoutManager
import androidx.recyclerview.widget.RecyclerView
import com.ids.logindesign.Controller.Adapters.MyAdapter
import com.ids.logindesign.Controller.Adapters.SwipeGesture
import com.ids.logindesign.R
import com.ids.logindesign.Controller.Adapters.RVOnItemClickListener.RVOnItemClickListener
import com.ids.logindesign.Controller.MainActivity
import com.ids.logindesign.databinding.ActivitySwipeBinding
import model.Movie

class ActivitySwipe :  AppCompactBase(), RVOnItemClickListener {
    lateinit var binding: ActivitySwipeBinding
    private var arrayMovie=java.util.ArrayList<Movie>()
    lateinit var adapter : MyAdapter
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        binding = ActivitySwipeBinding.inflate(layoutInflater)
        setContentView(binding.root)
        init()
    }

    private fun init(){
        arrayMovie.clear()
        arrayMovie.add(Movie(R.drawable.icon_item,"Movie 1",0,0))
        arrayMovie.add(Movie(R.drawable.icon_item,"Movie 2",0,0))
        arrayMovie.add(Movie(R.drawable.icon_item,"Movie 3",0,0))
        arrayMovie.add(Movie(R.drawable.icon_item,"Movie 4",0,0))
        arrayMovie.add(Movie(R.drawable.icon_item,"Movie 5",0,0))
        arrayMovie.add(Movie(R.drawable.icon_item,"Movie 6",0,0))
        arrayMovie.add(Movie(R.drawable.icon_item,"Movie 7",0,0))
        arrayMovie.add(Movie(R.drawable.icon_item,"Movie 8",0,0))
        setData()

      /*  val swipeGesture = object :SwipeGesture(this){
            override fun onSwiped(viewHolder: RecyclerView.ViewHolder, direction: Int) {
                when(direction){
                    ItemTouchHelper.LEFT ->{
                            getNumLeft(viewHolder.layoutPosition)
                    }

                    ItemTouchHelper.RIGHT ->{
                            getNumRight(viewHolder.layoutPosition)
                    }
                }

            }

        }*/
/*        val touchHelper = ItemTouchHelper(swipeGesture)
        touchHelper.attachToRecyclerView(recycleItems)*/
    }

    fun getNumLeft(position: Int){
        arrayMovie[position].numLeft = arrayMovie[position].numLeft!! + 1
        adapter.notifyItemChanged(position)
    }
    fun getNumRight(position: Int){
        arrayMovie[position].numRight = arrayMovie[position].numRight!! + 1
        adapter.notifyItemChanged(position)
    }

    override fun onItemClicked(view: View, position: Int) {

    }
    private fun setData() {
        val layoutManager = LinearLayoutManager(this, RecyclerView.VERTICAL, false)
        binding.recycleItems.layoutManager = layoutManager
        adapter = MyAdapter(arrayMovie,this)
        binding.recycleItems.adapter = adapter

    }
}