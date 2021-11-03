package com.fmkid.testapp;

import androidx.appcompat.app.AppCompatActivity;

import android.os.Bundle;
import android.view.View;
import android.widget.Button;
import android.widget.TextView;
import android.widget.Toast;

public class MainActivity extends AppCompatActivity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);
        TextView lbl = findViewById(R.id.mainText);
        Button btn = findViewById(R.id.boton);

        btn.setOnClickListener(v -> cambiarTexto(lbl));
    }

    public void cambiarTexto(TextView label) {
        if(label.getText().equals(getString(R.string.main_text)))
            label.setText(R.string.sec_text);
        else
            label.setText(R.string.main_text);
    }
}