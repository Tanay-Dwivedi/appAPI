package com.example.appapi;

import androidx.appcompat.app.AppCompatActivity;

import android.content.Intent;
import android.os.Bundle;
import android.view.WindowManager;
import android.widget.TextView;

public class InfoDisplayScreen extends AppCompatActivity {

    TextView tv_info_text;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_info_display_screen);

        // for full screen
        getWindow().setFlags(
                WindowManager.LayoutParams.FLAG_LAYOUT_NO_LIMITS,
                WindowManager.LayoutParams.FLAG_LAYOUT_NO_LIMITS
        );

        tv_info_text = findViewById(R.id.info_text);

        tv_info_text.setOnClickListener(v -> {
            Intent intent = new Intent(InfoDisplayScreen.this, MainActivity.class);
            startActivity(intent);
        });

    }
}