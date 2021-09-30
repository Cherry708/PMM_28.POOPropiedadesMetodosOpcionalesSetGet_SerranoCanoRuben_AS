package com.example.pmm_28poopropiedadesmetodosopcionalessetget_serranocanoruben_as

import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import com.example.pmm_28poopropiedadesmetodosopcionalessetget_serranocanoruben_as.databinding.ActivityProblemaPropuesto1Binding

class ProblemaPropuesto1 : AppCompatActivity() {
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_problema_propuesto1)

        val binding = ActivityProblemaPropuesto1Binding.inflate(layoutInflater)
        setContentView(binding.root)

        binding.btnEnter20.setOnClickListener {
            val empleado = Empleado(
                binding.etName20.text.toString(),
            binding.etSalario20.text.toString().toDouble())
            binding.tvResult20.text = empleado.toString()
        }

    }
}
class Empleado(nombre:String,salario:Double){
    var nombre = nombre
    set(value) {
        field = value
    }
    get() = field
    var salario = salario
    set(value) {
        if (value >= 0)
            field = value
        else
            throw Exception("El salario no puede ser inferior a cero")
    }
    get() = field

    override fun toString(): String {
        return "Empleado: $nombre, salario: $salario"
    }


}