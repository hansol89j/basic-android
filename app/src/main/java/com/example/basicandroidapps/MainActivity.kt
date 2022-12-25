package com.example.basicandroidapps

import android.content.Intent
import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import android.widget.Button
import android.widget.EditText
import android.widget.Toast

class MainActivity : AppCompatActivity() {

    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_main)

        val heightEditText: EditText = findViewById(R.id.txt_height)
        val weightEditText = findViewById<EditText>(R.id.txt_weight)
        val resultButton = findViewById<Button>(R.id.btn_result)

        resultButton.setOnClickListener{
            if(heightEditText.text.isEmpty() || weightEditText.text.isEmpty()){
                Toast.makeText(this,"빈값이있습니다.",Toast.LENGTH_SHORT).show()
                return@setOnClickListener
            }

            val height:Int = heightEditText.text.toString().toInt()
            val weight:Int = weightEditText.text.toString().toInt()

            val intent = Intent(this,ResultActivity::class.java)

            intent.putExtra("height",height)
            intent.putExtra("weight",weight)
            startActivity(intent)
        }
    }
}
