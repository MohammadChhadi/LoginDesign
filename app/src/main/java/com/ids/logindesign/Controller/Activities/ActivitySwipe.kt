package com.ids.logindesign.Controller.Activities

import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import androidx.recyclerview.widget.RecyclerView
import com.ids.logindesign.R
import model.Movie

class ActivitySwipe : AppCompatActivity() {

    private  lateinit var movieRecyclerView: RecyclerView
    private lateinit var movieArrayList: ArrayList<Movie>
    lateinit var imageId : Array<Int>
    lateinit var title : Array<String>

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
            R.drawable.icon_item,

        )

        title = arrayOf(
            "Movie 1",
            "Movie 2",
            "Movie 3" ,
            "Movie 4",
            "Movie 5",
            "Movie 6",
            "Movie 7" ,
            "Movie 8"


        )
    }
}