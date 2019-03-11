package com.example.jsu.lab4a;

import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;

import android.view.View;
import android.content.Intent;
import android.widget.*;

import java.text.DecimalFormat;

public class TipCalculator extends AppCompatActivity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_tip_calculator);
        ((TextView)findViewById(R.id.CalculatedTip)).setText("");
    }

    public void calculateButton(View calculate){


        double total = Double.parseDouble(((EditText)findViewById(R.id.TotalBill)).getText().toString());
        int bills = Integer.parseInt(((EditText)findViewById(R.id.NumberOfPeople)).getText().toString());
        double prcntg = Double.parseDouble(((EditText)findViewById(R.id.TipPercentage)).getText().toString());
        double tip = (total * (prcntg/100) / bills);
        DecimalFormat nearestCent = new DecimalFormat("#.00");
        ((TextView) findViewById(R.id.CalculatedTip)).setText(getString(R.string.MonetarySymbol, nearestCent.format(tip)));
    }

    public void backButton(View back){
        Intent m = new Intent(this, MainActivity.class);
        startActivity(m);
    }
}
