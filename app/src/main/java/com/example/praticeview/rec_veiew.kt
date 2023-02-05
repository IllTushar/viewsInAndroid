package com.example.praticeview

import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import androidx.recyclerview.widget.LinearLayoutManager
import androidx.recyclerview.widget.RecyclerView
import androidx.recyclerview.widget.RecyclerView.LayoutManager
import com.example.praticeview.Adapter.rec_view_adapter

class rec_veiew : AppCompatActivity() {
    var arrayName = ArrayList<String>()
    var arrayPhoto = ArrayList<Int>()
    lateinit var recView: RecyclerView
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_rec_veiew)
        recView = findViewById(R.id.rec_view)
        recView.layoutManager = LinearLayoutManager(this)
        array()
        recView.adapter = rec_view_adapter(arrayName,arrayPhoto,this)


    }
    fun array():Unit
    {
        arrayName.add("Delhi")
        arrayName.add("Mumbai")
        arrayName.add("Pune")
        arrayName.add("Gujarat")
        arrayName.add("Assam")

        arrayPhoto.add(R.drawable.ic_launcher_background)
        arrayPhoto.add(R.drawable.ic_launcher_background)
        arrayPhoto.add(R.drawable.ic_launcher_background)
        arrayPhoto.add(R.drawable.ic_launcher_background)
        arrayPhoto.add(R.drawable.ic_launcher_background)
    }
}