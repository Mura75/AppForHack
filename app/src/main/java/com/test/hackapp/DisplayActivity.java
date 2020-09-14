package com.test.hackapp;

import androidx.appcompat.app.AppCompatActivity;

import android.os.Bundle;
import android.widget.TextView;

public class DisplayActivity extends AppCompatActivity {

    private TextView textView;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_display);

        textView = findViewById(R.id.textView);

        String message = getIntent().getStringExtra(Constants.EXTRA_MESSAGE);
        textView.setText(message);
    }
}