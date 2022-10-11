package com.example.providenceuniversity;

import androidx.appcompat.app.AppCompatActivity;

import android.content.Intent;
import android.os.Bundle;


import android.view.View;
import android.widget.ImageButton;

public class userfunction extends AppCompatActivity {
    private ImageButton button2,button3,button4;
    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_userfunction);
        button2 = findViewById(R.id.imageButtonsearch);
        button2.setOnClickListener(new View.OnClickListener() {

            @Override
            public void onClick(View view) {
                Intent intent = new Intent();
                intent.setClass( userfunction .this,MainActivity2.class);
                startActivity(intent);
            }
        });
    }
}