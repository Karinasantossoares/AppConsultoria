package com.example.programaconsultoria

import android.content.Intent
import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import kotlinx.android.synthetic.main.activity_cliente.*

class ClienteActivity : AppCompatActivity() {
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_cliente)

        btn_cadastrar_cliente.setOnClickListener {
            val nome :String = et_nome.text.toString()
            val cpf : String = et_cpf.text.toString()
            val rg :String = et_rg.text.toString()
            val codigo = et_codigo_cliente.text.toString()
            val intent = Intent(this, CadastroClienteActivity::class.java)
            intent.putExtra(CadastroClienteActivity.EXTRA_NAME, nome)
            intent.putExtra(CadastroClienteActivity.EXTRA_CPF, cpf)
            intent.putExtra(CadastroClienteActivity.EXTRA_RG, rg)
            intent.putExtra(CadastroClienteActivity.EXTRA_CODIGO, codigo)
            startActivity(intent)


        }
    }
}