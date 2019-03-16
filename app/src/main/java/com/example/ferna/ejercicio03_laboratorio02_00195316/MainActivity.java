package com.example.ferna.ejercicio03_laboratorio02_00195316;

import android.graphics.Color;
import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.view.View;
import android.widget.EditText;
import android.widget.LinearLayout;
import android.widget.TextView;

public class MainActivity extends AppCompatActivity implements View.OnClickListener {

    public TextView et1;
    public TextView et2;
    public TextView et3;
    private LinearLayout main;


    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);

        main = findViewById(R.id.ll_main);

        et1 = findViewById(R.id.et_01);
        et2 = findViewById(R.id.et_02);
        et3 = findViewById(R.id.et_03);

        et1.setOnClickListener(this);
        et2.setOnClickListener(this);
        et3.setOnClickListener(this);

    }


    @Override
    public void onClick(View v) {
        int opc = v.getId();
        switch (opc){
            case R.id.et_01:
                et1.setBackgroundColor(Color.parseColor(getString(R.string.color_amarillo)));
                break;
            case R.id.et_02:
                et2.setBackgroundColor(Color.parseColor(getString(R.string.color_celeste)));
                break;
            case R.id.et_03:
                et3.setBackgroundColor(Color.parseColor(getString(R.string.color_morado)));
                break;
        }

    }
}
