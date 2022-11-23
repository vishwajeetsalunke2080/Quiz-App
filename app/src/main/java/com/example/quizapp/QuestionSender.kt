package com.example.quizapp

object QuestionSender {
    fun getQuestion():ArrayList<QuestionStore>
    {
        val questions = ArrayList<QuestionStore>()
        val q1 = QuestionStore("Q1)","In which year did India got Freedom ?","1498","1974","2021","1947","4")
        val q2 = QuestionStore("Q2)","Who is the current President of India ?","Ram Lakshman","Draupadi Murmu","Danny Daniels","Narendra Modi","2")
        val q3 = QuestionStore("Q3)","Which is the National fruit of India ?","Apple","Kiwi","Mango","Jack Fruit","3")
        val q4 = QuestionStore("Q4)","Who is the captain of Indian Cricket Team ?","Rohit Sharma","Virat Kohli","MS Dhoni","R Ashwin","2")
        val q5 = QuestionStore("Q5)","Which is the biggest country in the world ?","Russia","India","Austrailia","Japan","1")
        val q6 = QuestionStore("Q6)","When is Children's Day celebrated ?","14 Aug","7 June","30 July","14 Nov","4")
        val q7 = QuestionStore("Q7)","When do we celebrate Independence Day in India ?","4 Mar","15 Jan","21 Dec","15th Aug","4")
        val q8 = QuestionStore("Q8)","Who is known as Iron Man of India ?","Sardar Vallabhai Patel","Johnny Sins","Narendra Modi","You","1")
        val q9 = QuestionStore("Q9)","Pune is located in which state ?","Haryana","Maharashtra","Kerala","Gujarat","2")
        val q10 = QuestionStore("Q10)","Who is Johnny Sins ?","Doctor","Plumber","Astronaut","All of them","4")
        questions.add(q1)
        questions.add(q2)
        questions.add(q3)
        questions.add(q4)
        questions.add(q5)
        questions.add(q6)
        questions.add(q7)
        questions.add(q8)
        questions.add(q9)
        questions.add(q10)

        return questions
    }
}