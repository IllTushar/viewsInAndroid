package com.example.praticeview

import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import android.widget.GridView
import com.example.praticeview.Adapter.grid_view_adapter

class gridView : AppCompatActivity() {
    lateinit var gridView: GridView
    var arrayName = ArrayList<String>()
    var arrayPhoto = ArrayList<Int>()
   lateinit var adapter:grid_view_adapter
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_grid_view)
        gridView = findViewById(R.id.grid_view)
        array()
        adapter = grid_view_adapter(arrayName,arrayPhoto,this)
        gridView.adapter = adapter
    }
    fun array():Unit{
        arrayName.add("Delhi")
        arrayName.add("Pune")
        arrayName.add("Mumbai")
        arrayName.add("Gujarat")
        arrayName.add("Delhi")
        arrayName.add("Delhi")

        arrayPhoto.add(R.drawable.ic_launcher_background)
        arrayPhoto.add(R.drawable.ic_launcher_background)
        arrayPhoto.add(R.drawable.ic_launcher_background)
        arrayPhoto.add(R.drawable.ic_launcher_background)
        arrayPhoto.add(R.drawable.ic_launcher_background)
        arrayPhoto.add(R.drawable.ic_launcher_background)

    }
}