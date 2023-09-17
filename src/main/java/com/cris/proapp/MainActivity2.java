package com.cris.proapp;

import android.content.Intent;
import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.view.View;
import android.widget.Button;
import android.widget.EditText;
import android.widget.TextView;

public class MainActivity2 extends AppCompatActivity {

Button btcalcular;
Button btlimpiar;
EditText etcosto;
EditText ethectarea;

EditText textx;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main2);

        btcalcular = (Button) findViewById(R.id.BTCalcular);
        btlimpiar = (Button) findViewById(R.id.BTLimpiar);
        etcosto = (EditText) findViewById(R.id.ETCosto);
        ethectarea = (EditText) findViewById(R.id.ETHectarea);

        btcalcular.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
             String costo = etcosto.getText().toString();
             String hectarea = ethectarea.getText().toString();
             double costoT = Double.parseDouble(costo);
             double hectareaT = Double.parseDouble(hectarea);
             Double res = costoT = hectareaT;

             Intent intent = new Intent(getApplicationContext(), MainActivity3.class);
             intent.putExtra("calc", res);
             startActivity(intent);
             finish();
            }
        });

        btlimpiar.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                etcosto.setText("");
                ethectarea.setText("");
            }
        });
    }
        ;
    }

