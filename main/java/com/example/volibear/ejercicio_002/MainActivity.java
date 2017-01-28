package com.example.volibear.ejercicio_002;


import android.app.AlertDialog;
import android.content.DialogInterface;
import android.content.Intent;
import android.content.res.Configuration;
import android.os.Bundle;
import android.support.v7.app.AppCompatActivity;
import android.view.View;
import android.widget.Button;
import android.widget.CheckBox;
import android.widget.EditText;
import android.widget.RadioButton;
import android.widget.TextView;

import java.util.Locale;

public class MainActivity extends AppCompatActivity {
    private Locale locale;
    private Configuration config = new Configuration();
    EditText txtNombre, txtPeso, txtEstatura;
    CheckBox chEjercicio;
    RadioButton rdHombre, rdMujer;
    TextView txtResult;
    Button btnCalcular, btnBorrar, btnLengua;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);

        txtNombre = (EditText) findViewById(R.id.txtNombre);
        txtPeso = (EditText) findViewById(R.id.txtPeso);
        txtEstatura = (EditText) findViewById(R.id.txtEstatura);
        chEjercicio = (CheckBox) findViewById(R.id.chEjercicio);
        rdHombre = (RadioButton) findViewById(R.id.rdHombre);
        rdMujer = (RadioButton) findViewById(R.id.rdMujer);
        txtResult = (TextView) findViewById(R.id.txtResultado);
        btnCalcular = (Button) findViewById(R.id.btnCalcular);
        btnBorrar = (Button) findViewById(R.id.btnBorrar);
        btnLengua = (Button) findViewById(R.id.btnLengua);


        btnBorrar.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                txtNombre.setText("");
                txtPeso.setText("");
                txtEstatura.setText("");
                txtResult.setText("");
                chEjercicio.setChecked(false);
                rdHombre.setChecked(false);
                rdMujer.setChecked(false);
            }
        });

        btnCalcular.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                Persona p = new Persona();
                p.setNombre(txtNombre.getText().toString());
                p.setPeso(Double.parseDouble(txtPeso.getText().toString()));
                p.setEstuatura(Double.parseDouble(txtEstatura.getText().toString()));
                if (chEjercicio.isChecked()) {
                    p.setEjercicio((byte) 1);
                } else {
                    p.setEjercicio((byte) 0);
                }
                if (rdHombre.isChecked()) {
                    p.setSexo('H');
                } else {
                    if (rdMujer.isChecked()) {
                        p.setSexo('M');
                    } else {
                        p.setSexo('X');
                    }
                }
                p.calcularImc();
                txtResult.setText(p.toString());
                if (p.getImc() < 20) {
                    Intent in = new Intent(MainActivity.this,Desnutrido.class);
                    startActivity(in);
                } else {
                    if (p.getImc() >= 20 && p.getImc() <= 25) {
                        Intent i = new Intent(MainActivity.this,Nutrido.class);
                        startActivity(i);
                    } else {
                        Intent intent = new Intent(MainActivity.this, SobrePeso.class);
                        startActivity(intent);
                    }

                }

            }
        });


        btnLengua.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                showDialog();
            }
        });

    }



    private void showDialog(){
        AlertDialog.Builder b = new AlertDialog.Builder(this);
        b.setTitle(getResources().getString(R.string.botonLeng));
        //obtiene los idiomas del array de string.xml
        String[] types = getResources().getStringArray(R.array.languages);
        b.setItems(types, new DialogInterface.OnClickListener() {

            @Override
            public void onClick(DialogInterface dialog, int which) {

                dialog.dismiss();
                switch(which){
                    case 0:
                        locale = new Locale("en");
                        config.locale =locale;
                        break;
                    case 1:
                        locale = new Locale("es");
                        config.locale =locale;
                        break;
                    case 2:
                        locale = new Locale("pt");
                        config.locale =locale;
                        break;
                }
                getResources().updateConfiguration(config, null);
                Intent refresh = new Intent(MainActivity.this, MainActivity.class);
                startActivity(refresh);
                finish();
            }

        });

        b.show();

    }
}



