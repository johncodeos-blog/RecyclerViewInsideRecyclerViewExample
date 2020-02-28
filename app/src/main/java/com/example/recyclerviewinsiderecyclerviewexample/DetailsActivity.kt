package com.example.recyclerviewinsiderecyclerviewexample

import android.graphics.Color
import android.os.Bundle
import androidx.appcompat.app.AppCompatActivity
import kotlinx.android.synthetic.main.activity_details.*

class DetailsActivity : AppCompatActivity() {

    private var detailName = ""
    private var detailColor = ""

    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_details)
        detailName = intent.extras?.getString("detail_name") ?: ""
        detailColor = intent.extras?.getString("detail_color") ?: ""

        // Add the name of the color as a Activity Title
        title = detailName

        // Add the color as a background color for the Activity
        detail_view.setBackgroundColor(Color.parseColor(detailColor))
    }
}
