package com.example.providenceuniversity;

import androidx.appcompat.app.AppCompatActivity;

import android.content.Intent;
import android.os.Bundle;
import android.view.View;
import android.widget.ImageButton;

public class restaurantsearch extends AppCompatActivity {
    private ImageButton button2,button3,button4,button5 ,button6,button7,button8,button9,button10,button11,button12,button13,button14,button15,button16 ,button17,button18,button19,button20,button21,button22,button23;
    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_restaurantsearch);
        button2 = findViewById(R.id.imageButtonsearch);
        button3 = findViewById(R.id.imageButtonsearch1);
        button4 = findViewById(R.id.imageButtonsearch2);
        button5 = findViewById(R.id.imageButtonsearch3);
        button6 = findViewById(R.id.imageButtonsearch4);
        button7 = findViewById(R.id.imageButtonsearch5);
        button8 = findViewById(R.id.imageButtonsearch6);
        button9 = findViewById(R.id.imageButtonsearch7);
        button10 = findViewById(R.id.imageButtonsearch8);
        button11 = findViewById(R.id.imageButtonsearch9);
        button12 = findViewById(R.id.imageButtonsearch10);
        button13 = findViewById(R.id.imageButtonsearch11);
        button14 = findViewById(R.id.imageButtonsearch12);
        button15 = findViewById(R.id.imageButtonsearch13);
        button16= findViewById(R.id.imageButtonsearch14);
        button17= findViewById(R.id.imageButtonsearch15);
        button18= findViewById(R.id.imageButtonsearch16);
        button19= findViewById(R.id.imageButtonsearch17);
        button20= findViewById(R.id.imageButtonsearch18);
        button21 = findViewById(R.id.imageButtonsearch19);
        button22 = findViewById(R.id.imageButtonsearch20);
        button23 = findViewById(R.id.imageButtonsearch21);






        button2.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                Intent intent = new Intent();
                intent.setClass(restaurantsearch.this,restaurantsearch1.class);
                startActivity(intent);
            }
        });
        button3.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                Intent intent = new Intent();
                intent.setClass(restaurantsearch.this,restaurantsearch2.class);
                startActivity(intent);
            }
        });
        button4.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                Intent intent = new Intent();
                intent.setClass(restaurantsearch.this,restaurantsearch3.class);
                startActivity(intent);
            }
        });

        button5.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                Intent intent = new Intent();
                intent.setClass(restaurantsearch.this,restaurantsearch4.class);
                startActivity(intent);
            }
        });
        button6.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                Intent intent = new Intent();
                intent.setClass(restaurantsearch.this,restaurantsearch5.class);
                startActivity(intent);
            }
        });
        button7.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                Intent intent = new Intent();
                intent.setClass(restaurantsearch.this,restaurantsearch6.class);
                startActivity(intent);
            }
        });
        button8.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                Intent intent = new Intent();
                intent.setClass(restaurantsearch.this,restaurantsearch7.class);
                startActivity(intent);
            }
        });
        button9.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                Intent intent = new Intent();
                intent.setClass(restaurantsearch.this,restaurantsearch8.class);
                startActivity(intent);
            }
        });
        button10.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                Intent intent = new Intent();
                intent.setClass(restaurantsearch.this,restaurantsearch9.class);
                startActivity(intent);
            }
        });
        button11.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                Intent intent = new Intent();
                intent.setClass(restaurantsearch.this,restaurantsearch10.class);
                startActivity(intent);
            }
        });

        button12.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                Intent intent = new Intent();
                intent.setClass(restaurantsearch.this,restaurantsearch11.class);
                startActivity(intent);
            }
        });
        button13.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                Intent intent = new Intent();
                intent.setClass(restaurantsearch.this,restaurantsearch12.class);
                startActivity(intent);
            }
        });

        button14.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                Intent intent = new Intent();
                intent.setClass(restaurantsearch.this,restaurantsearch13.class);
                startActivity(intent);
            }
        });
        button15.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                Intent intent = new Intent();
                intent.setClass(restaurantsearch.this,restaurantsearch14.class);
                startActivity(intent);
            }
        });
        button16.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                Intent intent = new Intent();
                intent.setClass(restaurantsearch.this,restaurantsearch15.class);
                startActivity(intent);
            }
        });
        button17.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                Intent intent = new Intent();
                intent.setClass(restaurantsearch.this,restaurantsearch16.class);
                startActivity(intent);
            }
        });
        button18.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                Intent intent = new Intent();
                intent.setClass(restaurantsearch.this,restaurantsearch17.class);
                startActivity(intent);
            }
        });
        button19.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                Intent intent = new Intent();
                intent.setClass(restaurantsearch.this,restaurantsearch18.class);
                startActivity(intent);
            }
        });
        button20.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                Intent intent = new Intent();
                intent.setClass(restaurantsearch.this,restaurantsearch19.class);
                startActivity(intent);
            }
        });
        button21.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                Intent intent = new Intent();
                intent.setClass(restaurantsearch.this,restaurantsearch20.class);
                startActivity(intent);
            }
        });
        button22.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                Intent intent = new Intent();
                intent.setClass(restaurantsearch.this,restaurantsearch21.class);
                startActivity(intent);
            }
        });
        button23.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                Intent intent = new Intent();
                intent.setClass(restaurantsearch.this,restaurantsearch22.class);
                startActivity(intent);
            }
        });
    }}