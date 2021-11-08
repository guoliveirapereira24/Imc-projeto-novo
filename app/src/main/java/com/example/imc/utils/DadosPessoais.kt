package com.example.imc.utils

import android.content.Context

fun preencherDados(
          imc: Double,
          dataNasc: Int,
          idade: Int,
          peso: Double,
          altura: Double,
    context: Context) {

    val arquivo = context.getSharedPreferences(
            "usuario", Context.MODE_PRIVATE)


}