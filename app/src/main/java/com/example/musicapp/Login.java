//package com.example.musicapp;
//
//import android.os.Bundle;
//import android.widget.Button;
//import android.widget.Toast;
//import androidx.appcompat.app.AppCompatActivity;
//
//public class Login extends AppCompatActivity {
//    Button getStartBtn;
//
//    @Override
//    protected void onCreate(Bundle savedInstanceState) {
//        super.onCreate(savedInstanceState);
//        setContentView(R.layout.activity_login);
//
//        getStartBtn = findViewById(R.id.loginButton);
//
//        getStartBtn.setOnClickListener(view ->
//                Toast.makeText(Login.this, "Starting app...", Toast.LENGTH_SHORT).show()
//
//        );
//
//    }
//}

package com.example.musicapp;

import android.content.Intent;
import android.os.Bundle;
import android.view.View;
import android.widget.Button;
import android.widget.TextView;
import android.widget.Toast;
import androidx.appcompat.app.AppCompatActivity;

public class Login extends AppCompatActivity {
    Button getStartBtn;
    TextView signUpText; // signup textView එක declare කරන්න

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_login);

        // Log In button action
        getStartBtn = findViewById(R.id.loginButton);
        getStartBtn.setOnClickListener(view ->
                Toast.makeText(Login.this, "Starting app...", Toast.LENGTH_SHORT).show()
        );

        getStartBtn.setOnClickListener(view -> {
            Intent intent = new Intent(Login.this, Home_activity.class);
            startActivity(intent);


            // Sign Up text click එක handle කරන්න
            signUpText = findViewById(R.id.signUpText);
            signUpText.setOnClickListener(new View.OnClickListener() {
                @Override
                public void onClick(View v) {
                    // MainActivity2 එකට යන්න
                    Intent intent = new Intent(Login.this, MainActivity2.class);
                    startActivity(intent);
                }
            });
        });
    }
}
