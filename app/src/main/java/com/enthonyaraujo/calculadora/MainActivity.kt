package com.enthonyaraujo.calculadora

import android.os.Bundle
import android.widget.Button
import android.widget.TextView
import androidx.activity.enableEdgeToEdge
import androidx.appcompat.app.AppCompatActivity
import androidx.core.view.ViewCompat
import androidx.core.view.WindowInsetsCompat
import com.enthonyaraujo.calculadora.databinding.ActivityMainBinding
import org.mariuszgromada.math.mxparser.Expression

class MainActivity : AppCompatActivity() {
    private lateinit var binding:ActivityMainBinding

    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        enableEdgeToEdge()
        binding = ActivityMainBinding.inflate(layoutInflater)
        setContentView(binding.root)

        val operacao = binding.operacao

        binding.um.setOnClickListener {
            operacao.text = "${operacao.text}1"
        }
        binding.dois.setOnClickListener {
            operacao.text = "${operacao.text}2"
        }
        binding.tres.setOnClickListener {
            operacao.text = "${operacao.text}3"
        }
        binding.quatro.setOnClickListener {
            operacao.text = "${operacao.text}4"
        }
        binding.cinco.setOnClickListener {
            operacao.text = "${operacao.text}5"
        }
        binding.seis.setOnClickListener {
            operacao.text = "${operacao.text}6"
        }
        binding.sete.setOnClickListener {
            operacao.text = "${operacao.text}7"
        }
        binding.oito.setOnClickListener {
            operacao.text = "${operacao.text}8"
        }
        binding.nove.setOnClickListener {
            operacao.text = "${operacao.text}9"
        }
        binding.zero.setOnClickListener {
            operacao.text = "${operacao.text}0"
        }
        binding.multiplicaAo.setOnClickListener {
            operacao.text = "${operacao.text}×"
        }
        binding.divisO.setOnClickListener {
            operacao.text = "${operacao.text}÷"
        }
        binding.subtraO.setOnClickListener {
            operacao.text = "${operacao.text}-"
        }
        binding.soma.setOnClickListener {
            operacao.text = "${operacao.text}+"
        }
        binding.parenteses1.setOnClickListener {
            operacao.text = "${operacao.text}("
        }
        binding.parenteses2.setOnClickListener {
            operacao.text = "${operacao.text})"
        }
        binding.ponto.setOnClickListener {
            operacao.text = "${operacao.text}."
        }
        binding.potencia.setOnClickListener {
            operacao.text = "${operacao.text}^2"
            // operacao.text = "${operacao.text}²" == "${operacao.text}**2"
        }
        binding.apagar.setOnClickListener {
            operacao.text = operacao.text.dropLast(1)
        }
        binding.AC.setOnClickListener {
            operacao.text = " "
            binding.resultado.text = " "
        }
        binding.igual.setOnClickListener {
            val resultado = Expression(operacao.text.toString()).calculate()

            if(resultado.isNaN()){
                binding.resultado.text = ""
            }else{
                binding.resultado.text = resultado.toString()
            }

        }
    }
}