package com.martynaskairys.udacityquizapp;

import android.content.Intent;
import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.view.View;
import android.widget.Toast;

import static com.martynaskairys.udacityquizapp.R.id.radioButton;

public class QuestionTwo extends AppCompatActivity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_question_two);

        setTitle("Question 2");

    }

    public void showInfo (View view){

        Intent intent = new Intent(QuestionTwo.this, QuestionThree.class);
        startActivity (intent);

    }

    public void backToLastQuestion(View view){

        onBackPressed();


    }

}
