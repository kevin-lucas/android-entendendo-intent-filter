package dev.kevinlucas.entendendointentfilterandroid

import android.content.Intent
import android.net.Uri
import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import android.view.View

class MainActivity : AppCompatActivity() {
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_main)
    }

    fun dispararAcaoTela(view: View?) {
        val intent = Intent("ACAO_TELA") // mensagem sendo enviado para o S.O
        startActivity(intent)
    }

    fun dispararAcaoTelaCategoriaTela(view: View?) {
        val intent = Intent("ACAO_TELA") // mensagem sendo enviado para o S.O
        intent.addCategory("CATEGORIA_TELA") // adiciona uma categoria
        startActivity(intent)
    }

    fun abrirNavegador(view: View?) {
        val uri = Uri.parse("https://google.com.br")
        val intent = Intent(Intent.ACTION_VIEW, uri)
        startActivity(intent)
    }
}