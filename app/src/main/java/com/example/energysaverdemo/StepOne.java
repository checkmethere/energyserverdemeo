package com.example.energysaverdemo;

import androidx.appcompat.app.AppCompatActivity;

import android.content.Intent;
import android.os.Bundle;
import android.view.View;
import android.widget.Button;
import android.widget.ImageView;

public class StepOne extends AppCompatActivity {
    Button btnBackStepOne;
    ImageView imageViewStepOne;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_step_one);



        imageViewStepOne.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                Intent intent = new Intent(StepOne.this,StepTwo.class);
                startActivity(intent);
                finish();
            }
        });

    }
}