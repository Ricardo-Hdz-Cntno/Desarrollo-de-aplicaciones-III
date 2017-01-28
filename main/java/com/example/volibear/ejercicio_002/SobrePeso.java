package com.example.volibear.ejercicio_002;

import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.widget.ImageView;
import android.widget.TextView;

public class SobrePeso extends AppCompatActivity {

    TextView sobreP;
    ImageView image;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_sobre_peso);

        sobreP = (TextView)findViewById(R.id.sobrePeso);
        image =(ImageView)findViewById(R.id.gordito1);
    }
}
