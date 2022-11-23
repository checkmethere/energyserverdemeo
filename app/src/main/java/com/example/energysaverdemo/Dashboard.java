package com.example.energysaverdemo;

import androidx.appcompat.app.AppCompatActivity;

import android.annotation.SuppressLint;
import android.content.Intent;
import android.os.Bundle;
import android.view.View;
import android.widget.ImageView;

public class Dashboard extends AppCompatActivity {
    ImageView imageViewEnergy;
    ImageView imageViewSaveWater;


    @SuppressLint("MissingInflatedId")
    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_dashboard);

        imageViewEnergy = findViewById(R.id.imageViewEnergy);
        imageViewSaveWater = findViewById(R.id.imageViewSaveWater);
        Intent intent = getIntent();


        imageViewEnergy.setOnClickListener(view -> {
            Intent intent1 = new Intent(Dashboard.this,StepOne.class);
            startActivity(intent1);
            finish();            });

        imageViewSaveWater.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                Intent intent = new Intent(Dashboard.this,StepOne.class);
                startActivity(intent);
                finish();
            }
        });

    }
}