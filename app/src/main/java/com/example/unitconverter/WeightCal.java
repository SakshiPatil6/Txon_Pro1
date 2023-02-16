package com.example.unitconverter;

import androidx.appcompat.app.AppCompatActivity;

import android.content.Intent;
import android.os.Bundle;
import android.view.View;
import android.widget.Button;
import android.widget.EditText;
import android.widget.TextView;

public class WeightCal extends AppCompatActivity {
    TextView bac, result;
    EditText inputNum;
    Button kg,g,ton,p;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_weight_cal);
        bac=findViewById(R.id.back);
        inputNum=findViewById(R.id.editTextNumber);
        result=findViewById(R.id.res);
        kg=findViewById(R.id.centi);
        g=findViewById(R.id.g);
        ton=findViewById(R.id.ton);
        p=findViewById(R.id.po);

        bac.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                Intent i=new Intent(WeightCal.this,MainActivity.class);
                startActivity(i);
            }
        });

        kg.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                String num=inputNum.getText().toString();
                int number=Integer.parseInt(num);
                double kg=(number);
                result.setText(""+kg);
            }
        });
        g.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                String num=inputNum.getText().toString();
                int number=Integer.parseInt(num);
                double gm=(number*1000);
                result.setText(""+gm);
            }
        });

        p.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                String num=inputNum.getText().toString();
                int number=Integer.parseInt(num);
                double po=(number*2.2046);
                result.setText(""+po);
            }
        });
        ton.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                String num=inputNum.getText().toString();
                int number=Integer.parseInt(num);
                double t=(number*0.001);
                result.setText(""+t);
            }
        });
    }
}