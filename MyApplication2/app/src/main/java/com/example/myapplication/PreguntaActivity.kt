package com.example.myapplication

import android.os.Bundle
import android.view.View
import android.widget.AdapterView
import android.widget.ArrayAdapter
import android.widget.AutoCompleteTextView
import androidx.appcompat.app.AppCompatActivity
import kotlinx.android.synthetic.main.activity_pregunta.*

class PreguntaActivity : AppCompatActivity() {
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_pregunta)

        val list: MutableList<String> = ArrayList()
        list.add("Física")
        list.add("Biología")
        list.add("Lenguaje")
        list.add("Matemáticas")
        list.add("Historia")

        val adapter = ArrayAdapter(this, R.layout.support_simple_spinner_dropdown_item, list)
        (Asignatura.editText as? AutoCompleteTextView)?.setAdapter(adapter)
    }
}