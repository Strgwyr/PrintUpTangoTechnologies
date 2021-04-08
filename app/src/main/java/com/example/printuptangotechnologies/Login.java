package com.example.printuptangotechnologies;

import androidx.appcompat.app.AppCompatActivity;

import android.content.Intent;
import android.os.Bundle;
import android.view.View;
import android.widget.Button;

public class Login extends AppCompatActivity implements View.OnClickListener {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_login);

        Button login = findViewById(R.id.login);


        login.setOnClickListener(this);



    }

    @Override
    public void onClick(View v) {

        Intent i = new Intent(Login.this, Inapp.class
        );

        startActivity(i);




        switch (v.getId()) {
            case R.id.login:
                startActivity(i);


                break;

        }
    }
}