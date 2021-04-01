package com.example.calculocombustivel

import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import android.view.View
import kotlinx.android.synthetic.main.activity_main.*

class MainActivity : AppCompatActivity() {
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_main)
    }

    fun click(view: View) {
        val str_gasolina = edit_text_preco_gasolina.text.toString()
        val str_alcool = edit_text_preco_alcool.text.toString()
        if (str_gasolina.isEmpty()){
            text_view_resultado.setText("Informe o valor da Gasolina")
        }else if (str_alcool.isEmpty()){
            text_view_resultado.setText("Informe o valor do Alcool")
        }else{
            calcularPreco()
        }
    }

    private fun calcularPreco() {
        var resultadoPreco: Double
        val valor_gasolina = edit_text_preco_gasolina.text.toString().toDouble()
        val valor_alcool = edit_text_preco_alcool.text.toString().toDouble()
        resultadoPreco = valor_alcool/valor_gasolina
        if( resultadoPreco >= 0.7 ){
            text_view_resultado.setText("Melhor utilizar Gasolina!")
        }else{
            text_view_resultado.setText("Melhor utilizar Álcool!")
        }
    }
}