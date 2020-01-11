package com.maxsop.converter;

import androidx.appcompat.app.AppCompatActivity;

import android.os.Bundle;
import android.view.View;
import android.widget.AdapterView;
import android.widget.ArrayAdapter;
import android.widget.Button;
import android.widget.EditText;
import android.widget.Spinner;
import android.widget.Toast;

import com.maxsop.converter.temperature.TemperatureConverter;

public class TemperatureConversionActivity extends AppCompatActivity {

    String[] units;
    Button btn_converter;
    Spinner sp_from, sp_to;
    EditText et_from, et_to;
    String from_unit, to_unit;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_temperature_conversion);

        // get data
        units = getResources().getStringArray(R.array.temperatureUnits);

        // views
        sp_from = findViewById(R.id.sp_from);
        sp_to = findViewById(R.id.sp_to);
        btn_converter = findViewById(R.id.btn_converter);
        et_from = findViewById(R.id.et_from);
        et_to = findViewById(R.id.et_to);

        ArrayAdapter<String> adapter = new ArrayAdapter<String>(this, android.R.layout.simple_spinner_dropdown_item, units);

        sp_from.setAdapter(adapter);
        sp_from.setOnItemSelectedListener(new AdapterView.OnItemSelectedListener() {
            @Override
            public void onItemSelected(AdapterView<?> parent, View view, int position, long id) {
                from_unit = parent.getItemAtPosition(position).toString();
            }

            @Override
            public void onNothingSelected(AdapterView<?> parent) {

            }
        });

        sp_to.setAdapter(adapter);
        sp_to.setOnItemSelectedListener(new AdapterView.OnItemSelectedListener() {
            @Override
            public void onItemSelected(AdapterView<?> parent, View view, int position, long id) {
                to_unit = parent.getItemAtPosition(position).toString();
            }

            @Override
            public void onNothingSelected(AdapterView<?> parent) {

            }
        });


        btn_converter.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                double input = Double.parseDouble(et_from.getText().toString());

                TemperatureConverter tc = new TemperatureConverter(from_unit, to_unit, input);
                String result = tc.getResult();

                et_to.setText(result);
                Toast.makeText(getApplicationContext(), result, Toast.LENGTH_LONG).show();
            }
        });



    }
}
