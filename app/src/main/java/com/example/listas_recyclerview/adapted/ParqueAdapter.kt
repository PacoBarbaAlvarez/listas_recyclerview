package com.example.listas_recyclerview.adapted

import android.view.LayoutInflater
import android.view.ViewGroup
import androidx.recyclerview.widget.RecyclerView
import com.example.listas_recyclerview.Parque
import com.example.listas_recyclerview.R

class ParqueAdapter (private var parqueList:List<Parque>): RecyclerView.Adapter<ParqueViewHolder>(){

    override fun onCreateViewHolder(parent: ViewGroup, viewType: Int): ParqueViewHolder {
        val layoutInflater = LayoutInflater.from(parent.context)
        return ParqueViewHolder(layoutInflater.inflate(R.layout.cardview,parent,false))
    }

    override fun getItemCount(): Int {
        return parqueList.size
    }

    override fun onBindViewHolder(holder: ParqueViewHolder, position: Int) {
        val item = parqueList[position]
        holder.render(item)
    }

    fun actualizarParques(listaparque: List<Parque>) {
        this.parqueList = listaparque
        notifyDataSetChanged()
    }
}