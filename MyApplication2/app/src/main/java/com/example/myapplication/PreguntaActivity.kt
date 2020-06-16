package com.example.myapplication

import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import android.widget.ArrayAdapter
import android.widget.AutoCompleteTextView
import kotlinx.android.synthetic.main.activity_pregunta.*

class PreguntaActivity : AppCompatActivity() {
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_pregunta)

        val items = listOf("Material", "Design", "Components", "Android")
        val adapter = ArrayAdapter(applicationContext, R.layout.activity_pregunta, items)
        (Asignatura.editText as? AutoCompleteTextView)?.setAdapter(adapter)

    }
}