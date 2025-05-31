package com.example.musicapp;

import android.content.Intent;
import android.os.Bundle;
import com.google.android.material.snackbar.Snackbar;
import androidx.appcompat.app.AppCompatActivity;
import android.view.View;
import android.widget.Button;
import android.widget.CheckBox;
import android.widget.EditText;
import android.widget.TextView;

import androidx.navigation.NavController;
import androidx.navigation.Navigation;
import androidx.navigation.ui.AppBarConfiguration;
import androidx.navigation.ui.NavigationUI;
import com.example.musicapp.databinding.ActivityMain2Binding;

public class MainActivity2 extends AppCompatActivity {

    EditText name, email, password, confirmPassword;
    CheckBox agreeBox;
    Button signUpBtn;
    TextView signInText;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main2);

        name = findViewById(R.id.et_name);
        email = findViewById(R.id.et_email);
        password = findViewById(R.id.et_password);
        confirmPassword = findViewById(R.id.et_confirm_password);
        agreeBox = findViewById(R.id.cb_agree);
        signUpBtn = findViewById(R.id.btn_signup);
        signInText = findViewById(R.id.tv_signin);

        signUpBtn.setOnClickListener(v -> {
            // TODO: Add sign-up logic here
            Intent intent = new Intent(MainActivity2.this, Login.class);
            startActivity(intent);        });

        signInText.setOnClickListener(v -> {
            // TODO: Navigate to Login screen
            startActivity(new Intent(MainActivity2.this, Login.class));
        });
    }
}
