package com.akhileshgoit.slopecalculator

import android.app.Activity
import android.content.Intent
import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import android.service.autofill.UserData
import android.widget.Button
import android.widget.TextView
import kotlinx.android.synthetic.main.activity_main.*
import kotlinx.android.synthetic.main.activity_result.*

class Result : AppCompatActivity() {

//    lateinit var resTextView: TextView

    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_result)

        val number:Number = intent.getSerializableExtra("number") as Number


        x1_textView.text = number.x1Value.toString()
        x2_textView.text = number.x2Value.toString()
        y1_textView.text = number.y2Value.toString()
        y2_textView.text = number.y2Value.toString()

        val cancelButton:Button = findViewById(R.id.cancel_button)

        Details.userName = intent.getStringExtra("username").toString()

        welcome_textView.setText("Welcome " + Details.userName + "!!!")


        slope_btn.setOnClickListener {

//            x1_textView.text.toString()

            res_textView.text =
                x1_textView.text.toString().toInt().plus(x2_textView.text.toString().toInt()).toString()

        }


        cancelButton.setOnClickListener {
            setResult(Activity.RESULT_CANCELED)
            finish()
        }

    }
}
