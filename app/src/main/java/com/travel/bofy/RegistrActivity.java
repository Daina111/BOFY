package com.travel.bofy;

import androidx.appcompat.app.AppCompatActivity;
import android.content.Intent;
import android.view.View;
import android.widget.Button;

import android.os.Bundle;

public class RegistrActivity extends AppCompatActivity {
    private Button button2;
    private Button button3;
    private Button button56;


    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_registr);
        button2 = findViewById(R.id.button2);
        button2.setOnClickListener(new View.OnClickListener() {

            @Override
            public void onClick(View v) {
                openRegisActivity();
            }
        });
        button3 = findViewById(R.id.button3);
        button3.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                openVotActivity();
            }
        });
        button56 = findViewById(R.id.button56);
        button56.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                openTotoActivity();
            }
        });
    }

    public void openRegisActivity() {
        Intent intent = new Intent(this, RegisActivity.class);
        startActivity(intent);
    }

    public void openVotActivity() {
        Intent intent = new Intent(this, VotActivity.class);
        startActivity(intent);
    }

    public void openTotoActivity() {
        Intent intent = new Intent(this, TotoActivity.class);
        startActivity(intent);
    }
}
