package com.example.myapplication2309202501;

import android.content.Intent;
import android.os.Bundle;
import android.view.View;
import android.widget.Button;
import android.widget.ImageButton;
import android.widget.ImageView;

import androidx.activity.EdgeToEdge;
import androidx.appcompat.app.AppCompatActivity;
import androidx.core.graphics.Insets;
import androidx.core.view.ViewCompat;
import androidx.core.view.WindowInsetsCompat;

public class MainActivity extends AppCompatActivity {
    ImageButton b1;
    ImageButton b2;
    ImageButton b3;
    ImageButton b4;
    ImageButton b5;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        EdgeToEdge.enable(this);
        setContentView(R.layout.activity_main);

        b1 = findViewById(R.id.b1);
        b2 = findViewById(R.id.b2);
        b3 = findViewById(R.id.b3);
        b4 = findViewById(R.id.b4);
        b5 = findViewById(R.id.b5);

        b1.setOnClickListener(v -> {
            startActivity(new Intent(MainActivity.this,kwadrat.class));
            finish();
        });

        b2.setOnClickListener(v -> {
            startActivity(new Intent(MainActivity.this,trujkat.class));
            finish();
        });

        b3.setOnClickListener(v -> {
            startActivity(new Intent(MainActivity.this,kolo.class));
            finish();
        });

        b4.setOnClickListener(v -> {
            startActivity(new Intent(MainActivity.this,trapez.class));
            finish();
        });

        b5.setOnClickListener(v -> {
            startActivity(new Intent(MainActivity.this,prostokat.class));
            finish();
        });

        ViewCompat.setOnApplyWindowInsetsListener(findViewById(R.id.main), (v, insets) -> {
            Insets systemBars = insets.getInsets(WindowInsetsCompat.Type.systemBars());
            v.setPadding(systemBars.left, systemBars.top, systemBars.right, systemBars.bottom);
            return insets;
        });
    }

}