package com.example.prueba;

import androidx.appcompat.app.AppCompatActivity;

import android.content.Intent;
import android.os.Bundle;
import android.view.View;
import android.widget.EditText;
import android.widget.RadioButton;

public class MainActivity extends AppCompatActivity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);
    }
    public void btenviar(View view){

        Intent intent = new Intent(MainActivity.this, MainActivity2.class);
        EditText cedula = findViewById(R.id.txtcedula);
        EditText nombre = findViewById(R.id.txtnombre);
        EditText fecha = findViewById(R.id.txtfecha);
        EditText ciudad = findViewById(R.id.txtciudad);
        RadioButton masc = findViewById(R.id.rbmasc);
        RadioButton fem = findViewById(R.id.rbfem);
        EditText correo = findViewById(R.id.txtcorreo);
        EditText telefono = findViewById(R.id.txttelefono);
        String genero;
        if(masc.isChecked())
            genero="MASCULINO";
        else
            genero="FEMENINO";

        Bundle b = new Bundle();
        b.putString("CEDULA", cedula.getText().toString());
        b.putString("NOMBRE", nombre.getText().toString().toUpperCase());
        b.putString("FECHA", fecha.getText().toString());
        b.putString("CIUDAD", ciudad.getText().toString().toUpperCase());
        b.putString("GENERO", genero.toString());
        b.putString("CORREO", correo.getText().toString());
        b.putString("TELEFONO", telefono.getText().toString());
        intent.putExtras(b);
        startActivity(intent);
    }
    public void btlimpiar(View view){
        EditText cedula = findViewById(R.id.txtcedula);
        EditText nombre = findViewById(R.id.txtnombre);
        EditText fecha = findViewById(R.id.txtfecha);
        EditText ciudad = findViewById(R.id.txtciudad);
        RadioButton masc = findViewById(R.id.rbmasc);
        RadioButton fem = findViewById(R.id.rbfem);
        EditText correo = findViewById(R.id.txtcorreo);
        EditText telefono = findViewById(R.id.txttelefono);
        cedula.setText("");
        nombre.setText("");
        fecha.setText("");
        ciudad.setText("");
        masc.setChecked(false);
        fem.setChecked(false);
        correo.setText("");
        telefono.setText("");
    }
}