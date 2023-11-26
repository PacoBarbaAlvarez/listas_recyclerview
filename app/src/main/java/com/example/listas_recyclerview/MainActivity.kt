  package com.example.listas_recyclerview

  import androidx.appcompat.app.AppCompatActivity
  import android.os.Bundle
  import androidx.recyclerview.widget.DividerItemDecoration
  import androidx.recyclerview.widget.GridLayoutManager
  import androidx.recyclerview.widget.LinearLayoutManager
  import com.example.listas_recyclerview.adapted.ParqueAdapter
  import com.example.listas_recyclerview.databinding.ActivityMainBinding
  import androidx.core.widget.addTextChangedListener


class MainActivity : ActivityWithMenus() {
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setTitle("ListadoPelis")
        //setContentView(R.layout.activity_main)
        val binding= ActivityMainBinding.inflate(layoutInflater)
        setContentView(binding.root)

        binding.recicler.layoutManager = LinearLayoutManager(this)
        var adapter = ParqueAdapter(ParqueProvider.parqueList)
        binding.recicler.adapter=adapter

        binding.Filtro.addTextChangedListener {filtro ->
            val filtroParque = ParqueProvider.parqueList.filter { Peli ->
                Peli.nombre.lowercase().contains(filtro.toString().lowercase())  }
            adapter.actualizarParques(filtroParque)

        }
    }
}