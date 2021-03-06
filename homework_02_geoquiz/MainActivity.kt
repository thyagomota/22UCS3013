package edu.msudenver.geoquiz

/*
 * CS3013 - Mobile App Dev. - Summer 2022
 * Instructor: Thyago Mota
 * Description: Homework 02 - MainActivity
 */

import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import android.view.View
import android.widget.Button
import android.widget.TextView
import android.widget.Toast

class MainActivity : AppCompatActivity() {

    private val questionBank = listOf<Question>(
        Question("Canberra is the capital of Australia", true),
        Question("The Pacific Ociean is larger than the Atlantic Ocean", true),
        Question("The Suez Canal connects the Red Sea and the Indian Ocean", false),
        Question("The source of the Nile River is in Egypt", false),
        Question("The Amazon River is the longest river in the Americas", true),
        Question("Lake Baikal is the world\'s oldest and deepest freshwater lake", true)
    )
    private var currentIndex = 0

    private lateinit var trueButton: Button
    private lateinit var falseButton: Button
    private lateinit var nextButton: Button
    private lateinit var questionTextView: TextView

    // TODO: show a Toast with a "correct" or "incorrect" depending on how the current question was answered
    private fun checkAnswer(userAnswer: Boolean) {
        
    }

    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_main)

        // TODO: get the reference to "questionTextView" and use it to update the displayed text for the current question
        

        // get the reference to "trueButton" and use it to set the button's listener
        trueButton = findViewById(R.id.true_button)
        trueButton.setOnClickListener { _: View -> checkAnswer(true)}

        // get the reference to "falseButton"
        falseButton = findViewById(R.id.false_button)
        falseButton.setOnClickListener { _: View -> checkAnswer(false)}

        // get the reference to "nextButton"
        nextButton = findViewById(R.id.next_button)

        // TODO: set the button's listener, moving to the next question and updating the displayed text; if already at the last question, move to the first question
        
    }
}