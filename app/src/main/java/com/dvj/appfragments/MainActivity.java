package com.dvj.appfragments;

import androidx.appcompat.app.AppCompatActivity;

import android.os.Bundle;

public class MainActivity extends AppCompatActivity implements EnviarMensaje {

    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);
    }


    public void enviarDato(String dato) {
        FragmentB fb = (FragmentB) getSupportFragmentManager()
                        .findFragmentById(R.id.fragmentContainerView3LandScape);
        fb.recibir(dato);
    }


}