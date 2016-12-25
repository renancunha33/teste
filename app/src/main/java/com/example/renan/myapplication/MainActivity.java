package com.example.renan.myapplication;

import android.support.v7.app.AlertDialog;
import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.view.View;

public class MainActivity extends AppCompatActivity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);
    }

    public void teste(View v) {
        AlertDialog.Builder alert = new AlertDialog.Builder(this);
        alert.setTitle("Teste");
        alert.setMessage("Developed by: Hause \nEmail: renan.cunha33@gmail.com\nEmail: hausegroup@gmail.com");
        alert.setCancelable(false);
        alert.setNeutralButton("OK", null);
        alert.show();
    }
}
