package com.example.imc.utils

import android.content.Context

fun autenticar(
        email: String,
        senha: String,
        context: Context) : Boolean{

    val arquivo = context.getSharedPreferences(
            "usuario", Context.MODE_PRIVATE)

    //Isso é um If escrito de forma diferente
    return(email == arquivo.getString("email", "")
            && senha == arquivo.getString("senha","" ))

}