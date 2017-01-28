package com.example.volibear.ejercicio_002;

import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.widget.ImageView;
import android.widget.TextView;

public class Desnutrido extends AppCompatActivity {

    TextView des;
    ImageView image;

    @Override
    protected void onCreate(Bundle savedInstanceState) {



        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_desnutrido);

        des= (TextView)findViewById(R.id.pesoBajo);
        image= (ImageView)findViewById(R.id.image1);

    }
}
