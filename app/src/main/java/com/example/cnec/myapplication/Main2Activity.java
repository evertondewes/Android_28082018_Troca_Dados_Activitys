package com.example.cnec.myapplication;

import android.content.Intent;
import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.view.View;
import android.widget.TextView;

public class Main2Activity extends AppCompatActivity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main2);

        Intent intent = getIntent();

        String local = intent.getStringExtra("MINHA_STRING");

        TextView tv = findViewById(R.id.textView);

        tv.setText(local);

    }

    public void botaoRetornar(View v) {
        Intent i = new Intent();
        i.putExtra("com.example.cnec.myapplication.valorRetorno", "tudo certo");

        setResult(999, i);

        finish();

    }
}
