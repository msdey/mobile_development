package com.example.assignment2;

import androidx.appcompat.app.AppCompatActivity;

import android.content.Intent;
import android.os.Bundle;
import android.view.View;
import android.widget.Button;
import android.widget.EditText;
import android.widget.TextView;
import android.widget.Toast;

public class MainActivity extends AppCompatActivity {
    EditText name, dob, address, city, pincode, email, mobile, interest, profile, experience;

    public void registerButton(View view){
        name = (EditText) findViewById(R.id.editName);
        dob  = (EditText) findViewById(R.id.editBirthday);
        address  = (EditText) findViewById(R.id.editAddress);
        pincode  = (EditText) findViewById(R.id.editPin);
        email  = (EditText) findViewById(R.id.editEmail);
        mobile  = (EditText) findViewById(R.id.editMobile);
        interest  = (EditText) findViewById(R.id.editInterest);
        profile = (EditText) findViewById(R.id.editProfile);
        experience  = (EditText) findViewById(R.id.editExperience);
        city = (EditText) findViewById(R.id.editCity);

        String Name = name.getText().toString();
        String Dob = dob.getText().toString();
        String Pincode = pincode.getText().toString();
        String  Email = email.getText().toString();
        String Mobile = mobile.getText().toString();
        String Interest = interest.getText().toString();
        String Profile = profile.getText().toString();
        String Experience = experience.getText().toString();
        String City = city.getText().toString();
        String Address = address.getText().toString();

        String answer;

        answer = (String) " " + Name + "\n" + Dob + "\n"+ Address + "\n" + City + "\n" + Pincode+ "\n" + Email+ "\n"+ Mobile + "\n" + Interest + "\n" + Profile+ "\n"+ Experience;

        Toast.makeText(getApplicationContext(), "Registered Successfully !", Toast.LENGTH_LONG).show();
        Intent intent = new Intent(this, MainActivity2.class);
        intent.putExtra("answer", answer);
        startActivity(intent);


    }

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);
        Button button = (Button) findViewById(R.id.button);

        }
}