package com.example.volibear.ejercicio_002;

import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.widget.ImageView;
import android.widget.TextView;

public class Nutrido extends AppCompatActivity {
    TextView nut;
    ImageView image2;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_nutrido);

        nut = (TextView)findViewById(R.id.nutrido);
        image2 =(ImageView)findViewById(R.id.nutrido1);
    }
}
