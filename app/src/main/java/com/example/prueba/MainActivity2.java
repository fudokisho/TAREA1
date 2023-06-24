package com.example.prueba;

import androidx.appcompat.app.AppCompatActivity;

import android.os.Bundle;
import android.widget.TextView;

public class MainActivity2 extends AppCompatActivity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main2);
        TextView txtinformacion = (TextView)findViewById(R.id.txtinf);
        Bundle bundle = this.getIntent().getExtras();
        txtinformacion.setText("Cédula: " + bundle.getString("CEDULA") + "\n" +
                "\n"+ "Nombre: "+ bundle.getString("NOMBRE") + "\n"+
                 "\n" +"Fecha: "+bundle.getString("FECHA")+ "\n"+
                "\n"+ "Ciudad: "+bundle.getString("CIUDAD")+ "\n"+
                "\n"+ "Género: "+bundle.getString("GENERO")+ "\n"+
                "\n"+ "Correo: "+bundle.getString("CORREO")+"\n"+
                "\n"+ "Telefono: "+bundle.getString("TELEFONO"));
    }
}