package com.example.printuptangotechnologies;

import androidx.appcompat.app.AppCompatActivity;

import android.content.Intent;
import android.os.Bundle;
import android.view.View;
import android.widget.Button;

public class Inapp extends AppCompatActivity implements View.OnClickListener {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_inapp);

        Button proceed2 = findViewById(R.id.proceed2);


        proceed2.setOnClickListener(this);



    }

    @Override
    public void onClick(View v) {

        Intent i = new Intent(Inapp.this, preview.class
        );

        startActivity(i);




        switch (v.getId()) {
            case R.id.proceed2:
                startActivity(i);


                break;

        }
    }
}