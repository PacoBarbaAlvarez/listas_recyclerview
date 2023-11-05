package com.example.listas_recyclerview.adapted

import android.view.View
import android.widget.Toast
import androidx.recyclerview.widget.RecyclerView
import com.bumptech.glide.Glide
import com.example.listas_recyclerview.Parque
import com.example.listas_recyclerview.databinding.CardviewBinding

class ParqueViewHolder (view: View): RecyclerView.ViewHolder (view) {
    val binding = CardviewBinding.bind(view)

    fun render(parqueModel: Parque) {
        binding.Nombre.text = parqueModel.nombre
        binding.Descripcion.text = parqueModel.descripcion

        Glide.with(binding.FotoParque.context).load(parqueModel.foto).into(binding.FotoParque)

        binding.FotoParque.setOnClickListener {
            Toast.makeText(binding.FotoParque.context, parqueModel.nombre, Toast.LENGTH_LONG).show()
        }
    }
}
