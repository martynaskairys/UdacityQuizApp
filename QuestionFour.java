package com.martynaskairys.udacityquizapp;

import android.content.Intent;
import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.view.View;

public class QuestionFour extends AppCompatActivity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_question_four);

        setTitle("Question 4");

    }


public void goToFinish(View view){

    Intent intent = new Intent(this, Finish.class);
    startActivity(intent);


}


    public void backToLastQuestion(View view){

        onBackPressed();


    }
}
