package com.example.programaconsultoria

import android.content.Intent
import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import kotlinx.android.synthetic.main.activity_lista_funcionarios_cadastrados.*

class ListaFuncionariosActivity : AppCompatActivity() {
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_lista_funcionarios_cadastrados)

        val extras = intent.extras
            extras?.getString(EXTRA_NOME).let{nomeFuncioario->
                tv_visualizar_nome_funcionarioo.text = nomeFuncioario
            }
            extras?.getString(EXTRA_FUNCAO).let { funcao->
                tv_visualizar_funcao_funcionario.text = funcao
            }
            extras?.getString(EXTRA_ID).let { id->
                tv_visualizar_id_funcionario.text = id
            }

        btn_voltar_main.setOnClickListener {
            val intent = Intent(this,MainActivity::class.java)
            startActivity(intent)
            finish()
        }
    }

    companion object {
        const val EXTRA_NOME = "EXTRA.NOME"
        const val EXTRA_FUNCAO = "EXTRA.FUNCAO"
        const val EXTRA_ID = "EXTRA.ID"

    }

}