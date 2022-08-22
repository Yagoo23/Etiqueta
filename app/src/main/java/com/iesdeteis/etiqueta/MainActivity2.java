package com.iesdeteis.etiqueta;

import androidx.annotation.NonNull;
import androidx.appcompat.app.AppCompatActivity;

import android.os.Bundle;
import android.view.View;
import android.widget.ImageButton;

public class MainActivity2 extends AppCompatActivity {
    private ImageButton Imagen;
    private float rotar;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main2);
        Imagen = findViewById(R.id.Imagen);

        Imagen.setOnClickListener(new View.OnClickListener() {

            @Override
            public void onClick(View view) {
                rotar += 45.0;
                Imagen.setRotation(rotar % 360);
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
        Imagen.setRotation(rotar);
    }
}