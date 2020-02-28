package com.example.recyclerviewinsiderecyclerviewexample

import android.content.Context
import android.content.Intent
import android.graphics.Color
import android.os.Bundle
import android.util.Log
import android.view.LayoutInflater
import android.view.View
import android.view.ViewGroup
import androidx.recyclerview.widget.RecyclerView
import kotlinx.android.synthetic.main.horizontal_item.view.*

class Horizontal_RVAdapter(private var mContext: Context) : RecyclerView.Adapter<RecyclerView.ViewHolder>() {

    private var itemsList: ArrayList<Horizontal_RVModel> = ArrayList()
    private var mRowIndex = -1

    fun setColorsData(data: ArrayList<Horizontal_RVModel>) {
        if (itemsList != data) {
            itemsList = data
            notifyDataSetChanged()
        }
    }

    fun setRowIndex(index: Int) {
        mRowIndex = index
    }

    class ItemViewHolder(itemView: View) : RecyclerView.ViewHolder(itemView)

    override fun onCreateViewHolder(parent: ViewGroup, viewType: Int): RecyclerView.ViewHolder {
        val itemView =
            LayoutInflater.from(mContext).inflate(R.layout.horizontal_item, parent, false)
        return ItemViewHolder(itemView)
    }

    override fun getItemCount(): Int {
        return itemsList.size
    }

    override fun onBindViewHolder(holder: RecyclerView.ViewHolder, position: Int) {
        holder.itemView.item_image.setBackgroundColor(Color.parseColor(itemsList[position].color))
        holder.itemView.item_title.text = itemsList[position].name
        holder.itemView.setOnClickListener {
            Log.d(
                "TAG",
                "You pressed the item in the category row $mRowIndex and position $position"
            )
            val intent = Intent(mContext, DetailsActivity::class.java)
            val bundle = Bundle()
            bundle.putString("detail_color", itemsList[position].color)
            bundle.putString("detail_name", itemsList[position].name)
            intent.putExtras(bundle)
            mContext.startActivity(intent)
        }

    }

}