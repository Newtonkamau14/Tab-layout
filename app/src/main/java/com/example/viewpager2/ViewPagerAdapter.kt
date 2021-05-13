package com.example.viewpager2

import android.view.LayoutInflater
import android.view.View
import android.view.ViewGroup
import androidx.recyclerview.widget.RecyclerView
import kotlinx.android.synthetic.main.item_viewpager.view.*

class ViewPagerAdapter(val images: List<Int>) :RecyclerView.Adapter<ViewPagerAdapter.ViewPagerHolder>() {
    inner class ViewPagerHolder(itemView: View) : RecyclerView.ViewHolder(itemView){

    }

    override fun onCreateViewHolder(parent: ViewGroup, viewType: Int): ViewPagerHolder {
        val view  = LayoutInflater.from(parent.context).inflate(R.layout.item_viewpager,parent,false)
        return  ViewPagerHolder(view)

    }

    override fun onBindViewHolder(holder: ViewPagerHolder, position: Int) {
       val curImage = images[position]
        holder.itemView.imgView.setImageResource(curImage)
    }

    override fun getItemCount(): Int {
        return images.size
    }
}