package com.example.programaconsultoria

import android.content.Intent
import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import kotlinx.android.synthetic.main.activity_cadastro_cliente.*

class CadastroClienteActivity : AppCompatActivity() {
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_cadastro_cliente)

        val extras = intent.extras
        extras?.getString(EXTRA_NAME)?.let { nome->
            tv_nome.text = nome

        }

        extras?.getString(EXTRA_CPF)?.let { cpf->
            tv_cpf.text = cpf

        }

        extras?.getString(EXTRA_RG)?.let { rg->
            tv_rg.text = rg

        }
        extras?.getString(EXTRA_CODIGO)?.let {codigo->
            tv_codigo.text = codigo

        }
        btn_voltar_cadastro_cliente.setOnClickListener {
            val intent = Intent(this, MainActivity:: class.java)
            startActivity(intent)
        }
    }

    companion object{
    const val EXTRA_NAME ="EXTRA_NAME"
    const val EXTRA_CPF ="EXTRA_CPF"
    const val EXTRA_RG="EXTRA_RG"
    const val EXTRA_CODIGO="EXTRA_CODIGO"
    }
}