package com.example.appapi;

import androidx.appcompat.app.AppCompatActivity;
import androidx.cardview.widget.CardView;

import android.content.Intent;
import android.os.Bundle;
import android.view.View;
import android.view.WindowManager;
import android.widget.TextView;

public class MainActivity extends AppCompatActivity {

    CardView cv_alien_card, cv_character_card;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);

        // for full screen
        getWindow().setFlags(
                WindowManager.LayoutParams.FLAG_LAYOUT_NO_LIMITS,
                WindowManager.LayoutParams.FLAG_LAYOUT_NO_LIMITS
        );

        cv_alien_card = findViewById(R.id.aliens_card);
        cv_character_card = findViewById(R.id.character_card);

        cv_alien_card.setOnClickListener(v -> {
            Intent intent = new Intent(MainActivity.this, InfoDisplayScreen.class);
            startActivity(intent);
        });

        cv_character_card.setOnClickListener(v -> {
            Intent intent = new Intent(MainActivity.this, InfoDisplayScreen.class);
            startActivity(intent);
        });

    }
}