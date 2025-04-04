package com.comunidadedevspace.imc

import android.os.Bundle
import android.widget.Button
import androidx.appcompat.app.AppCompatActivity
import com.google.android.material.textfield.TextInputEditText

class MainActivity : AppCompatActivity() {
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_main)

        // Recuperar os componentes EditTExt
        // Criar uma variavél e associar o componente de UI<EditText>
        // Recuperar o botao da tela

        //Colocar a açao no botom
        //Recuperar o texto digitado edtpeso

        val edtPeso = findViewById<TextInputEditText>(R.id.edt_peso)
        val edtAltura = findViewById<TextInputEditText>(R.id.edt_altura)

        val btncalcular = findViewById<Button>(R.id.btn_calcular)

        btncalcular.setOnClickListener {
            val peso: Float = edtPeso.text.toString().toFloat()
            val altura : Float = edtAltura.text.toString().toFloat()

            val alturaQ2 = altura * altura
            val resultado = peso / alturaQ2
            println("leo acao do botao" + altura)
        }

    }
}