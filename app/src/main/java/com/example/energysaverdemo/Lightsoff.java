package com.example.energysaverdemo;

import androidx.appcompat.app.AppCompatActivity;

import android.annotation.SuppressLint;
import android.content.Intent;
import android.os.Bundle;
import android.view.View;
import android.widget.ImageView;

public class Lightsoff extends AppCompatActivity {
    ImageView imageViewenSaved;

    @SuppressLint("MissingInflatedId")
    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_lightsoff);

        imageViewenSaved = findViewById(R.id.imageViewenSaved);
        imageViewenSaved.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                Intent intent = new Intent(Lightsoff.this, StepOne.class);
                startActivity(intent);
                finish();
            }
        });

    }
}