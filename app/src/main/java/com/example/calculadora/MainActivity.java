package com.example.calculadora;

import androidx.appcompat.app.AppCompatActivity;

import android.os.Bundle;
import android.view.View;
import android.widget.EditText;
import android.widget.TextView;

public class MainActivity extends AppCompatActivity {

    private EditText  txtnum1;
    private EditText  txtnum2;
    private TextView tvresultado;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);
        txtnum1 = findViewById(R.id.txtnum1);
        txtnum2 = findViewById(R.id.txtnum2);
        tvresultado = findViewById(R.id.tvresultado);
    }

    public void somar(View view){
        int valor1 = Integer.parseInt((txtnum1.getText().toString()));
        int valor2 = Integer.parseInt((txtnum2.getText().toString()));

        tvresultado.setText(String.valueOf(valor1 + valor2));
    }

    public void subtrair(View view){
        int valor1 = Integer.parseInt((txtnum1.getText().toString()));
        int valor2 = Integer.parseInt((txtnum2.getText().toString()));

        tvresultado.setText(String.valueOf(valor1 - valor2));
    }

    public void multiplicar(View view){
        int valor1 = Integer.parseInt((txtnum1.getText().toString()));
        int valor2 = Integer.parseInt((txtnum2.getText().toString()));

        tvresultado.setText(String.valueOf(valor1 * valor2));
    }

    public void dividir(View view){
        int valor1 = Integer.parseInt((txtnum1.getText().toString()));
        int valor2 = Integer.parseInt((txtnum2.getText().toString()));

        tvresultado.setText(String.valueOf(valor1 / valor2));
    }
}