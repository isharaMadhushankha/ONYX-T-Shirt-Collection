package com.example.t_shirtstoreapp;

import android.content.Intent;
import android.graphics.Color;
import android.os.Bundle;
import android.view.View;
import android.widget.Button;
import android.widget.ImageView;
import android.widget.RadioGroup;
import android.widget.SeekBar;
import android.widget.TextView;

import androidx.appcompat.app.AppCompatActivity;

public class MainActivity4 extends AppCompatActivity {
    TextView textView15, textView16, textView22;
    ImageView imageView;
    SeekBar seekBar;
    RadioGroup radioGroup, RadioGroup2;
    String tname;
    String cusname;
    String color;
    Button button3;
    int price;
    int count;
    String size;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main4);

        textView15 = findViewById(R.id.textView15);
        textView16 = findViewById(R.id.textView16);
        imageView = findViewById(R.id.imageView);
        seekBar = findViewById(R.id.seekBar);
        radioGroup = findViewById(R.id.radioGroup);
        textView22 = findViewById(R.id.textView22);
        button3 = findViewById(R.id.button3);
        RadioGroup2 = findViewById(R.id.radioButton2);

        cusname = getIntent().getStringExtra("cuz");
        tname = getIntent().getStringExtra("Tname");
        price = getIntent().getIntExtra("price", 0);
        textView15.setText(tname);
        textView16.setText(String.valueOf(price));

        int imageResId = getResources().getIdentifier(tname.toLowerCase(), "drawable", getPackageName());
        if (imageResId != 0) {
            imageView.setImageResource(imageResId);
        } else {
            imageView.setImageResource(R.drawable.default_image); // fallback image
        }

        seekBar.setOnSeekBarChangeListener(new SeekBar.OnSeekBarChangeListener() {
            @Override
            public void onProgressChanged(SeekBar seekBar, int progress, boolean fromUser) {
                textView22.setText(String.valueOf(progress));

                count = progress;
            }

            @Override
            public void onStartTrackingTouch(SeekBar seekBar) {}

            @Override
            public void onStopTrackingTouch(SeekBar seekBar) {}
        });

        button3.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {


                int selectedId = radioGroup.getCheckedRadioButtonId();
                if (selectedId == R.id.red) {
                    color = "red";
                } else if (selectedId == R.id.blue) {
                    color = "blue";
                } else {
                    color = "yellow";
                }


                int selectedId2 = RadioGroup2.getCheckedRadioButtonId();
                if (selectedId2 == R.id.M) {
                    size = "M";
                } else if (selectedId2 == R.id.L) {
                    size = "L";
                } else {
                    size = "XL";
                }

                Intent intent = new Intent(MainActivity4.this, MainActivity5.class);
                intent.putExtra("tname", tname);
                intent.putExtra("price", price);
                intent.putExtra("color", color);
                intent.putExtra("count", count);
                intent.putExtra("size", size);
                intent.putExtra("cuz", cusname);
                startActivity(intent);
            }
        });
    }
}
