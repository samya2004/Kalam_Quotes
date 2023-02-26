package com.example.fragments;

import androidx.appcompat.app.AppCompatActivity;

import android.content.Intent;
import android.os.Bundle;
import android.view.View;
import android.widget.Button;
import android.widget.TextView;

import com.example.kalam.R;

public class Activity6 extends AppCompatActivity {
    TextView textView;
    Button button;
    @Override

    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_6);
        button = findViewById(R.id.button1);
        textView = findViewById(R.id.text_q6);
        button.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {

                String q6 = textView.getText().toString();
                Intent intent = new Intent();
                intent.setAction(Intent.ACTION_SEND);
                intent.setType("text/plain");
                intent.putExtra(Intent.EXTRA_TEXT, q6);
                startActivity(intent);
            }
        });
    }
}