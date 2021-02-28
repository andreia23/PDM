package com.example.exercicio_semana03

import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import android.util.Log
import android.view.View
import android.widget.Button
import java.util.*

class MainActivity : AppCompatActivity() {
    private lateinit var botao: Button
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_main)

        this.botao = findViewById(R.id.btnCliqueAqui)
        this.botao.setOnClickListener({ clique(it) })
    }

    fun clique(view: View){
        var aleatorio = Random();
        for (i in 1..6) {
            Log.i("NOVOPROJETO", aleatorio.nextInt(60).toString())
        }
    }
}