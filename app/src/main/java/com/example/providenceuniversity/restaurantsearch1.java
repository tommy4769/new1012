package com.example.providenceuniversity;

import androidx.appcompat.app.AppCompatActivity;

import android.content.Intent;
import android.os.Bundle;
import android.view.View;
import android.widget.ImageButton;

public class restaurantsearch1 extends AppCompatActivity {
    private ImageButton button2,button3,button4;
    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_restaurantsearch1);
        button2 = findViewById(R.id.imageButtonsearch);
        button2.setOnClickListener(new View.OnClickListener() {

            @Override
            public void onClick(View view) {
                Intent intent = new Intent();
                intent.setClass( restaurantsearch1 .this,restaurantmean1.class);
                startActivity(intent);
            }
        });
    }
}