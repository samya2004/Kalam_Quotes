package com.example.kalam;

import android.content.Intent;
import android.os.Bundle;
import android.os.Handler;

import androidx.appcompat.app.AppCompatActivity;

import com.example.fragments.Home;
import com.example.kalam.MainActivity;
import com.example.kalam.R;

public class Activitysplash extends AppCompatActivity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activitysplash);
        getSupportActionBar().hide();
        new Handler().postDelayed(new Runnable() {
            @Override
            public void run() {
                Intent i = new Intent(Activitysplash.this, MainActivity.class);
                startActivity(i);
                finish();
            }
        },2000);
    }
} 