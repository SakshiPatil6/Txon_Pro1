package com.example.unitconverter;

import androidx.appcompat.app.AppCompatActivity;
import android.annotation.SuppressLint;
import android.content.Intent;
import android.os.Bundle;
import android.view.View;
import android.widget.Button;
import android.widget.EditText;
import android.widget.TextView;

public class LengthCal extends AppCompatActivity
{
    TextView bac, result;
    EditText inputNum;
    Button cm,m,km, mile;

    @SuppressLint("MissingInflatedId")
    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_length_cal);
        bac=findViewById(R.id.back);
        inputNum=findViewById(R.id.editTextNumber);
        result=findViewById(R.id.res);
        cm=findViewById(R.id.centi);
        m=findViewById(R.id.m);
        km=findViewById(R.id.km);
        mile=findViewById(R.id.miles);

        bac.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                Intent i=new Intent(LengthCal.this,MainActivity.class);
                startActivity(i);
            }
        });

        cm.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                String num=inputNum.getText().toString();
                int number=Integer.parseInt(num);
                double centi=(number*100);
                result.setText(""+centi);
            }
        });

        m.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                String num=inputNum.getText().toString();
                int number=Integer.parseInt(num);
                double meter=(number);
                result.setText("" +meter);
            }
        });

        km.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                String num=inputNum.getText().toString();
                int number=Integer.parseInt(num);
                float k=(float)(number/ 1000);
                result.setText(""+ k);
            }
        });

        mile.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                String num=inputNum.getText().toString();
                int number=Integer.parseInt(num);
                float ml= (float) (number / 1609);
                result.setText("" +ml);
            }
        });
    }
}