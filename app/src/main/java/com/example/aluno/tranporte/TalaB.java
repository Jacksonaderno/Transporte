package com.example.aluno.tranporte;

import android.content.Intent;
import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.widget.Toast;

public class TalaB extends AppCompatActivity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_tala_b);

        Intent caminhao = getIntent();

        Bundle caixa = caminhao.getExtras();

        String encomenda = caixa.getString("caixadetexto");

        Toast.makeText(this, encomenda, Toast.LENGTH_LONG).show();
    }
}
