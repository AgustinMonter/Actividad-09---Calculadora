package com.example.calculadora;

import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.view.View;
import android.widget.Button;
import android.widget.EditText;
import android.widget.TextView;

public class MainActivity extends AppCompatActivity implements View.OnClickListener {

    EditText num1,num2;
    Button suma, resta, multiplicacion, division, modulo;

    TextView resultado;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);


        num1 = (EditText) findViewById(R.id.num1);
        num2 = (EditText) findViewById(R.id.num2);

        suma = (Button) findViewById(R.id.suma);
        resta = (Button) findViewById(R.id.resta);
        multiplicacion = (Button) findViewById(R.id.multiplicacion);
        division = (Button) findViewById(R.id.division);

        resultado= (TextView) findViewById(R.id.resultado);

        suma.setOnClickListener(this);
        resta.setOnClickListener(this);
        multiplicacion.setOnClickListener(this);
        division.setOnClickListener(this);
    }

    @Override
    public void onClick(View v) {

        String n1 = num1.getText().toString();
        String n2 = num2.getText().toString();

        int entero1 =Integer.parseInt(n1);
        int entero2 =Integer.parseInt(n2);

        int rta=0;



        switch (v.getId()){
            case R.id.suma:
                rta = entero1+entero2;
                break;
            case R.id.resta:
                rta = entero1-entero2;
                break;
            case R.id.multiplicacion:
                rta= entero1*entero2;
                break;
            case R.id.division:
                rta = entero1/entero2;
                break;
        }
       resultado.setText(""+rta);
    }
}
