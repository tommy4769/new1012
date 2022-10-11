package com.example.providenceuniversity;


import android.graphics.drawable.Drawable;
import android.os.Bundle;
import android.service.autofill.OnClickAction;
import android.view.View;
import android.widget.Button;
import android.widget.ImageView;
import android.widget.TextView;
import android.widget.Toast;

import androidx.appcompat.app.AppCompatActivity;

import java.util.Random;

public class random extends AppCompatActivity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_random);

        Button rollButton = findViewById(R.id.btnrandom);

        rollButton.setText("幫你選啦");

//        给按钮rollButton设置点击监听器，一旦用户点击按钮，就触发监听器的onClick方法
        rollButton.setOnClickListener(new View.OnClickListener() {
            public void onClick(View v) {

//                产生随机数
                Random rand = new Random();
                int randNumber = rand.nextInt(6) + 1;
//                String randNumber2 = rand.nextInt(3)+1;

//                获取对ImageView对象的引用
                ImageView diceImage = findViewById(R.id.iv3);

                int drawableResource;
//                将随机数与对应的图片资源联系起来
                switch (randNumber) {
                    case 1:
                        drawableResource = R.drawable.img_7;
                        break;
                    case 2:
                        drawableResource = R.drawable.img_3;
                        break;
                    case 3:
                        drawableResource = R.drawable.img_8;
                        break;
                    case 4:
                        drawableResource = R.drawable.img_4;
                        break;
                    case 5:
                        drawableResource = R.drawable.img_5;
                        break;
                    case 6:
                        drawableResource = R.drawable.img_6;
                        break;
                    default:
                        throw new IllegalStateException("Unexpected value: " + randNumber);

                }

//                随机图片根据rangNumber的值对应drawableResource的int值，实例Drawable类
                Drawable drawable = getBaseContext().getResources().getDrawable(drawableResource);

//                设置ImageView控件最终显示的图片
                diceImage.setImageDrawable(drawable);
            }
        });


    }}
