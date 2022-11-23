package com.example.quizapp

import android.content.Intent
import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import android.view.View
import android.widget.Button
import android.widget.EditText
import android.widget.TextView
import android.widget.Toast

class MainActivity : AppCompatActivity() {
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_main)
        var submit_btn:Button=findViewById(R.id.mainbutton)
        var username:TextView= findViewById(R.id.username)
        submit_btn.setOnClickListener()
        {
            if(username.text.isEmpty())
            {
                Toast.makeText(this, "Please enter user name", Toast.LENGTH_SHORT).show()
            }
            else{
                Toast.makeText(this, "Welcome " +username.text, Toast.LENGTH_SHORT).show()
                val intent = Intent(this,Question::class.java)
                startActivity(intent)
            }

        }
    }
}

