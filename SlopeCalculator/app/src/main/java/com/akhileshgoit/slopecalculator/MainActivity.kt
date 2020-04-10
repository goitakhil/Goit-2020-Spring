package com.akhileshgoit.slopecalculator

import android.app.Activity
import android.content.Intent
import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import android.util.Log
import android.widget.Button
import android.widget.EditText
import android.widget.TextView
import kotlinx.android.synthetic.main.activity_main.*

class MainActivity : AppCompatActivity() {

    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_main)

        val button:Button = findViewById(R.id.ok_button)
        val x1value:EditText = findViewById(R.id.x1_editText)
        val x2value:EditText = findViewById(R.id.x2_editText)
        val y1value:EditText = findViewById(R.id.y1_editText)
        val y2value:EditText = findViewById(R.id.y2_editText)
//        val resTextView: TextView = findViewById(R.id.res_textView)


        button.setOnClickListener {


            val name:String = name_EditText.text.toString()

            val number:Number = com.akhileshgoit.slopecalculator.Number(x1value.text.toString().toInt(),
                x2value.text.toString().toInt(), y1value.text.toString().toInt(), y2value.text.toString().toInt())

            val intent:Intent = Intent(this, Result::class.java)
            intent.putExtra("number", number)
            intent.putExtra("username", name)

            startActivityForResult(intent, 12)

        }

    }

    override fun onActivityResult(requestCode: Int, resultCode: Int, data: Intent?) {
        super.onActivityResult(requestCode, resultCode, data)


        if (resultCode == Activity.RESULT_CANCELED){
            if(data != null) {
                Log.d("EA", "User cancelled!")
            }

        }
    }
}
