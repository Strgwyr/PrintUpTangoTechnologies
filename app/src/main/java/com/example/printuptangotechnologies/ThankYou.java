package com.example.printuptangotechnologies;

import androidx.appcompat.app.AppCompatActivity;

import android.content.Intent;
import android.os.Bundle;
import android.view.View;
import android.widget.Button;

public class ThankYou extends AppCompatActivity implements View.OnClickListener {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_thank_you);

        Button backtoprinting = findViewById(R.id.backtoprinting);


        backtoprinting.setOnClickListener(this);



    }

    @Override
    public void onClick(View v) {

        Intent i = new Intent(ThankYou.this, Inapp.class
        );

        startActivity(i);




        switch (v.getId()) {
            case R.id.backtoprinting:
                startActivity(i);


                break;

        }
    }
}