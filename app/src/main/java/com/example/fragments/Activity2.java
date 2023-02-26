package com.example.fragments;

import androidx.appcompat.app.AppCompatActivity;

import android.content.Intent;
import android.os.Bundle;
import android.view.View;
import android.widget.Button;
import android.widget.TextView;
import android.widget.Toast;

import com.example.kalam.R;

public class Activity2 extends AppCompatActivity {
    Button button;
    TextView textView;
    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_2);
        button = findViewById(R.id.button1);
        textView = findViewById(R.id.text_q6);
        button.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                String a = textView.getText().toString();
                Toast.makeText(Activity2.this, "SHARE", Toast.LENGTH_SHORT).show();
                Intent i = new Intent();
                i.setAction(Intent.ACTION_SEND);
                i.setType("text/plain");
                i.putExtra(Intent.EXTRA_TEXT,a);
                startActivity(i);
            }
        });
    }
}