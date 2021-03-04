package com.travel.bofy;

import androidx.appcompat.app.AppCompatActivity;

import android.media.Image;
import android.media.MediaPlayer;
import android.os.Bundle;
import android.content.Intent;
import android.view.View;
import android.widget.Button;
import android.widget.ImageButton;

public class YlyyActivity extends AppCompatActivity {
   private Button mPlay, mPause;
    private MediaPlayer mMediaplayer;
    private ImageButton imageButton2;
    private Button mPlay1, mPause1;
    private MediaPlayer mMediaplayer1;
    private MediaPlayer mMediaplayer2;
    private Button mPLay2, mPause2;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_ylyy);
        mPause = findViewById(R.id.pause1);
        mPlay = findViewById(R.id.play1);
        mMediaplayer = MediaPlayer.create(this,R.raw.bof);
        mPlay.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                mMediaplayer.start();
            }
        });

        mPause.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                    mMediaplayer.pause();
                }

        });
        imageButton2 = findViewById(R.id.imageButton2);
        imageButton2.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                openPlatonActivity();
            }
        });
        mPause1 = findViewById(R.id.pause2);
        mPlay1 = findViewById(R.id.play2);
        mMediaplayer1 = MediaPlayer.create(this,R.raw.bof1);
        mPlay1.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                mMediaplayer1.start();
            }
        });
        mPause1.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                mMediaplayer1.pause();
            }
        });
        mPause2 = findViewById(R.id.pause3);
        mPLay2 = findViewById(R.id.play3);
        mMediaplayer2 = MediaPlayer.create(this,R.raw.bof2);
        mPLay2.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                mMediaplayer2.start();
            }

            });
        mPause2.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                mMediaplayer2.pause();
            }
        });


    }
    public void openPlatonActivity(){
        Intent intent = new Intent(this, PlatonActivity.class);
        startActivity(intent);
    }
}