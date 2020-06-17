package com.example.myapplication

import android.os.Bundle
import android.view.View
import android.widget.AdapterView
import android.widget.ArrayAdapter
import androidx.appcompat.app.AppCompatActivity
import kotlinx.android.synthetic.main.activity_pregunta.*

class PreguntaActivity : AppCompatActivity() {
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_pregunta)

        val items = listOf("Material", "Design", "Components", "Android")
        val list: MutableList<String> = ArrayList()
        list.add("Física")
        list.add("Biología")
        list.add("Lenguaje")
        list.add("Matemáticas")
        list.add("Historia")

        val adapter = ArrayAdapter(this, R.layout.support_simple_spinner_dropdown_item, list)
        asignatura.adapter = adapter
        asignatura.onItemSelectedListener = object : AdapterView.OnItemSelectedListener{
            override fun onNothingSelected(parent: AdapterView<*>?) {
            }

            override fun onItemSelected(
                parent: AdapterView<*>?,
                view: View?,
                position: Int,
                id: Long
            ) {
                val item :String = list[position]

            }
        }
    }
}