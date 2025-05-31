package com.example.musicapp;

import android.content.Intent; //
import android.os.Bundle;
import android.view.View;
import android.widget.Button;
import androidx.appcompat.app.AppCompatActivity;

public class MainActivity extends AppCompatActivity {

    Button getStartBtn;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);

        getStartBtn = findViewById(R.id.getStartBtn); // Make sure this ID matches XML

        getStartBtn.setOnClickListener(view -> {
            Intent intent = new Intent(MainActivity.this, Login.class);
            startActivity(intent);
        });
    }
}