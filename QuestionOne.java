package com.martynaskairys.udacityquizapp;

import android.content.Intent;
import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.view.View;
import android.widget.Button;
import android.widget.RadioButton;
import android.widget.RadioGroup;
import android.widget.Toast;

public class QuestionOne extends AppCompatActivity {

    private RadioGroup radioGroup;
    private RadioButton radioButton;
    private Button btnDisplay;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_question_one);

        setTitle("Question 1");


        addListenerOnButton();

    }

    public void addListenerOnButton() {

        radioGroup = (RadioGroup) findViewById(R.id.radio);
        btnDisplay = (Button) findViewById(R.id.button2);


        btnDisplay.setOnClickListener(new View.OnClickListener() {

            @Override
            public void onClick(View v) {

                if (radioGroup.isSelected()) {

                    // get selected radio button from radioGroup
                    int selectedId = radioGroup.getCheckedRadioButtonId();

                    // find the radiobutton by returned id
                    radioButton = (RadioButton) findViewById(selectedId);
                    String radiovalue = ((RadioButton) findViewById(radioGroup.getCheckedRadioButtonId())).getText().toString();

//ToDo toast not working for some reason
                    Toast.makeText(QuestionOne.this,
                            radioButton.getText(), Toast.LENGTH_SHORT).show();
                }


                Intent intent = new Intent(QuestionOne.this, QuestionTwo.class);
                startActivity(intent);


            }

        });

    }

    public void backToLastQuestion(View view){

        onBackPressed();


    }


}
