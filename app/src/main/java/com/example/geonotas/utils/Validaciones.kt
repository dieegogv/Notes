package com.example.geonotas.utils

import java.lang.Double.parseDouble
import java.lang.NumberFormatException

class Validaciones {
    fun numerosString (texto: String): String{
        val stringBuilder = StringBuilder()
        for (i in texto.indices){
            var tieneNumeros = true
            try {
                val numero = parseDouble(texto[i].toString())
            }catch (e: NumberFormatException){
                tieneNumeros = false
            }
            if (tieneNumeros){
                stringBuilder.append(texto[i].toString())
            }
        }
        return stringBuilder.toString()
    }
}