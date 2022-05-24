package com.ids.logindesign.Controller.Activities

import Base.AppCompactBase
import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import androidx.recyclerview.widget.LinearLayoutManager
import androidx.recyclerview.widget.RecyclerView
import com.ids.logindesign.Controller.Adapters.MyAdapter
import com.ids.logindesign.R
import model.Movie

class ActivitySwipe :  AppCompactBase() {

    private  lateinit var movieRecyclerView: RecyclerView
    private lateinit var movieArrayList: ArrayList<Movie>
    lateinit var imageId : Array<Int>
    lateinit var titles : Array<String>

    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_swipe)

        imageId = arrayOf(
            R.drawable.icon_item ,
            R.drawable.icon_item,
            R.drawable.icon_item,
            R.drawable.icon_item,
            R.drawable.icon_item ,
            R.drawable.icon_item,
            R.drawable.icon_item,
            R.drawable.icon_item

        )
        titles = arrayOf(
            "Movie 1",
            "Movie 2",
            "Movie 3" ,
            "Movie 4",
            "Movie 5",
            "Movie 6",
            "Movie 7" ,
            "Movie 8"
        )

        movieRecyclerView= findViewById(R.id.recycleItems)
        movieRecyclerView.layoutManager= LinearLayoutManager(this)
        movieRecyclerView.setHasFixedSize(true)

        movieArrayList = arrayListOf<Movie>()
        getData()
    }

    fun getData(){
        for(i in imageId.indices){
            val movie = Movie(imageId[i],titles[i])
            movieArrayList.add(movie)
        }

        movieRecyclerView.adapter = MyAdapter(movieArrayList)
    }
}