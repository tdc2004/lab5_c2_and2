package com.chinhtd.lab5_c2_and2;

import androidx.annotation.NonNull;
import androidx.appcompat.app.ActionBarDrawerToggle;
import androidx.appcompat.app.AppCompatActivity;
import androidx.appcompat.widget.Toolbar;
import androidx.drawerlayout.widget.DrawerLayout;
import androidx.fragment.app.Fragment;

import android.os.Bundle;
import android.view.MenuItem;

import com.google.android.material.navigation.NavigationView;

public class MainActivity extends AppCompatActivity {

    private DrawerLayout drawerLayout;
    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);
        drawerLayout = findViewById(R.id.drawer_layout);
        NavigationView view = findViewById(R.id.navigation_view);

        Toolbar toolbar = findViewById(R.id.toolbar);
        setSupportActionBar(toolbar);
        ActionBarDrawerToggle toggle = new ActionBarDrawerToggle(MainActivity.this,drawerLayout,toolbar,R.string.open,R.string.close);
        toggle.setDrawerIndicatorEnabled(true);
        toggle.syncState();
        drawerLayout.addDrawerListener(toggle);
        view.setNavigationItemSelectedListener(new NavigationView.OnNavigationItemSelectedListener() {
            @Override
            public boolean onNavigationItemSelected(@NonNull MenuItem item) {

                int position = item.getItemId();
                if (position == R.id.nav_home){
                    getSupportFragmentManager().beginTransaction().replace(R.id.content_frame,new homeFragment()).commit();
                    getSupportActionBar().setTitle("Trang Chủ");
                } else if (position == R.id.nav_gallery) {
                    getSupportFragmentManager().beginTransaction().replace(R.id.content_frame,new dauTrangFragment()).commit();
                    getSupportActionBar().setTitle("Dấu Trang");
                } else if (position == R.id.setting) {
                    getSupportFragmentManager().beginTransaction().replace(R.id.content_frame,new caiDatFragment()).commit();
                    getSupportActionBar().setTitle("Cài Đặt");
                } else if (position == R.id.dangXuat) {
                    getSupportFragmentManager().beginTransaction().replace(R.id.content_frame,new dangXuatFragment()).commit();
                    getSupportActionBar().setTitle("Đăng xuất");
                    onBackPressed();
                }
                return true;
            }
        });
    }
}