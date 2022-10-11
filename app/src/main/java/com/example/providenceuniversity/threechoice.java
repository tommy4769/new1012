package com.example.providenceuniversity;

import androidx.appcompat.app.AppCompatActivity;

import android.content.Intent;
import android.os.Bundle;
import android.view.View;
import android.widget.ImageButton;

public class threechoice extends AppCompatActivity {
    private ImageButton button2,button3,button4;
    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_threechoice);
        button2 = findViewById(R.id.imageButtonsearch);
        button3 = findViewById(R.id.imageButtonsearch1);
        button4 = findViewById(R.id.imageButtonsearch2);
        button2.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                Intent intent = new Intent();
                intent.setClass( threechoice .this,restaurantsearch.class);
                startActivity(intent);
            }
        });
        button3.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                Intent intent = new Intent();
                intent.setClass( threechoice .this,drinksearch.class);
                startActivity(intent);
            }
        });
        button4.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                Intent intent = new Intent();
                intent.setClass( threechoice .this,drestsearch.class);
                startActivity(intent);
            }
        });
    }
}