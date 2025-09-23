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

public class kolo extends AppCompatActivity {

    Button oblicz;
    Button wyczysc;
    Button powrot;

    EditText editTextR;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        EdgeToEdge.enable(this);
        setContentView(R.layout.activity_kolo);

        oblicz = findViewById(R.id.obicz);
        wyczysc = findViewById(R.id.wyczysc);
        powrot = findViewById(R.id.powrot);

        editTextR = findViewById(R.id.promien);

        oblicz.setOnClickListener(v -> {
            int promien = Integer.parseInt(editTextR.getText().toString());
            double pole = promien * promien * 3.14;

            Toast.makeText(getApplicationContext(), "Pole kola: " + pole, Toast.LENGTH_SHORT).show();
        });

        wyczysc.setOnClickListener(v -> {
            editTextR.setText("");
        });

        powrot.setOnClickListener(v -> {
            startActivity(new Intent(kolo.this, MainActivity.class));
            finish();
        });

        ViewCompat.setOnApplyWindowInsetsListener(findViewById(R.id.main), (v, insets) -> {
            Insets systemBars = insets.getInsets(WindowInsetsCompat.Type.systemBars());
            v.setPadding(systemBars.left, systemBars.top, systemBars.right, systemBars.bottom);
            return insets;
        });
    }
}