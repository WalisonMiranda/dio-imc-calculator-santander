package me.dio.imccalculator

import android.annotation.SuppressLint
import android.os.Bundle
import androidx.appcompat.app.AppCompatActivity
import kotlinx.android.synthetic.main.activity_result.*

class ResultActivity : AppCompatActivity() {
    @SuppressLint("ResourceAsColor")
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_result)

        val bundle = intent.extras
        if (bundle != null) {
            val imc:Float = bundle.get("imc") as Float
            txtImc.text = "%.2f".format(imc)

            /*when {
                imc < 18.5 -> textView2.setTextColor(R.color.purple_500)
                imc in 18.5..24.9 -> textView3.setTextColor(R.color.purple_500)
                imc in 25.0..29.9 -> textView4.setTextColor(R.color.purple_500)
                imc in 30.0..39.9 -> textView5.setTextColor(R.color.purple_500)
                imc > 40.0 -> textView6.setTextColor(R.color.purple_500)
            }*/
        }
    }
}