package com.example.pmm_28poopropiedadesmetodosopcionalessetget_serranocanoruben_as

import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import android.widget.Button
import android.widget.TextView
import com.example.pmm_28poopropiedadesmetodosopcionalessetget_serranocanoruben_as.databinding.ActivityMainBinding

class MainActivity : AppCompatActivity() {
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_main)

        val binding = ActivityMainBinding.inflate(layoutInflater)
        val view = binding.root
        setContentView(view)

        binding.btnEnter10.setOnClickListener {
            val name = binding.etName10.text.toString()
            val age = binding.etAge10.text.toString().toInt()
            val persona = Persona(name,age)
            binding.tvResult10.text = persona.toString()
        }

    }
}
class Persona(nombre:String,edad:Int) {
    var nombre = nombre
        set(value) {
            field = value.uppercase()
        }
        get(){
            return "("+field+")"
        }
    var edad = edad
        set(value){
            if (value >= 0)
                field = value
            else
                throw Exception("No puedes introducir una edad inferior a 0")
        }
        get() {
            return field
        }

    override fun toString(): String {
        return "Persona: $nombre, $edad años"
    }


}