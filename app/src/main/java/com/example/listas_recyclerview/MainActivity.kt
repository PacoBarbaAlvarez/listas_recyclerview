  package com.example.listas_recyclerview

  import androidx.appcompat.app.AppCompatActivity
  import android.os.Bundle
  import androidx.recyclerview.widget.DividerItemDecoration
  import androidx.recyclerview.widget.GridLayoutManager
  import androidx.recyclerview.widget.LinearLayoutManager
  import com.example.listas_recyclerview.adapted.ParqueAdapter
  import com.example.listas_recyclerview.databinding.ActivityMainBinding


class MainActivity : AppCompatActivity() {
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        //setContentView(R.layout.activity_main)
        val decoration = DividerItemDecoration(this,LinearLayoutManager.VERTICAL)
        val binding= ActivityMainBinding.inflate(layoutInflater)
        setContentView(binding.root)

        binding.recicler.layoutManager = LinearLayoutManager(this)
        binding.recicler.adapter=ParqueAdapter(ParqueProvider.parqueList)
    }
}