package com.example.t_shirtstoreapp;

import android.content.Intent;
import android.graphics.Color;
import android.os.Bundle;
import android.view.View;
import android.widget.Button;
import android.widget.EditText;
import android.widget.TextView;

import androidx.appcompat.app.AppCompatActivity;

public class MainActivityRegister extends AppCompatActivity {

    EditText editTextText, editTextTextPassword, editTextTextPassword3;
    TextView textView48;
    Button button;

    String username, password, cpassword;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main_register);

        textView48 = findViewById(R.id.textView48);
        editTextText = findViewById(R.id.editTextText);
        editTextTextPassword = findViewById(R.id.editTextTextPassword);
        editTextTextPassword3 = findViewById(R.id.editTextTextPassword3);
        button = findViewById(R.id.button4);

        button.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {

                username = editTextText.getText().toString();
                password = editTextTextPassword.getText().toString();
                cpassword = editTextTextPassword3.getText().toString();

                if (!password.equals(cpassword)) {
                    textView48.setTextColor(Color.RED);
                    textView48.setText("Password is not matching");
                    return;
                }

                textView48.setText("User Registered Successfully!");
                textView48.setTextColor(Color.GREEN);

                Intent intent = new Intent(MainActivityRegister.this,MainActivity2.class);
                intent.putExtra("user",username);
                intent.putExtra("pass",password);
                startActivity(intent);
            }
        });
    }
}
