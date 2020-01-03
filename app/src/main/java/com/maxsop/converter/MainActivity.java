package com.maxsop.converter;

import androidx.appcompat.app.AppCompatActivity;

import android.content.Intent;
import android.os.Bundle;
import android.view.View;
import android.widget.TextView;

public class MainActivity extends AppCompatActivity implements View.OnClickListener {

    TextView tv_temperature_conversion, tv_numeral_conversion;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);

        // textView
        tv_temperature_conversion = findViewById(R.id.tv_temperature_conversion);
        tv_numeral_conversion = findViewById(R.id.tv_numeral_conversion);

        // click event
        tv_temperature_conversion.setOnClickListener(this);
        tv_numeral_conversion.setOnClickListener(this);
    }

    @Override
    public void onClick(View v) {
        // temperature conversion
        if (v.getId() == R.id.tv_temperature_conversion) {
            Intent intent = new Intent(getApplicationContext(), TemperatureConversionActivity.class);
            startActivity(intent);
        }

        // temperature conversion
        if (v.getId() == R.id.tv_numeral_conversion) {
            Intent intent = new Intent(getApplicationContext(), NumeralConversionActivity.class);
            startActivity(intent);
        }

    }
}
