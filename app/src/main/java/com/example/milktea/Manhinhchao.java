package com.example.milktea;

import androidx.appcompat.app.AppCompatActivity;

import android.content.Intent;
import android.os.Bundle;
import android.os.Handler;

public class Manhinhchao extends AppCompatActivity {
    //thoi gian chờ
    int time_out = 3000;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_manhinhchao);
        new Handler().postDelayed(new Runnable() {
            @Override
            public void run() {
                Intent intent = new Intent(Manhinhchao.this,MainActivity.class);
                startActivity(intent);
                finish();
            }
        },time_out);
    }
}