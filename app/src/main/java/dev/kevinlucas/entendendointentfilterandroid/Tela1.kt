package dev.kevinlucas.entendendointentfilterandroid

import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import android.view.View

class Tela1 : AppCompatActivity() {
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_tela1)
    }

    fun voltar(view: View?){
        finish()
    }
}