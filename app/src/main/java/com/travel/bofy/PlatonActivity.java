package com.travel.bofy;

import androidx.appcompat.app.AppCompatActivity;

import android.media.MediaPlayer;
import android.os.Bundle;
import android.content.Intent;
import android.view.View;
import android.widget.Button;
import android.widget.ImageButton;

public class PlatonActivity extends AppCompatActivity {
    private ImageButton imageButton;
    private MediaPlayer mMediaplayer;
    private Button button7;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_platon);
        imageButton = findViewById(R.id.imageButton);
        imageButton.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                openTotoActivity();
            }
        });
        button7 = findViewById(R.id.button7);
        button7.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                openYlyyActivity();
            }
        });
    }
    public void openTotoActivity() {
        Intent intent = new Intent(this, TotoActivity.class);
        startActivity(intent);
    }
    public void openYlyyActivity(){
        Intent intent = new Intent(this, YlyyActivity.class);
        startActivity(intent);
    }
    }



