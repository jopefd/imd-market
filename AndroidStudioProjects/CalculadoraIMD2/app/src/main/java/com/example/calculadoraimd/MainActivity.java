package com.example.calculadoraimd;

import androidx.appcompat.app.AppCompatActivity;
import androidx.fragment.app.FragmentTransaction;

import android.content.Intent;
import android.os.Bundle;
import android.view.View;
import android.widget.Button;
import android.widget.TextView;

public class MainActivity extends AppCompatActivity {

private TextView btnEntrar, btnTrocarSenha;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);


        btnEntrar = findViewById(R.id.entrar);
        btnEntrar.setOnClickListener(v -> {
            Intent intent = new Intent(MainActivity.this, menu.class);

            // Inicie a nova atividade
            startActivity(intent);
        });

    }
}