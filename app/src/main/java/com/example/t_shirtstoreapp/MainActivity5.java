package com.example.t_shirtstoreapp;

import android.content.Intent;
import android.graphics.Color;
import android.os.Bundle;
import android.view.View;
import android.widget.Button;
import android.widget.ImageView;
import android.widget.TextView;

import androidx.activity.EdgeToEdge;
import androidx.appcompat.app.AppCompatActivity;
import androidx.core.graphics.Insets;
import androidx.core.view.ViewCompat;
import androidx.core.view.WindowInsetsCompat;

public class MainActivity5 extends AppCompatActivity {
    TextView textView19,textView24,textView25,textView26,textView35,textView37;
    ImageView imageView2;
    Button button;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main5);

        textView19 = findViewById(R.id.textView19);
        textView24 = findViewById(R.id.textView24);
        textView25 = findViewById(R.id.textView25);
        textView26 = findViewById(R.id.textView26);
        imageView2 = findViewById(R.id.imageView2);
        textView35 = findViewById(R.id.textView35);
        textView37 = findViewById(R.id.textView37);
        button = findViewById(R.id.conf_btn);


        String name = getIntent().getStringExtra("tname");
        int  price = getIntent().getIntExtra("price",0);
        String color = getIntent().getStringExtra("color");
        int count = getIntent().getIntExtra("count",0);
        String size = getIntent().getStringExtra("size");
        String CusName = getIntent().getStringExtra("cuz");

        textView19.setText(name);
        textView24.setText(String.valueOf(price));
        textView25.setText(color);
        textView26.setText(String.valueOf(count));
        textView35.setText(size);

        int Total = price * count;
        textView37.setText("Rs: "+Total);


        int imageResId = getResources().getIdentifier(name.toLowerCase(), "drawable", getPackageName());
        if (imageResId != 0) {
            imageView2.setImageResource(imageResId);
        } else {
            imageView2.setImageResource(R.drawable.default_image); // fallback image
        }

        button.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                Intent intent = new Intent(MainActivity5.this,MainActivity6.class);
                intent.putExtra("cus",CusName);
                startActivity(intent);
            }
        });






    }
}