package com.example.graficas;

import androidx.appcompat.app.AppCompatActivity;

import android.content.Intent;
import android.os.Bundle;
import android.view.View;

public class MainActivity extends AppCompatActivity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);
    }

    public void Edicion(View view) {
        Intent edicion = new Intent(this, InputActivity.class);
        startActivity(edicion);
    }

    public void Graficas(View view) {
        Intent graficas = new Intent(this, GraphicActivity.class);
        startActivity(graficas);
    }
}