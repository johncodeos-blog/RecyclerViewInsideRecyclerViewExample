package com.example.recyclerviewinsiderecyclerviewexample

import android.graphics.Color
import android.view.View
import androidx.recyclerview.widget.LinearLayoutManager
import androidx.recyclerview.widget.RecyclerView
import io.github.luizgrp.sectionedrecyclerviewadapter.Section
import io.github.luizgrp.sectionedrecyclerviewadapter.SectionParameters
import kotlinx.android.synthetic.main.vertical_item.view.*
import kotlinx.android.synthetic.main.vertical_header.view.*


class Vertical_RVAdapter(private val category: String, private val subcategory: ArrayList<String>, private val colors: ArrayList<ArrayList<Horizontal_RVModel>>) : Section(SectionParameters.builder().itemResourceId(R.layout.vertical_item).headerResourceId(R.layout.vertical_header).build()) {

    // Size of Subcategories in each Section
    override fun getContentItemsTotal(): Int {
        return subcategory.size
    }

    class SectionViewHolder(rootView: View) : RecyclerView.ViewHolder(rootView)

    class ItemViewHolder(rootView: View) : RecyclerView.ViewHolder(rootView) {
        private val horizontalRecyclerView: RecyclerView
        val horizontalAdapter: Horizontal_RVAdapter

        init {
            val context = itemView.context
            horizontalRecyclerView = itemView.findViewById(R.id.horizontal_rv)
            horizontalRecyclerView?.layoutManager =
                LinearLayoutManager(context, LinearLayoutManager.HORIZONTAL, false)
            horizontalRecyclerView?.addItemDecoration(
                EqualSpacingItemDecoration(
                    8,
                    EqualSpacingItemDecoration.HORIZONTAL
                )
            )
            horizontalAdapter = Horizontal_RVAdapter(context)
            horizontalRecyclerView.adapter = horizontalAdapter
        }
    }

    override fun getHeaderViewHolder(view: View): RecyclerView.ViewHolder {
        return SectionViewHolder(view)
    }

    override fun getItemViewHolder(view: View): RecyclerView.ViewHolder {
        return ItemViewHolder(view)
    }


    override fun onBindHeaderViewHolder(holder: RecyclerView.ViewHolder) {
        holder.itemView.vertical_category_text.setTextColor(Color.WHITE)
        holder.itemView.vertical_category_text.text = category
    }

    override fun onBindItemViewHolder(holder: RecyclerView.ViewHolder, position: Int) {
        val itemHolder = holder as ItemViewHolder
        // Subcategory
        itemHolder.itemView.subcategory_text.text = subcategory[position]
        // Color items
        itemHolder.horizontalAdapter.setColorsData(colors[position])
        // Pass the current row
        itemHolder.horizontalAdapter.setRowIndex(position)
    }
}