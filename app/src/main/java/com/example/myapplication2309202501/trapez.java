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

public class trapez extends AppCompatActivity {
    Button oblicz;
    Button wyczysc;
    Button powrot;

    EditText editTextA;
    EditText editTextB;
    EditText editTextH;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        EdgeToEdge.enable(this);
        setContentView(R.layout.activity_trapez);

        oblicz = findViewById(R.id.obicz);
        wyczysc = findViewById(R.id.wyczysc);
        powrot = findViewById(R.id.powrot);

        editTextA = findViewById(R.id.podstawa1);
        editTextB = findViewById(R.id.podstawa2);
        editTextH = findViewById(R.id.wysokosc);

        oblicz.setOnClickListener(v -> {
            int podstawa = Integer.parseInt(editTextA.getText().toString());
            int podstawa2 = Integer.parseInt(editTextA.getText().toString());
            int wysokosc = Integer.parseInt(editTextH.getText().toString());
            int pole = (podstawa + podstawa2) * wysokosc/2 ;

            Toast.makeText(getApplicationContext(), "Pole trapezu: " + pole, Toast.LENGTH_SHORT).show();
        });

        wyczysc.setOnClickListener(v -> {
            editTextA.setText("");
            editTextB.setText("");
            editTextH.setText("");
        });

        powrot.setOnClickListener(v -> {
            startActivity(new Intent(trapez.this, MainActivity.class));
            finish();
        });

        ViewCompat.setOnApplyWindowInsetsListener(findViewById(R.id.main), (v, insets) -> {
            Insets systemBars = insets.getInsets(WindowInsetsCompat.Type.systemBars());
            v.setPadding(systemBars.left, systemBars.top, systemBars.right, systemBars.bottom);
            return insets;
        });
    }
}