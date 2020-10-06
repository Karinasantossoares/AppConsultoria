package com.example.programaconsultoria

import android.content.Intent
import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import kotlinx.android.synthetic.main.activity_main.*

class MainActivity : AppCompatActivity() {
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_main)

        bt_menu_cliente.setOnClickListener {
            val intent = Intent(this, ClienteActivity::class.java)
            startActivity(intent)
        }
        bt_menu_empresa.setOnClickListener {
            val intent = Intent(this, EmpresaActivity::class.java)
            startActivity(intent)
        }
        bt_menu_servico.setOnClickListener {
            val intent = Intent(this,ServicoActivity::class.java)
            startActivity(intent)

        }
        bt_menu_contato.setOnClickListener {
            val intent = Intent(this,ContatoActivity::class.java)
            startActivity(intent)

        }
        }
    }
