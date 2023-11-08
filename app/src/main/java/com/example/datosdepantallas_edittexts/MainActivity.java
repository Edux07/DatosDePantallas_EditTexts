package com.example.datosdepantallas_edittexts;

import androidx.activity.result.ActivityResult;
import androidx.activity.result.ActivityResultCallback;
import androidx.activity.result.ActivityResultLauncher;
import androidx.activity.result.contract.ActivityResultContracts;
import androidx.appcompat.app.AppCompatActivity;

import android.app.Activity;
import android.content.Intent;
import android.os.Bundle;
import android.view.View;
import android.widget.TextView;
import android.widget.Toast;

public class MainActivity extends AppCompatActivity {
    private TextView tv1;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);
        tv1 = findViewById(R.id.tv1);
    }

    public void presion(View view) {
        Intent intent = new Intent(this, Activity2.class);
        actividadMandarDatos.launch(intent);
    }

            ActivityResultLauncher<Intent> actividadMandarDatos = registerForActivityResult(new ActivityResultContracts.StartActivityForResult(), new ActivityResultCallback<ActivityResult>() {
                @Override
                public void onActivityResult(ActivityResult result) {
                if(result.getResultCode()==RESULT_OK){
                    String s = result.getData().getStringExtra("Nombre");
                    String s1 = result.getData().getStringExtra("Apellido");
                    String s2 = result.getData().getStringExtra("Apellido2");

                    System.out.println(s);
                    System.out.println(s1);
                    System.out.println(s2);

                    Toast.makeText(getApplicationContext(), "El nombre es "+ s + ". El apellido es " + s1 + ". El segundo apellido es " + s2, Toast.LENGTH_LONG).show();
                }

                }
            });
}