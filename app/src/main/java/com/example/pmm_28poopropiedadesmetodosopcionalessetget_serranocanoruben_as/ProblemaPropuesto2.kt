package com.example.pmm_28poopropiedadesmetodosopcionalessetget_serranocanoruben_as

import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import com.example.pmm_28poopropiedadesmetodosopcionalessetget_serranocanoruben_as.databinding.ActivityProblemaPropuesto2Binding

class ProblemaPropuesto2 : AppCompatActivity() {
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_problema_propuesto2)

        val binding = ActivityProblemaPropuesto2Binding.inflate(layoutInflater)
        setContentView(binding.root)

        binding.btnTirar30.setOnClickListener {
            val dado = Dado(5)
            dado.tirar()
            binding.tvResult30.text = dado.toString()
        }


    }
}
class Dado(valor:Int){
    var valor = valor
    set(value) {
        if (value in 1..6){
            field = value
        } else
            field = 1
    }
    get() = field

    fun tirar(){
        this.valor = (1..6).random()
    }

    override fun toString(): String {
        return "Valor del dado: ${this.valor}"
    }


}