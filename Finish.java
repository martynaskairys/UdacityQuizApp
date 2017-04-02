package com.martynaskairys.udacityquizapp;

import android.content.Intent;
import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.view.View;

public class Finish extends AppCompatActivity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_finish);

        setTitle("Finish line");
    }

    public void goToStart(View view){

        Intent intent = new Intent(this, MainActivity.class);
        startActivity (intent);
    }


}
