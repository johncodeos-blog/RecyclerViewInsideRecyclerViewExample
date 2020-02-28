package com.example.recyclerviewinsiderecyclerviewexample

import android.os.AsyncTask
import android.os.Bundle
import android.view.View
import androidx.appcompat.app.AppCompatActivity
import androidx.recyclerview.widget.LinearLayoutManager
import androidx.recyclerview.widget.RecyclerView
import io.github.luizgrp.sectionedrecyclerviewadapter.SectionedRecyclerViewAdapter
import kotlinx.android.synthetic.main.activity_main.*
import java.lang.ref.WeakReference


class MainActivity : AppCompatActivity() {

    private val sectionAdapter = SectionedRecyclerViewAdapter()

    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_main)

        val layoutManager = LinearLayoutManager(this, LinearLayoutManager.VERTICAL, false)
        vertical_rv.layoutManager = layoutManager
        vertical_rv.adapter = sectionAdapter
        FetchDemoData(this, vertical_rv, sectionAdapter).execute()
    }


    private class FetchDemoData
    internal constructor(mContext: MainActivity, verticalRecyclerView: RecyclerView, sectionAdapter: SectionedRecyclerViewAdapter) :
        AsyncTask<Void, Void, Void>() {

        private val activityReference: WeakReference<MainActivity> = WeakReference(mContext)

        var verticalRv = verticalRecyclerView
        var secAdapter = sectionAdapter

        val colors = Colors().objectsArray

        override fun doInBackground(vararg params: Void): Void? {
            for (color in colors) {
                secAdapter.addSection(
                    Vertical_RVAdapter(
                        color.category,
                        color.subcategory,
                        color.colors
                    )
                )
            }
            return null
        }

        override fun onPostExecute(result: Void?) {
            // get a reference to the activity if it is still there
            val activity = activityReference.get()
            if (activity == null || activity.isFinishing) return
            verticalRv.adapter?.notifyDataSetChanged()
        }
    }
}
