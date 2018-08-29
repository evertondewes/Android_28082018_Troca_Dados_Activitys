package com.example.cnec.myapplication;

import android.content.Intent;
import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.view.View;
import android.widget.TextView;

public class MainActivity extends AppCompatActivity {

    @Override
    protected void onActivityResult(int requestCode, int resultCode, Intent data) {
        String s = data.getStringExtra("com.example.cnec.myapplication.valorRetorno");

        TextView tv =  findViewById(R.id.valorRetorno);

        tv.setText(s);
    }

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);
    }

    public void vaiParaASegundaActivity(View v){

        Intent i = new Intent(getApplicationContext(), Main2Activity.class);

        String valor = "Meu valor a ser passado";
        i.putExtra("MINHA_STRING", valor);

        startActivityForResult(i, 123);
    }
}
