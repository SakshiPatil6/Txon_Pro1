package com.example.unitconverter;

import androidx.appcompat.app.AppCompatActivity;

import android.annotation.SuppressLint;
import android.content.Intent;
import android.os.Bundle;
import android.view.View;
import android.widget.Button;
import android.widget.EditText;
import android.widget.TextView;

public class TempCal extends AppCompatActivity {
    TextView bac, result;
    EditText inputNum;
    Button cel,kel , fah;

    @SuppressLint("MissingInflatedId")
    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_temp_cal);
        bac=findViewById(R.id.back);
        result=findViewById(R.id.res);
        inputNum=findViewById(R.id.editTextNumber);
        cel=findViewById(R.id.centi);
        kel=findViewById(R.id.m);
        fah=findViewById(R.id.km);

        bac.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                Intent i=new Intent(TempCal.this,MainActivity.class);
                startActivity(i);
            }
        });

        cel.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                String num=inputNum.getText().toString();
                int number=Integer.parseInt(num);
                double cel=(number);
                result.setText(""+cel);
            }
        });

        kel.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                String num=inputNum.getText().toString();
                int number=Integer.parseInt(num);
                double k=(number+273.15);
                result.setText(""+k);
            }
        });

        fah.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                String num=inputNum.getText().toString();
                int number=Integer.parseInt(num);
                double f=(number*(9/5))+32;
                result.setText(""+f);
            }
        });
    }
}