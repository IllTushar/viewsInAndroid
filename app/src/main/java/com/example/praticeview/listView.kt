package com.example.praticeview

import android.annotation.SuppressLint
import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import android.widget.ArrayAdapter
import android.widget.ListView
import android.widget.Toast

class listView : AppCompatActivity()
{
    lateinit var listView: ListView
    @SuppressLint("MissingInflatedId")
    override fun onCreate(savedInstanceState: Bundle?)
    {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_list_view)
        listView =  findViewById(R.id.listView)
        val countryAdapter = resources.getStringArray(R.array.countiries)
        val adapter = ArrayAdapter(this,android.R.layout.simple_list_item_1,countryAdapter)
        listView.adapter =adapter
        listView.setOnItemClickListener { parent, view, position, l ->
            val itemList:String = parent.getItemAtPosition(position).toString()
            Toast.makeText(applicationContext,"The Country name is $itemList",Toast.LENGTH_LONG).show()
        }
    }
}