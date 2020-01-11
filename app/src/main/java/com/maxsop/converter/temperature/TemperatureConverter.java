package com.maxsop.converter.temperature;

public class TemperatureConverter {

    private String fromUnit, toUnit;
    private double input, result;


    public TemperatureConverter(String fromUnit, String toUnit, double input) {
        this.fromUnit = fromUnit;
        this.toUnit = toUnit;
        this.input = input;

        if (this.fromUnit.equals("Celsius (C)")) {
            if (this.toUnit.equals("Celsius (C)")) {
                this.result = 0;
            }

            if (this.toUnit.equals("Fahrenheit (F)")) {
                this.result = (9/5) * input + 32;
            }

            if (this.toUnit.equals("Kelvin (K)")) {
                this.result = 2;
            }
        }

        if (this.fromUnit.equals("Fahrenheit (F)")) {
            if (this.toUnit.equals("Celsius (C)")) {
                this.result = 3;
            }

            if (this.toUnit.equals("Fahrenheit (F)")) {
                this.result = 4;
            }

            if (this.toUnit.equals("Kelvin (K)")) {
                this.result = 5;
            }
        }

        if (this.fromUnit.equals("Kelvin (K)")) {
            if (this.toUnit.equals("Celsius (C)")) {
                this.result = 6;
            }

            if (this.toUnit.equals("Fahrenheit (F)")) {
                this.result = 7;
            }

            if (this.toUnit.equals("Kelvin (K)")) {
                this.result = 8;
            }
        }
    }

    public String getResult() {
        return String.valueOf(this.result);
    }
}

