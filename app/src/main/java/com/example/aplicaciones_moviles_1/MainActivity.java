package com.example.aplicaciones_moviles_1;

import androidx.appcompat.app.AppCompatActivity;

import android.content.Intent;
import android.os.Bundle;
import android.view.View;
import android.widget.Button;
import android.widget.RadioGroup;

public class MainActivity extends AppCompatActivity {

    private Button btn_enviar;
    private RadioGroup  respuesta;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);

        btn_enviar  = (Button) findViewById(R.id.button_resp);
        respuesta = (RadioGroup) findViewById(R.id.radioGroup);

        btn_enviar.setOnClickListener(enviarListener);
    }

    private View.OnClickListener enviarListener = new View.OnClickListener() {
        @Override
        public void onClick(View v) {

            int radioID= respuesta.getCheckedRadioButtonId();
            View radioButtom = respuesta.findViewById(radioID);

            int idx =respuesta.indexOfChild(radioButtom);

            Intent intent = new Intent(MainActivity.this, Mensaje.class);
            Bundle b  = new Bundle();
            b.putInt("opcion",idx);
            intent.putExtras(b);
            startActivity(intent);
        }
    };

}
