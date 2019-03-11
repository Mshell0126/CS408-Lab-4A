package com.example.jsu.lab4a;

import android.content.Intent;
import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.view.View;
import android.widget.EditText;

public class TempConverter extends AppCompatActivity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_temp_converter);
    }

    public void calculateTemp(View v){
        EditText fahrenheit = findViewById(R.id.Fahrenheit);

        EditText celsius = findViewById(R.id.Celsius);

        if(fahrenheit.getText().toString().isEmpty()){
            if(!celsius.getText().toString().isEmpty()){
                double c = Double.parseDouble(celsius.getText().toString());
                double f = (c * 9 / 5) + 32;
                fahrenheit.setText(getString(R.string.numberToString, f));
            }
        }
        else{
            double f = Double.parseDouble(fahrenheit.getText().toString());
            double c = (f - 32) * 5 / 9;
            celsius.setText(getString(R.string.numberToString, c));
        }

    }

    public void backButton(View back){
        Intent m = new Intent(this, MainActivity.class);
        startActivity(m);
    }
}
