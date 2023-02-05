package com.example.praticeview.Adapter

import android.annotation.SuppressLint
import android.content.Context
import android.view.LayoutInflater
import android.view.View
import android.view.ViewGroup
import android.widget.BaseAdapter
import android.widget.ImageView
import android.widget.TextView
import com.example.praticeview.R

class grid_view_adapter(
    var arrayName: ArrayList<String>,
    var arrayPhoto: ArrayList<Int>,
    var context: Context
) : BaseAdapter() {


    override fun getCount(): Int {
      return arrayName.size
    }

    override fun getItem(p0: Int): Any {
      return 0
    }

    override fun getItemId(p0: Int): Long {
      return 0
    }

    @SuppressLint("ViewHolder", "MissingInflatedId")
    override fun getView(position: Int, view: View?, parent: ViewGroup?): View
    {
        val view = LayoutInflater.from(parent!!.context).inflate(R.layout.single_row_grid_xml,parent,false)
        val textView:TextView = view.findViewById(R.id.text)
        val photo:ImageView = view.findViewById(R.id.imgs)
        textView.text = arrayName[position]
        photo.setImageResource(arrayPhoto[position])
        return view
    }
}