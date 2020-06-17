package com.example.myapplication.ui.gallery

import android.content.Intent
import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import android.view.View
import com.example.myapplication.R
import com.example.myapplication.RespuestaActivity

class matematicasActivity : AppCompatActivity() {
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_matematicas)
    }

    fun respuesta(view: View){
        val intent = Intent (view.context, RespuestaActivity::class.java)
        startActivity(intent)
    }
}