package com.example.t_shirtstoreapp;

import android.content.Intent;
import android.os.Bundle;
import android.view.View;
import android.widget.Button;
import android.widget.TextView;

import androidx.activity.EdgeToEdge;
import androidx.appcompat.app.AppCompatActivity;
import androidx.core.graphics.Insets;
import androidx.core.view.ViewCompat;
import androidx.core.view.WindowInsetsCompat;

public class MainActivity6 extends AppCompatActivity {
    TextView textView41;
    Button button,finish;
    String name;


    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main6);

        textView41 = findViewById(R.id.textView41);
        button = findViewById(R.id.button);
        finish = findViewById(R.id.button6);

        name = getIntent().getStringExtra("cus");

        textView41.setText(name+"!");

        button.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                Intent intent = new Intent(MainActivity6.this,MainActivity3.class);
                startActivity(intent);
            }
        });

        finish.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                finishAffinity();
            }
        });



    }
}