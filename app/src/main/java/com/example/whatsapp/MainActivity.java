package com.example.whatsapp;

import android.os.Bundle;
import android.widget.Button;
import android.widget.EditText;
import android.widget.Toast;

import androidx.appcompat.app.AppCompatActivity;

public class MainActivity extends AppCompatActivity {
    private final EditText usernameEditText = findViewById(R.id.activity_main_usernameEditText);
    private EditText passwordEditText;
    private final Button loginButton = findViewById(R.id.activity_main_loginButton);

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);
        passwordEditText = findViewById(R.id.activity_main_passwordEditText);

        loginButton.setOnClickListener(view -> {
            if(usernameEditText.getText().length()>0&& passwordEditText.getText().length() > 0){
                String toastMessage = "Username: "+usernameEditText.getText().toString()+", Password: "+passwordEditText.getText().toString();
                Toast.makeText(getApplicationContext(),toastMessage, Toast.LENGTH_SHORT).show();
            }
        });
    }
}