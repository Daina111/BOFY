package com.travel.bofy;

import androidx.appcompat.app.AppCompatActivity;
import android.content.Intent;
import android.view.View;
import android.widget.Button;
import android.os.Bundle;

public class RegisActivity extends AppCompatActivity {
    private Button button5;
    private Button button6;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_regis);
        button5 = findViewById(R.id.button5);
        button5.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                openTotoActivity();
            }
        });
        button6 = findViewById(R.id.button6);
        button6.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                openRegistrActivity();
            }
        });
    }
    public void openTotoActivity() {
        Intent intent = new Intent(this, TotoActivity.class);
        startActivity(intent);
    };
    public void openRegistrActivity() {
        Intent intent = new Intent(this, RegistrActivity.class);
        startActivity(intent);
    };
    }
