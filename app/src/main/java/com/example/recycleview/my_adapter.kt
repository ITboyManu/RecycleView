package com.example.recycleview

import android.content.Context
import android.view.LayoutInflater
import android.view.View
import android.view.ViewGroup
import android.widget.TextView
import androidx.recyclerview.widget.RecyclerView

class my_adapter( var requireContext:Context, private val phoneDetails :ArrayList<rv_datamodelclass>):
    RecyclerView.Adapter<my_adapter.exampleViewholder>() {
    class exampleViewholder(itemView:View): RecyclerView.ViewHolder(itemView) {
            val personName=itemView.findViewById<TextView>(R.id.textView)
            val PersonPhone=itemView.findViewById<TextView>(R.id.textView3)
    }

    override fun onCreateViewHolder(parent: ViewGroup, viewType: Int): exampleViewholder {
       val view=LayoutInflater.from(parent.context).inflate(R.layout.rv_items,parent,false)
        return  exampleViewholder(view)
    }

    override fun onBindViewHolder(holder: exampleViewholder, position: Int){
       holder.personName.text=phoneDetails[position].personName
        holder.PersonPhone.text=phoneDetails[position].personPhone.toString()
    }
    override fun getItemCount(): Int {
        return phoneDetails.size
    }

}