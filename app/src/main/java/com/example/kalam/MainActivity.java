package com.example.kalam;

import androidx.annotation.NonNull;
import androidx.appcompat.app.AppCompatActivity;
import androidx.fragment.app.FragmentTransaction;

import android.os.Bundle;
import android.view.MenuItem;

import com.example.fragments.About;
import com.example.fragments.Home;
import com.google.android.material.bottomnavigation.BottomNavigationView;

public class MainActivity extends AppCompatActivity {
    BottomNavigationView bottomNavigationView;
    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);

        FragmentTransaction fragmentTransaction= getSupportFragmentManager().beginTransaction();
        bottomNavigationView= findViewById(R.id.bottomNavigationView);
        fragmentTransaction.commit();
        fragmentTransaction.replace(R.id.container, new Home());
        bottomNavigationView.setOnNavigationItemSelectedListener(new BottomNavigationView.OnNavigationItemSelectedListener() {
            @Override
            public boolean onNavigationItemSelected(@NonNull MenuItem item) {
                FragmentTransaction fragmentTransaction= getSupportFragmentManager().beginTransaction();
                switch (item.getItemId()){
                    case R.id.home:

                        fragmentTransaction.replace(R.id.container, new Home());
                        break;
                    case R.id.about:

                        fragmentTransaction.replace(R.id.container, new About());
                        break;

                }
                fragmentTransaction.commit();
                return true;
            }
        });
    }
}