package com.example.aluno.tranporte;

import android.content.Intent;
import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.view.View;
import android.widget.Button;
import android.widget.EditText;

public class TelaA extends AppCompatActivity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_tela);
        Button BtnEnviar = (Button) findViewById(R.id.BtnEnviar);
        BtnEnviar.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                EditText encomenda = (EditText) findViewById(R.id.Menssagem);

                Bundle caixa = new Bundle();

                caixa.putString("caixadetexto", encomenda.getText().toString());

                Intent caminhao = new Intent(TelaA.this,TalaB.class);
                caminhao.putExtras(caixa);

                startActivity(caminhao);
            }
        });
    }

}
