package com.example.datosdepantallas_edittexts;

import androidx.appcompat.app.AppCompatActivity;

import android.content.Intent;
import android.os.Bundle;
import android.view.View;
import android.widget.EditText;
import android.widget.Toast;

public class Activity2 extends AppCompatActivity {
 private EditText eTT1, eTT2, eTT3;
    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_2);
        eTT1=findViewById(R.id.eTT1);
        eTT2=findViewById(R.id.eTT2);
        eTT3=findViewById(R.id.eTT3);

    }

    public void presion(View view){
        Intent i = new Intent();
        setResult(RESULT_OK, i);
        i.putExtra("Nombre", eTT1.getText().toString());
        i.putExtra("Apellido", eTT2.getText().toString());
        i.putExtra("Apellido2", eTT3.getText().toString());
        finish();
    }
}