package com.example.quizapp

import android.content.Intent
import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import android.widget.Button
import android.widget.RadioButton
import android.widget.TextView

class Question : AppCompatActivity() {
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_question)
        val question = QuestionSender.getQuestion()
        val quename = findViewById<TextView>(R.id.question_box)
        val op1 = findViewById<RadioButton>(R.id.option1)
        val op2 = findViewById<RadioButton>(R.id.option2)
        val op3 = findViewById<RadioButton>(R.id.option3)
        val op4 = findViewById<RadioButton>(R.id.option4)
        quename.text = ""+question[0].Qno+" "+question[0].Question
        op1.text = ""+question[0].Option1
        op2.text = ""+question[0].Option2
        op3.text = ""+question[0].Option3
        op4.text = ""+question[0].Option4
        var current = 1
        val result = Intent(this,ResultActivity::class.java)
        val max = question.size
        val nextbtn:Button=findViewById(R.id.next_btn)
        nextbtn.setOnClickListener()
        {

            if(current>=max)
            {
                startActivity(result)
            }
            else {
                quename.text = "" + question[current].Qno+ " " + question[current].Question
                op1.text = "" + question[current].Option1
                op2.text = "" + question[current].Option2
                op3.text = "" + question[current].Option3
                op4.text = "" + question[current].Option4
            }
            current++
        }
    }
}