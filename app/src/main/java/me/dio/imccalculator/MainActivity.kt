package me.dio.imccalculator

import android.content.Intent
import android.os.Bundle
import androidx.appcompat.app.AppCompatActivity
import androidx.core.widget.doAfterTextChanged
import androidx.core.widget.doOnTextChanged
import kotlinx.android.synthetic.main.activity_main.*


class MainActivity : AppCompatActivity() {
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_main)
        setListeners()
    }

    private fun setListeners() {
        txtWeight?.doAfterTextChanged { text ->

        }

        txtHeight?.doOnTextChanged { text, _, _, _ ->

        }

        btCalculate?.setOnClickListener {
            calculateIMC(txtWeight.text.toString(), txtHeight.text.toString())
        }
    }

    private fun calculateIMC(weight: String, height: String) {
        val weight = weight.toFloatOrNull()
        val height = height.toFloatOrNull()

        if (weight != null && height != null) {
            val imc = weight / (height * height)

            val intent = Intent(this, ResultActivity::class.java)
            intent.putExtra("imc", imc)
            startActivity(intent)
        }
    }
}