package com.example.listas_recyclerview

import android.os.Bundle
import android.util.Log
import android.widget.Button
import android.widget.EditText
import android.widget.RadioButton
import android.widget.Spinner
import com.example.listas_recyclerview.R
import androidx.appcompat.app.AppCompatActivity

class AnadirParquesActivity : AppCompatActivity() {
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_anadir_parques)

        //val binding = AnadirParquesActivityBinding.inflate(layoutInflater)
        //setContentView(binding.root)
        //val miDialogo = MiDialogFragment()

        val buttonGuardar = findViewById<Button>(R.id.Guardar)
        buttonGuardar.setOnClickListener {
            val nombre = findViewById<EditText>(R.id.nombre).text.toString()

            val descripcion = findViewById<EditText>(R.id.Descripción).text.toString()

            val telefono = findViewById<EditText>(R.id.telefono).text.toString()

            val web = findViewById<EditText>(R.id.Web).text.toString()

            val horaApertura = findViewById<Spinner>(R.id.desplegable1).selectedItem.toString()

            val horaCierre = findViewById<Spinner>(R.id.desplegable2).selectedItem.toString()

            val deportes = findViewById<RadioButton>(R.id.Boton1).isChecked

            val parqueInfantil = findViewById<RadioButton>(R.id.Boton2).isChecked

            val restaurante = findViewById<RadioButton>(R.id.Boton3).isChecked

            val zonaMascotas = findViewById<RadioButton>(R.id.Boton4).isChecked

            Log.d("MainActivity", "Nombre: " +nombre)
            Log.d("MainActivity", "Descripción: " + descripcion)
            Log.d("MainActivity", "Teléfono: " + telefono)
            Log.d("MainActivity", "Sitio web: " + web)
            Log.d("MainActivity", "Hora de apertura: " + horaApertura)
            Log.d("MainActivity", "Hora de cierre: " + horaCierre)
            Log.d("MainActivity", "Deportes: " + deportes)
            Log.d("MainActivity", "Parque infantil: " + parqueInfantil)
            Log.d("MainActivity", "Restaurante: " + restaurante)
            Log.d("MainActivity", "Zona de mascotas: "+ zonaMascotas)

            //miDialogo.show(supportFragmentManager,"MiDialogo")
        }
    }
}