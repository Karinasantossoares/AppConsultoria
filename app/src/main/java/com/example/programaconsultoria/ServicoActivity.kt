package com.example.programaconsultoria

import android.content.Intent
import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import kotlinx.android.synthetic.main.activity_servico.*

class ServicoActivity : AppCompatActivity() {
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_servico)

        bt_cadastrar_funcionario.setOnClickListener {
            val intent = Intent(this,CadastrarFuncionarioActivity::class.java)
            startActivity(intent)
        }
        bt_cadastrar_produto_servico.setOnClickListener {
            val intent = Intent(this, CadastrarProdutoActivity::class.java)
            startActivity(intent)
        }

    }
}