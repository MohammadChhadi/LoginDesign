package com.ids.logindesign.Controller.Adapters

import android.app.Application
import android.content.Context
import android.graphics.Canvas
import androidx.core.content.ContextCompat
import androidx.recyclerview.widget.ItemTouchHelper
import androidx.recyclerview.widget.RecyclerView
import com.ids.logindesign.R
import it.xabaras.android.recyclerview.swipedecorator.RecyclerViewSwipeDecorator


abstract class SwipeGesture(context:Context) : ItemTouchHelper.SimpleCallback(0,ItemTouchHelper.LEFT or ItemTouchHelper.RIGHT) {

    val likeColor = ContextCompat.getColor(context,R.color.likeColor)
    val dislikeColor = ContextCompat.getColor(context,R.color.dislikeColor)
    var con = context


    override fun onMove(recyclerView: RecyclerView,viewHolder: RecyclerView.ViewHolder,target: RecyclerView.ViewHolder): Boolean {

        return false
    }

     override fun onChildDraw(c: Canvas,recyclerView: RecyclerView,viewHolder: RecyclerView.ViewHolder,dX: Float,dY: Float,actionState: Int, isCurrentlyActive: Boolean) {

            RecyclerViewSwipeDecorator.Builder(con,c,recyclerView,viewHolder,dX,dY,actionState,isCurrentlyActive)
             .addSwipeLeftBackgroundColor(dislikeColor)
             .addSwipeRightBackgroundColor(likeColor)
             .create()
             .decorate()


         super.onChildDraw(c, recyclerView, viewHolder, dX, dY, actionState, isCurrentlyActive)
     }

}