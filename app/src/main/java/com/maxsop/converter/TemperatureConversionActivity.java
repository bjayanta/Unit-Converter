package com.maxsop.converter;

import androidx.appcompat.app.AppCompatActivity;

import android.os.Bundle;
import android.widget.ArrayAdapter;
import android.widget.Spinner;

public class TemperatureConversionActivity extends AppCompatActivity {

    String[] units;
    Spinner sp_from;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_temperature_conversion);

        // get data
        units = getResources().getStringArray(R.array.temperatureUnits);

        // views
        sp_from = findViewById(R.id.sp_from);

        ArrayAdapter<String> adapter = new ArrayAdapter<String>(this, android.R.layout.simple_spinner_dropdown_item, units);
        sp_from.setAdapter(adapter);


    }
}
