package com.example.testeseguro.exercice1;

import androidx.appcompat.app.AppCompatActivity;

import android.os.Bundle;
import android.view.View;
import android.widget.Button;
import android.widget.CheckBox;
import android.widget.EditText;
import android.widget.RadioButton;
import android.widget.Switch;
import android.widget.Toast;

public class MainActivity extends AppCompatActivity implements View.OnClickListener {

    private EditText edtNome;
    private EditText edtEmail;
    private EditText edtTel;
    private RadioButton rdbFem;
    private RadioButton rdbMasc;
    private CheckBox ckbMusica;
    private CheckBox ckbCinema;
    private CheckBox ckbEsporte;
    private CheckBox ckbGastronomia;
    private Switch swtNotif;
    private Button bntExibir;
    private Button bntLimpar;


    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);

        edtNome = findViewById(R.id.edtNome);
        edtEmail = findViewById(R.id.edtEmail);
        edtTel = findViewById(R.id.edtTel);
        rdbFem = findViewById(R.id.rdbFem);
        rdbMasc = findViewById(R.id.rdbMasc);
        ckbCinema = findViewById(R.id.ckbCinema);
        ckbEsporte = findViewById(R.id.ckbEsporte);
        ckbGastronomia = findViewById(R.id.ckbGastronomia);
        ckbMusica = findViewById(R.id.ckbMusica);
        swtNotif = findViewById(R.id.swtNotif);
        bntExibir = findViewById(R.id.btnExibir);
        bntLimpar = findViewById(R.id.btnLimpar);
    }

    @Override
    public void onClick(View v) {
        if (v.getId() == R.id.btnExibir){
            Toast.makeText(this,"Exibir", Toast.LENGTH_SHORT).show();
        }
        else if (v.getId() == R.id.btnExibir){
            Toast.makeText(this,"limpar", Toast.LENGTH_SHORT).show();
        }

    }
}