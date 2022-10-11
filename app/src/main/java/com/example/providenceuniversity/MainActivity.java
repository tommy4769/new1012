package com.example.providenceuniversity;



import androidx.appcompat.app.AppCompatActivity;

import android.content.Intent;
import android.os.Bundle;
import android.view.View;
import android.widget.Button;
import android.widget.Toast;
import android.widget.EditText;
import java.io.BufferedReader;
import java.io.InputStream;
import java.io.InputStreamReader;
import java.net.HttpURLConnection;
import java.net.URL;
public class MainActivity extends AppCompatActivity {
    private Button button1,button2,button3;
    private String cus_id;
    private String cus_pw;
    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);
        button1 = findViewById(R.id.btn_login);
        button2 = findViewById(R.id.btn_sign);
        EditText id = findViewById(R.id.et_1);
        EditText pw = findViewById(R.id.et_2);
        button1.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {//登入
                cus_id = id.getText().toString();
                cus_pw = pw.getText().toString();
                System.out.println(cus_id);
                new thdConnSelectDB().start();

              /*  Intent intent = new Intent();
                intent.setClass(MainActivity.this,MainActivity2.class);
                startActivity(intent);*/
            }
        });
        button2.setOnClickListener(new View.OnClickListener() {//註冊
            @Override
            public void onClick(View view) {
               /* System.out.println("778888777ss");
              cus_id = id.getText().toString();
              cus_pw = pw.getText().toString();
                System.out.println(cus_id);
                new thdConnectDB().start();*/
                Intent intent = new Intent();
                intent.setClass(MainActivity.this,signinifo.class);
                startActivity(intent);
            }

        });
    }



    public class thdConnectDB extends Thread{


        @Override
        public void run() {
            super.run();

            try {

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
                    boolean isWork = false;
                    while ((line = bufferedReader.readLine()) != null){
                        if(line.equals("<body>")) {isWork = true;}
                        if (isWork){
                            String[] splitted = line.split(",");
                            for (int i=0; i<splitted.length; i++){
                                System.out.println(splitted[i]);
                            }
                        }

                    }
                    inputStream.close();
                }
            } catch (Exception e){
                System.out.println(e.toString());
                System.out.println(e.toString());
            }




        }
    }


    public class thdConnSelectDB extends Thread{


        @Override
        public void run() {
            super.run();

            try {

                String strSql = "select * from member";
                String strURL = "http://114.35.85.201:8080/select.php?cus_id="+cus_id+"&cus_pw="+cus_pw;

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
                  //  boolean isWork = false;
                    while ((line = bufferedReader.readLine()) != null){
                  //      if(line.equals("<body>")) {isWork = true;}
                  //      if (isWork){
                            String[] splitted = line.split(",");
                            for (int i=0; i<splitted.length; i++){
                                System.out.println("22345678");
                                System.out.println(splitted[i]);
                                if(splitted[i].contains("login")) {
                                    System.out.println("aaaaaaaa");
                                    Intent intent = new Intent();
                                    intent.setClass(MainActivity.this,userfunction.class);
                                    startActivity(intent);
                                    break;
                                }else{
                                    //Toast.makeText(MainActivity.this,"q4w5d61sda56d1wq56d",Toast.LENGTH_SHORT).show();
                                    runOnUiThread(() -> Toast.makeText(MainActivity.this, "帳號密碼輸入錯誤", Toast.LENGTH_SHORT).show());
                                }
                            }
                 //       }

                    }
                    inputStream.close();
                }
            } catch (Exception e){
                System.out.println(e.toString());
                System.out.println(e.toString());
            }




        }
    }


}