package com.kuliah.bacaanshalat;

import androidx.appcompat.app.AppCompatActivity;

import android.os.Bundle;
import android.content.Context;
import android.content.Intent;
import android.content.SharedPreferences;
import android.view.View;
import android.widget.Button;

public class MainActivity extends AppCompatActivity {
    Button niatshalat, bacaanshalat, ayatkursi;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);

        niatshalat = (Button) findViewById(R.id.niatshalat);
        bacaanshalat = (Button) findViewById(R.id.bacaanshalat);
        ayatkursi = (Button) findViewById(R.id.ayatkursi);

        niatshalat.setOnClickListener(new View.OnClickListener() {

            @Override
            public void onClick(View v) {
                Intent intent = new Intent(MainActivity.this, NiatShalat.class);
                finish();
                startActivity(intent);
            }
        });

        bacaanshalat.setOnClickListener(new View.OnClickListener() {

            @Override
            public void onClick(View v) {
                Intent intent = new Intent(MainActivity.this, BacaanShalat.class);
                finish();
                startActivity(intent);
            }
        });

        ayatkursi.setOnClickListener(new View.OnClickListener() {

            @Override
            public void onClick(View v) {
                Intent intent = new Intent(MainActivity.this, AyatKursi.class);
                finish();
                startActivity(intent);
            }
        });
    }
}