package com.example.programaconsultoria

import android.content.Intent
import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import kotlinx.android.synthetic.main.activity_lista_produto.*

class ListaProdutoActivity : AppCompatActivity() {
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_lista_produto)


        val extras = intent.extras
        extras?.getString(EXTRA_NOME_PRODUTO).let{ nomeProduto->
            tv_visualizar_nome_produto.text = nomeProduto
        }

        extras?.getDouble(EXTRA_VALOR_PRODUTO).let{valorProduto->
            tv_visualizar_valor_produto.text= valorProduto.toString()

        }
        extras?.getString(EXTRA_QTD_PRODUTO).let{qtdProduto->
            tv_visualizar_id_funcionario.text= qtdProduto
        }

        btn_voltar_main_produto.setOnClickListener {
            val intent = Intent(this, MainActivity::class.java)
            startActivity(intent)
            finish()
        }

    }

    companion object{
        val EXTRA_NOME_PRODUTO = "EXTRA_NOME_PRODUTO"
        val EXTRA_VALOR_PRODUTO = "EXTRA_VALOR_PRODUTO"
        val EXTRA_QTD_PRODUTO = "EXTRA_QTD_PRODUTO"
    }
}