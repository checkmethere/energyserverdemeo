package com.example.energysaverdemo;

import androidx.appcompat.app.AppCompatActivity;

import android.content.Intent;
import android.os.Bundle;
import android.view.View;
import android.widget.ImageView;

public class VideoAnimation extends AppCompatActivity {
    ImageView imageViewAnimFwd;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_video_animation);

        imageViewAnimFwd = findViewById(R.id.imageViewAnimFwd);
        imageViewAnimFwd.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                Intent intent = new Intent(VideoAnimation.this,EndSaveElectricity.class);
                startActivity(intent);
                finish();
            }
        });
    }
}