package com.example.myapplication2309202501;

import android.content.Intent;
import android.os.Bundle;
import android.widget.Button;
import android.widget.EditText;
import android.widget.Toast;

import androidx.activity.EdgeToEdge;
import androidx.appcompat.app.AppCompatActivity;
import androidx.core.graphics.Insets;
import androidx.core.view.ViewCompat;
import androidx.core.view.WindowInsetsCompat;

public class kwadrat extends AppCompatActivity {
    Button oblicz;
    Button wyczysc;
    Button powrot;

    EditText editText;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        EdgeToEdge.enable(this);
        setContentView(R.layout.activity_kwadrat);

        oblicz = findViewById(R.id.obicz);
        wyczysc = findViewById(R.id.wyczysc);
        powrot = findViewById(R.id.powrot);

        editText = findViewById(R.id.bokK);

        oblicz.setOnClickListener(v -> {
            int bokKwadratu = Integer.parseInt(editText.getText().toString());
            int pole = bokKwadratu * bokKwadratu;

            Toast.makeText(getApplicationContext(), "Pole kwadratu: " + pole, Toast.LENGTH_SHORT).show();
        });

        wyczysc.setOnClickListener(v -> {
            editText.setText("");
        });

        powrot.setOnClickListener(v -> {
            startActivity(new Intent(kwadrat.this, MainActivity.class));
            finish();
        });


        ViewCompat.setOnApplyWindowInsetsListener(findViewById(R.id.main), (v, insets) -> {
            Insets systemBars = insets.getInsets(WindowInsetsCompat.Type.systemBars());
            v.setPadding(systemBars.left, systemBars.top, systemBars.right, systemBars.bottom);
            return insets;
        });
    }
}