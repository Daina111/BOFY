package com.travel.bofy;

import androidx.appcompat.app.AppCompatActivity;
import android.content.Intent;
import android.view.View;
import android.widget.Button;

import android.os.Bundle;
public class TotoActivity extends AppCompatActivity {
    private Button button12;
    private Button button13;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_toto);
        button12 = findViewById(R.id.button12);
        button12.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                openPlatonActivity();
            }
        });
        button13 = findViewById(R.id.button13);
        button13.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                openKylActivity();
            }
        });
    }
    public void openPlatonActivity() {
        Intent intent = new Intent(this, PlatonActivity.class);
        startActivity(intent);
    }
    public void openKylActivity(){
        Intent intent = new Intent(this, KylActivity.class);
        startActivity(intent);
    }
    }