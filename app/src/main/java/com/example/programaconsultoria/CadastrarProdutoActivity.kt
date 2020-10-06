package com.example.programaconsultoria

import android.content.Intent
import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import kotlinx.android.synthetic.main.activity_cadastrar_funcionario.*
import kotlinx.android.synthetic.main.activity_cadastrar_produto.*

class CadastrarProdutoActivity : AppCompatActivity() {
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_cadastrar_produto)

        btn_cadastrar_produto.setOnClickListener {
            val nomeProduto = et_nome_produto.text.toString()
            val valorProduto = et_valor_produto.text.toString().toDouble()
            val qtdProduto = et_quantidade_produto.text.toString()
            val intent = Intent(this,ListaProdutoActivity::class.java)
            intent.putExtra(ListaProdutoActivity.EXTRA_NOME_PRODUTO, nomeProduto)
            intent.putExtra(ListaProdutoActivity.EXTRA_VALOR_PRODUTO,valorProduto)
            intent.putExtra(ListaProdutoActivity.EXTRA_QTD_PRODUTO,qtdProduto)
            startActivity(intent)
        }
        btn_voltar_produto.setOnClickListener {
            val intent =Intent(this,MainActivity::class.java)
            startActivity(intent)
            finish()
        }

    }
}