package com.test.hackapp;

import androidx.appcompat.app.AppCompatActivity;

import android.os.Bundle;
import android.widget.TextView;

public class WinActivity extends AppCompatActivity {

    private String user = Constants.NAME;

    private TextView tvWin;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_win);

        tvWin = findViewById(R.id.tvWin);

        String name = getIntent().getStringExtra(Constants.EXTRA_MESSAGE);
        if (name.equals(user)) {
            tvWin.setText("User WIN: " + name);
        } else {
            tvWin.setText("You loose!: " + name);
        }
    }
}