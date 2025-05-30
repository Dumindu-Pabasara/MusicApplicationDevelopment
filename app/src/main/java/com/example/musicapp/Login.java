package com.example.musicapp;

import android.os.Bundle;
import android.widget.Button;
import android.widget.Toast;
import androidx.appcompat.app.AppCompatActivity;

public class Login extends AppCompatActivity {
    Button getStartBtn;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_login);

        getStartBtn = findViewById(R.id.loginButton);

        getStartBtn.setOnClickListener(view ->
                Toast.makeText(Login.this, "Starting app...", Toast.LENGTH_SHORT).show()

        );
    }
}