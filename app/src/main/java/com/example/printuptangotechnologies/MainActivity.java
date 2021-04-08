package com.example.printuptangotechnologies;

import androidx.appcompat.app.AppCompatActivity;

import android.content.Intent;
import android.os.Bundle;
import android.view.View;
import android.widget.Button;

public class MainActivity extends AppCompatActivity implements View.OnClickListener {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);


        Button proceed = findViewById(R.id.proceed);


        proceed.setOnClickListener(this);



    }

    @Override
    public void onClick(View v) {

        Intent i = new Intent(MainActivity.this, Login.class
        );

        startActivity(i);




        switch (v.getId()) {
            case R.id.proceed:
                startActivity(i);


                break;

        }
    }
}