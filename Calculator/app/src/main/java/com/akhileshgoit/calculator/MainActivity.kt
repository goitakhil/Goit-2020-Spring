package com.akhileshgoit.calculator

import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import android.view.View
import android.widget.Button
import android.widget.EditText
import android.widget.TextView

class MainActivity : AppCompatActivity() {


    lateinit var productNameEditText: EditText

    lateinit var priceEditText: EditText


    lateinit var calButton: Button
    lateinit var catButton: Button

    lateinit var outputTextView: TextView
    lateinit var concatTextView: TextView


    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_main)


        productNameEditText = findViewById(R.id.product_name_edittext)
        priceEditText = findViewById(R.id.amount_edittext)


        calButton = findViewById(R.id.calc_button)
        catButton = findViewById(R.id.concat_button)

        outputTextView = findViewById(R.id.output_textview)
        concatTextView = findViewById(R.id.concat_textview)



        calButton.setOnClickListener {
            val myNum: Double = priceEditText.text.toString().toDouble()
            val totalPrice = "${myNum * 0.06 + myNum}"
            val outputString = "${productNameEditText.text}: $${totalPrice}"

            outputTextView.text = outputString
            outputTextView.visibility = View.VISIBLE
        }

        catButton.setOnClickListener {

            val input1 = productNameEditText.text
            val input2 = priceEditText.text
            val cOutputString = "Product name is ${input1} and Marked Price is $${input2}"

            concatTextView.text = cOutputString
            concatTextView.visibility = View.VISIBLE

        }

    }

}
