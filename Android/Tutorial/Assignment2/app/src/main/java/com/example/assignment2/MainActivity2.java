package com.example.assignment2;

import androidx.appcompat.app.AppCompatActivity;

import android.app.ActionBar;
import android.content.Intent;
import android.os.Bundle;
import android.widget.TextView;

public class MainActivity2 extends AppCompatActivity {



    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main2);

        Intent intent= getIntent();

        String field = " Name \n Birthday \n Address \n City \n Pincode \n Email id \n Mobile \n Interest \n Profile \n Experience ";

        String answer = (String) intent.getExtras().get("answer");

        TextView myText1 = (TextView) findViewById(R.id.activity2Text1);
        myText1.setText(field);

        TextView myText2 = (TextView) findViewById(R.id.activity2Text2);
        myText2.setText(answer);




    }
}