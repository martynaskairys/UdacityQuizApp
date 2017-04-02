package com.martynaskairys.udacityquizapp;

import android.content.Intent;
import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.view.View;
import android.widget.Button;

public class QuestionThree extends AppCompatActivity {


    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_question_three);

        setTitle("Question 3");


click();

    }

    public void click()

    {
        Button btn = (Button) findViewById(R.id.button4);

        btn.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {

                Intent intent = new Intent(QuestionThree.this, QuestionFour.class);
                startActivity(intent);

            }
        });

    }

    public void backToLastQuestion(View view){

        onBackPressed();


    }
   /* public void goToFour (View view){


                Intent intent = new Intent (QuestionThree.this, QuestionFour.class);
                startActivity (intent);



    }*/






}
