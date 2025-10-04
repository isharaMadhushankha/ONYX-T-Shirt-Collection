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

public class MainActivity3 extends AppCompatActivity {
    TextView textView11;
    Button btn1,btn2,btn3,btn4;
    String CusName;
    int[] price = {1500,1700,1900,2000};
    String[] Tname = {"onyx11","onyx22","onyx33","onyx55"};


    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main3);

        CusName = getIntent().getStringExtra("pass");

        textView11 = findViewById(R.id.textView11);
        btn1 = findViewById(R.id.btn1);
        btn2 = findViewById(R.id.btn2);
        btn3 = findViewById(R.id.btn3);
        btn4 = findViewById(R.id.btn4);

        textView11.setText("Hello! "+CusName+" select your choice");

        btn1.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                Intent intent = new Intent(MainActivity3.this,MainActivity4.class);
                intent.putExtra("cuz",CusName);
                intent.putExtra("price",price[0]);
                intent.putExtra("Tname",Tname[0]);
                startActivity(intent);
            }
        });
        btn2.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                Intent intent = new Intent(MainActivity3.this,MainActivity4.class);
                intent.putExtra("cuz",CusName);
                intent.putExtra("price",price[1]);
                intent.putExtra("Tname",Tname[1]);
                startActivity(intent);
            }
        });
        btn3.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                Intent intent = new Intent(MainActivity3.this,MainActivity4.class);
                intent.putExtra("cuz",CusName);
                intent.putExtra("price",price[2]);
                intent.putExtra("Tname",Tname[2]);
                startActivity(intent);
            }
        });
        btn4.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                Intent intent = new Intent(MainActivity3.this,MainActivity4.class);
                intent.putExtra("cuz",CusName);
                intent.putExtra("price",price[3]);
                intent.putExtra("Tname",Tname[3]);
                startActivity(intent);
            }
        });




    }
}