package com.example.aplicaciones_moviles_1;

import androidx.appcompat.app.AppCompatActivity;

import android.os.Bundle;
import android.widget.TextView;

public class Mensaje extends AppCompatActivity {
    private TextView txt;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_mensaje);

        int opc;
        txt = (TextView) findViewById(R.id.textView2);
         Bundle bundle = getIntent().getExtras();
         opc = bundle.getInt("opcion");

        actualizarMsj(opc);

    }

    private void actualizarMsj(int opc){

        switch (opc)
        {
            case 0:
                txt.setText(R.string.mensaje1);
                break;
            case 1:
                txt.setText(R.string.mensaje2);
                break;
            case 2:
                txt.setText(R.string.mensaje3);
                break;
            case 3:
                txt.setText(R.string.mensaje4);
                break;
        }
    }
}
