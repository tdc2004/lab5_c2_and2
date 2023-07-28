package com.chinhtd.lab5_c2_and2;

import androidx.annotation.NonNull;
import androidx.appcompat.app.AppCompatActivity;

import android.os.Bundle;
import android.view.MenuItem;

import com.google.android.material.bottomnavigation.BottomNavigationView;
import com.google.android.material.navigation.NavigationBarView;

public class bai3 extends AppCompatActivity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_bai3);
        BottomNavigationView view = findViewById(R.id.bottom_nav);
        getSupportFragmentManager().beginTransaction().add(R.id.content_bottom,new HoemFragment()).commit();

        view.setOnItemReselectedListener(new NavigationBarView.OnItemReselectedListener() {
            @Override
            public void onNavigationItemReselected(@NonNull MenuItem item) {
                int i = item.getItemId();
                if (i == R.id.navigation_home){
                    getSupportFragmentManager().beginTransaction().replace(R.id.content_bottom,new HoemFragment()).commit();
                }else if (i == R.id.navigation_dashboard) {
                    getSupportFragmentManager().beginTransaction().replace(R.id.content_bottom, new mapFragment()).commit();
                }else if (i == R.id.navigation_notifications) {
                    getSupportFragmentManager().beginTransaction().replace(R.id.content_bottom, new imageFragment()).commit();
                }
            }
        });
    }
}