package com.example.imc.ui

import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import android.widget.ImageView
import android.widget.TextView
import com.example.imc.R


class DashBoardActivity : AppCompatActivity() {

    lateinit var tvNome:TextView
    lateinit var tvProfissao:TextView
    lateinit var tvImc:TextView
    lateinit var tvNcd:TextView
    lateinit var tvPeso:TextView
    lateinit var tvIdade:TextView
    lateinit var tvAltura:TextView
    lateinit var tvPerfil:ImageView


    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_dashboard)

        supportActionBar!!.hide()

        tvNome = findViewById(R.id.dash_nome)
        tvProfissao = findViewById(R.id.tv_dash_profissao)
        tvImc = findViewById(R.id.tv_dash_imc)
        tvNcd = findViewById(R.id.tv_dash_data_nascimento)
        tvPeso = findViewById(R.id.tv_dash_peso)
        tvIdade = findViewById(R.id.tv_dash_idade)
        tvAltura = findViewById(R.id.tv_dash_altura)
        tvPerfil = findViewById(R.id.iv_dash_foto_perfil)

            carregarDashboard()

    }
    private fun carregarDashboard(){

            val arquivo = getSharedPreferences("usuario", MODE_PRIVATE)
        tvNome.text = arquivo.getString("nome", "")
        tvProfissao.text = arquivo.getString("profissao", "")
        tvAltura.text = arquivo.getFloat("altura", 0.0f).toString()
        
    }
}