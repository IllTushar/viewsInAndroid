package com.example.praticeview.Adapter

import android.content.Context
import android.view.LayoutInflater
import android.view.View
import android.view.ViewGroup
import android.widget.ImageView
import android.widget.TextView
import androidx.recyclerview.widget.RecyclerView
import com.example.praticeview.R

class rec_view_adapter(
    var arrayName: ArrayList<String>,
    var arrayPhoto: ArrayList<Int>,
    var context: Context
) : RecyclerView.Adapter<rec_view_adapter.myViewHolder>() {


    class myViewHolder(itemView: View) : RecyclerView.ViewHolder(itemView) {
       var textView: TextView = itemView.findViewById(R.id.text)
        var image:ImageView = itemView.findViewById(R.id.img)

    }

    override fun onCreateViewHolder(parent: ViewGroup, viewType: Int): myViewHolder {
        val view:View = LayoutInflater.from(parent.context).inflate(R.layout.single_row_xml,parent,false)
        return myViewHolder(view)
    }

    override fun getItemCount(): Int {
        return arrayName.size
    }

    override fun onBindViewHolder(holder: myViewHolder, position: Int) {
        holder.image.setImageResource(arrayPhoto[position])
        holder.textView.text = arrayName[position]
    }
}