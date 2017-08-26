package com.example.sena.ejerciciomenus.Fragmentos;

import android.support.v7.app.ActionBar;
import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import com.example.sena.ejerciciomenus.R;

public class fragmentos extends AppCompatActivity {

    private Fragmento1 firstFragment1;
    private Fragmento2 secondFragment2;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_fragmentos);
        ActionBar regresar = getSupportActionBar();
        regresar.setDisplayHomeAsUpEnabled(true);
        firstFragment1= (Fragmento1) getFragmentManager().findFragmentById(R.id.fragment);
        secondFragment2= (Fragmento2) getFragmentManager().findFragmentById(R.id.fragment2);
        }

        public void onClickFirstFragmento1(){
        firstFragment1.onSelected(true);
        secondFragment2.onSelected(false);
        }

        public void onClickFirstFragmento2 () {
        firstFragment1.onSelected(false);
        secondFragment2.onSelected(true);
        }


    }


