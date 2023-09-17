package com.cris.proapp;

import android.content.Intent;
import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.view.View;
import android.widget.Button;
import android.widget.EditText;
import android.widget.TextView;

public class MainActivity3 extends AppCompatActivity {

    Button btregresar;
    TextView tvresult;


    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main3);


        tvresult = findViewById(R.id.TVresult);
        btregresar=(Button) findViewById(R.id.BTVolver);
        double result = getIntent().getDoubleExtra("calc", 0);

        tvresult.setText("La respuesta es:" + String.valueOf(result));
        btregresar.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                Intent intent = new Intent(getApplicationContext(), MainActivity2.class);
                startActivity(intent);
            }
        });



            }
        };

