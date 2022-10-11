package com.example.providenceuniversity;

import androidx.appcompat.app.AppCompatActivity;

import android.content.Intent;
import android.os.Bundle;
import android.view.View;
import android.view.View.OnClickListener;
import android.widget.Button;
import android.widget.EditText;
import android.widget.Toast;

import java.io.BufferedReader;
import java.io.InputStream;
import java.io.InputStreamReader;
import java.net.HttpURLConnection;
import java.net.URL;

public class signinifo extends AppCompatActivity {
    private Button button1;
    private String cus_id;
    private String cus_pw;
    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_signinifo);
        button1 = findViewById(R.id.btn1);
        EditText id = findViewById(R.id.et_name);
        EditText pw = findViewById(R.id.et_pw);
        button1.setOnClickListener(new View.OnClickListener(){
            @Override
            public void onClick(View view) {
                System.out.println("123123");
                cus_id = id.getText().toString();
                cus_pw = pw.getText().toString();
                System.out.println(cus_id);
                new thdConnectDB().start();
            }
        });


    }
    public class thdConnectDB extends Thread{


        @Override
        public void run() {
            super.run();

            try {
                System.out.println("start");
                String strSql = "select * from member";
                String strURL = "http://114.35.85.201:8080/insert.php?cus_id="+cus_id+"&cus_pw="+cus_pw;


                URL url = new URL(strURL);
                //insert into(member_id,member_name) values(b,234);
                HttpURLConnection connection = (HttpURLConnection) url.openConnection();
                connection.setRequestMethod("POST");
                connection.setDoOutput(true);
                connection.setDoInput(true);
                connection.setUseCaches(false);
                connection.connect();

                int responseCode = connection.getResponseCode();

                if(responseCode == HttpURLConnection.HTTP_OK){
                    InputStream inputStream = connection.getInputStream();
                    BufferedReader bufferedReader = new BufferedReader(new InputStreamReader(inputStream, "utf-8"), 8);
                    String line = null;
                    boolean isWork = true;
                    while ((line = bufferedReader.readLine()) != null){
                       // if(line.equals("<body>")) {isWork = true;}
                        if (isWork){

                            String[] splitted = line.split(",");
                            for (int i=0; i<splitted.length; i++){
                                System.out.println(splitted[i]);
                            }
                        }

                    }
                    System.out.println("456489749856165");
                    Intent intent = new Intent();
                    intent.setClass(signinifo.this,MainActivity.class);
                    startActivity(intent);
                    inputStream.close();

                }
            } catch (Exception e){
                System.out.println(e.toString());
                System.out.println(e.toString());
            }
        }
    }
}
