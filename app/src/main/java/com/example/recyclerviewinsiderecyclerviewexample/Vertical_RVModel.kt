package com.example.recyclerviewinsiderecyclerviewexample

data class Vertical_RVModel(
    val category: String,
    val subcategory: ArrayList<String>,
    val colors: ArrayList<ArrayList<Horizontal_RVModel>>
)
