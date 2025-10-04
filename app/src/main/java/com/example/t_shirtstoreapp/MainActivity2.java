package com.example.t_shirtstoreapp;

import android.content.Intent;
import android.os.Bundle;
import android.view.View;
import android.widget.Button;
import android.widget.EditText;
import android.widget.TextView;

import androidx.activity.EdgeToEdge;
import androidx.appcompat.app.AppCompatActivity;
import androidx.core.graphics.Insets;
import androidx.core.view.ViewCompat;
import androidx.core.view.WindowInsetsCompat;

public class MainActivity2 extends AppCompatActivity {
    EditText editText1,editText2;

    TextView textView44,textView43;
    Button button;
    String Username;
    String Password;

    String regUser = "";
    String regPass = "";

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main2);

        regUser = getIntent().getStringExtra("user");
        regPass = getIntent().getStringExtra("pass");

        editText1 = findViewById(R.id.editTextText1);
        editText2 = findViewById(R.id.editTextTextPassword1);
        button = findViewById(R.id.button2);
        textView43 = findViewById(R.id.textView43);
        textView44 = findViewById(R.id.textView44);


        button.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                Username = editText1.getText().toString();
                Password = editText2.getText().toString();


                if((Username.equals("ishara")&& Password.equals("ishara123")) || (Username.equals(regUser) && Password.equals(regPass)) ){
                    Intent intent = new Intent(MainActivity2.this,MainActivity3.class);
                    intent.putExtra("pass",Username);
                    startActivity(intent);

                }else{
                    editText1.setError("Invalid username or password");
                    editText2.setError("Invalid username or password");
                }
            }
        });

        textView43.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                Intent intent = new Intent(MainActivity2.this,MainActivityRegister.class);
                startActivity(intent);
            }
        });

    }
}