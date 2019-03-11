package com.example.jsu.lab4a;

import android.content.Intent;
import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.view.View;
import android.widget.EditText;

public class DistanceConverter extends AppCompatActivity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_distance_converter);
    }

    public void calculateDistance(View v){
        EditText miles = findViewById(R.id.Miles);

        EditText kilom =  findViewById(R.id.Kilometers);

        if(miles.getText().toString().isEmpty()){
            if(!kilom.getText().toString().isEmpty()){
                double km = Double.parseDouble(kilom.getText().toString());
                double mi = km / 1.60934;
                miles.setText(getString(R.string.numberToString, mi));

            }
        }
        else {
            double mi = Double.parseDouble(miles.getText().toString());
            double km = mi * 1.60934;
            kilom.setText(getString(R.string.numberToString, km));
        }
    }

    public void backButton(View back){
        Intent m = new Intent(this, MainActivity.class);
        startActivity(m);
    }
}
