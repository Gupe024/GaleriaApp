package com.example.galeriaapp;

import android.os.Bundle;
import android.view.View;
import android.widget.Button;
import android.widget.ImageView;

import androidx.activity.EdgeToEdge;
import androidx.appcompat.app.AppCompatActivity;
import androidx.core.graphics.Insets;
import androidx.core.view.ViewCompat;
import androidx.core.view.WindowInsetsCompat;

public class MainActivity2 extends AppCompatActivity {
    private ImageView imageView;
    private Button btnAnterior, btnSiguiente;
    private int[] imageArray;
    private int currentPosition = 0;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        EdgeToEdge.enable(this);
        setContentView(R.layout.activity_main2);

        imageView = findViewById(R.id.imageView);
        btnAnterior = findViewById(R.id.anterior);
        btnSiguiente = findViewById(R.id.siguiente);

        imageArray = new int[] {R.drawable.tsubasa_reservoir_chronicle, R.drawable.archivo81, R.drawable.athena, R.drawable.dark, R.drawable.sabes_quien_es, R.drawable.una_familia_normal, R.drawable.biohackers, R.drawable.ecos, R.drawable.clickbait, R.drawable.escena_del_crimen};

        imageView.setImageResource(imageArray[currentPosition]);

        btnAnterior.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                if (currentPosition > 0) {
                    currentPosition--;
                    imageView.setImageResource(imageArray[currentPosition]);
                }
            }
        });

        btnSiguiente.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                if (currentPosition < imageArray.length - 1) {
                    currentPosition++;
                    imageView.setImageResource(imageArray[currentPosition]);
                }
            }
        });
    }
}
