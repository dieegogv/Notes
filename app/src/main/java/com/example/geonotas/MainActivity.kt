package com.example.geonotas

import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import android.widget.Button
import android.widget.EditText
import com.example.geonotas.utils.Validaciones

abstract class MainActivity : AppCompatActivity() {

    abstract val validaciones:Validaciones

    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_main)
       var  etNombre = findViewById<EditText>(R.id.etNombre)
       var btContinuar = findViewById<Button>(R.id.btContinuar)

        btContinuar.setOnClickListener {
            if (!etNombre.text.toString().equals("") && validaciones.numerosString(etNombre.text.toString())!= Double.toString()){

            }else {

            }
        }

    }
}
