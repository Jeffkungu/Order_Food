package com.foodapp.foodapp;

import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.view.View;
import android.widget.Button;

public class MainActivity extends AppCompatActivity implements View.OnClickListener {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);
        Button buttonSignUp = findViewById(R.id.buttonSignUp);
        Button buttonLogIn = findViewById(R.id.buttonLogIn);

        buttonSignUp.setOnClickListener(this);
        buttonLogIn.setOnClickListener(this);
    }

    @Override
    public void onClick(View view) {

    }
}
