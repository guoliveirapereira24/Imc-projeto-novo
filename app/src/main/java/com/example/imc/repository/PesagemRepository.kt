package com.example.imc.repository

import android.content.Context
import com.example.imc.model.Pesagem

class PesagemRepository(var context: Context) {

    fun getListaPesagem(): List<Pesagem> {

        val listaPesagem = mutableListOf<Pesagem>()

        // **   Preencher a lista de pesagem

        val dados = context
                .getSharedPreferences("usuario",
                Context.MODE_PRIVATE)

        val pesosStrings = dados.getString("pesagem", "")
        // "81; 79; 90; 80; 71

        val pesos = pesosStrings!!.split(";").toTypedArray()

        val datasStrings = dados.getString("data_pesagem", "")
        //  "2021-11-29;2021-11-29;2021-11-29;2021-11-29"
        val datas = datasStrings!!.split("/").toTypedArray()

        //  CRIAR A LISTA DE PESAGEM

        for (i in 0 until pesos.size - 1){
            val pesagem = Pesagem(datas[i], pesos[i].toInt())
            listaPesagem.add(pesagem)
        }


        return listaPesagem
    }

}
