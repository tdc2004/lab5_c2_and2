package com.chinhtd.lab5_c2_and2;

import androidx.appcompat.app.AppCompatActivity;

import android.content.Intent;
import android.os.Bundle;
import android.view.View;


public class Activity_banner extends AppCompatActivity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_banner);

        findViewById(R.id.btn_Bai1).setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                Intent intent = new Intent(Activity_banner.this, MainActivity.class);
                startActivity(intent);
            }
        });
        findViewById(R.id.btn_Bai2).setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                Intent intent = new Intent(Activity_banner.this, bai3.class);
                startActivity(intent);
            }
        });
    }
}