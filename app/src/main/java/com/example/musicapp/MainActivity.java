package com.example.musicapp;

import android.os.Bundle;
import android.widget.Button;
import android.widget.Toast;
import androidx.appcompat.app.AppCompatActivity;

public class MainActivity extends AppCompatActivity {
    Button getStartBtn;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);

        getStartBtn = findViewById(R.id.getStartBtn);

        getStartBtn.setOnClickListener(view ->
                Toast.makeText(MainActivity.this, "Starting app...", Toast.LENGTH_SHORT).show()
        );
    }
}
