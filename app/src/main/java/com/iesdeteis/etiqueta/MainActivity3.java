package com.iesdeteis.etiqueta;

import androidx.annotation.NonNull;
import androidx.appcompat.app.AppCompatActivity;

import android.os.Bundle;
import android.view.View;
import android.widget.TextView;

public class MainActivity3 extends AppCompatActivity {
    private TextView textoGiro;
    private float rotar;
    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main3);
        textoGiro=findViewById(R.id.textoGiro);
        textoGiro.setText("hehheheehheeheheheheh");
        textoGiro.setTextColor(getResources().getColor(R.color.color1));
        textoGiro.setTextSize(getResources().getDimension(R.dimen.tamano));
        textoGiro.setBackgroundColor(getResources().getColor(R.color.color2));
        textoGiro.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                rotar+=45;
                textoGiro.setRotation(rotar%360);

            }
        });
    }
    @Override
    protected void onSaveInstanceState(@NonNull Bundle outState) {
        super.onSaveInstanceState(outState);
        outState.putFloat("rotar", rotar);
    }
    @Override
    protected void onRestoreInstanceState(@NonNull Bundle savedInstanceState) {
        super.onRestoreInstanceState(savedInstanceState);
        rotar=savedInstanceState.getFloat("rotar");
        textoGiro.setRotation(rotar);
    }
}