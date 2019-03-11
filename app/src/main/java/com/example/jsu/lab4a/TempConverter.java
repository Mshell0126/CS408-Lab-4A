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
        EditText milesText = (EditText) findViewById(R.id.Miles);

        EditText kilomText = (EditText) findViewById(R.id.Kilometers);

        if(milesText.getText().toString().isEmpty()){
            if(!kilomText.getText().toString().isEmpty()){
                double miles = Double.parseDouble(milesText.getText().toString());
                double kilom = Double.parseDouble(kilomText.getText().toString());

            }
        }

    }

    public void backButton(View back){
        Intent m = new Intent(this, MainActivity.class);
        startActivity(m);
    }
}
