package com.example.providenceuniversity;

import androidx.appcompat.app.AppCompatActivity;

import android.os.Bundle;
import android.view.View;
import android.widget.Button;
import android.widget.TextView;

public class restaurantmean1 extends AppCompatActivity {


        Button button1,button2,button3,button4,button5,button6,button7,button8,button9,button10,button11,button12,button13;
        TextView text1;
        int x = 0;
        int sum = 0;
    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_restaurantmean1);

        button1 = findViewById(R.id.btn1);
        button2 = findViewById(R.id.btn2);
        button3 = findViewById(R.id.btn3);
        button4 = findViewById(R.id.btn4);
        button5 = findViewById(R.id.btn5);
        button6 = findViewById(R.id.btn6);
        button7 = findViewById(R.id.btn7);
        button8 = findViewById(R.id.btn8);
        button9 = findViewById(R.id.btn9);
        button10 = findViewById(R.id.btn10);
        button11 = findViewById(R.id.btn11);
        button12 = findViewById(R.id.btn12);
        button13 = findViewById(R.id.btn13);
        text1 = findViewById(R.id.textView4);

        View.OnClickListener myonclicklistener = new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                if(x == 0) {
                    switch (view.getId()){
                        case R.id.btn1:
                            sum = sum + 65;
                            break;
                        case R.id.btn2:
                            sum = sum +60;
                            break;
                        case R.id.btn3:
                            sum = sum +60;
                            break;
                        case R.id.btn4:
                            sum = sum +70;
                            break;
                        case R.id.btn5:
                            sum = sum +70;
                            break;
                        case R.id.btn6:
                            sum = sum +70;
                            break;
                        case R.id.btn7:
                            sum = sum +70;
                            break;
                        case R.id.btn8:
                            sum = sum +70;
                            break;
                        case R.id.btn9:
                            sum = sum +70;
                            break;
                        case R.id.btn10:
                            sum = sum +60;
                            break;
                        case R.id.btn11:
                            sum = sum +70;
                            break;
                        case R.id.btn12:
                            sum = sum +60;
                            break;
                        case R.id.btn13:
                            sum = 0;
                            break;

                    }
                        text1.setText("熱兩總共是" + sum);
                }
            }
        };
            button1.setOnClickListener(myonclicklistener);
            button2.setOnClickListener(myonclicklistener);
            button3.setOnClickListener(myonclicklistener);
            button4.setOnClickListener(myonclicklistener);
            button5.setOnClickListener(myonclicklistener);
            button6.setOnClickListener(myonclicklistener);
            button7.setOnClickListener(myonclicklistener);
            button8.setOnClickListener(myonclicklistener);
            button9.setOnClickListener(myonclicklistener);
            button10.setOnClickListener(myonclicklistener);
            button11.setOnClickListener(myonclicklistener);
            button12.setOnClickListener(myonclicklistener);
            button13.setOnClickListener(myonclicklistener);
    }
}