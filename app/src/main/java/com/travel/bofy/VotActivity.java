package com.travel.bofy;

import androidx.appcompat.app.AppCompatActivity;
import android.content.Intent;
import android.view.View;
import android.widget.Button;

import android.os.Bundle;

public class VotActivity extends AppCompatActivity {
    private Button button14;
    private Button button15;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_vot);
        button14 = findViewById(R.id.button14);
        button14.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                openTotoActivity();
            }
        });
        button15 = findViewById(R.id.button15);
        button15.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                openRegistrActivity();
            }
        });
    }

    public void openTotoActivity() {
        Intent intent = new Intent(this, TotoActivity.class);
        startActivity(intent);
    }
    public void openRegistrActivity() {
        Intent intent = new Intent(this, RegistrActivity.class);
        startActivity(intent);
    }
}
