package com.iesdeteis.etiqueta;

import androidx.appcompat.app.AppCompatActivity;

import android.content.Intent;
import android.graphics.Color;
import android.os.Bundle;
import android.view.View;
import android.widget.Button;
import android.widget.ImageButton;
import android.widget.RadioButton;
import android.widget.RadioGroup;
import android.widget.TextView;

public class MainActivity extends AppCompatActivity {
    private RadioButton btTexto;
    private RadioButton btImg;
    private Button Aceptar;
    private RadioGroup rg1;


    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);
        btTexto=findViewById(R.id.btText);
        btImg= findViewById(R.id.btImg);
        Aceptar= findViewById(R.id.Aceptar);
        rg1= findViewById(R.id.rg1);


        Aceptar.setOnClickListener(new View.OnClickListener() {

            @Override
            public void onClick(View view) {
                String mensaje;
                if (btTexto.isChecked()){
                    Intent i=new Intent(MainActivity.this,MainActivity3.class);
                    startActivity(i);
                }else if (btImg.isChecked()){
                    Intent intent=new Intent(MainActivity.this,MainActivity2.class);
                    startActivity(intent);
                }
            }
        });
        }
    }

