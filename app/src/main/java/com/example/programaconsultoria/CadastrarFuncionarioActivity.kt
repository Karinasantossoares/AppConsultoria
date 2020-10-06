package com.example.programaconsultoria

import android.content.Intent
import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import android.widget.Toast
import kotlinx.android.synthetic.main.activity_cadastrar_funcionario.*

class CadastrarFuncionarioActivity : AppCompatActivity() {
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_cadastrar_funcionario)

        btn_sistema_cadastro_funcionario.setOnClickListener {
            val nomeFuncionario = et_nome_funcionarioo.text.toString()
            val funcaoFuncionario= et_funcao_funcionario.text.toString()
            val idFuncionario = et_id_funcionario.text.toString()
            val intent = Intent(this,ListaFuncionariosActivity::class.java)
            intent.putExtra(ListaFuncionariosActivity.EXTRA_NOME, nomeFuncionario)
            intent.putExtra(ListaFuncionariosActivity.EXTRA_FUNCAO, funcaoFuncionario)
            intent.putExtra(ListaFuncionariosActivity.EXTRA_ID, idFuncionario)
            startActivity(intent)


        }
        btn_voltar_cadastro_funcionario.setOnClickListener {
            val intent = Intent(this, MainActivity::class.java)
            startActivity(intent)
            finish()
        }


    }
}