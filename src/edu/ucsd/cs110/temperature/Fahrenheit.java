package edu.ucsd.cs110.temperature;
public class Fahrenheit extends Temperature
{
    public Fahrenheit(float t)
    {
        super(t);
    }

    @Override
    public Temperature toCelsius() {
        float value = (float) ((this.getValue()-32) * (5.0/9.0));
        return new Fahrenheit(value);
    }

    @Override
    public Temperature toFahrenheit() {
        return this;
    }

    public String toString()
    {
        float temp = this.getValue();
        String n = String.valueOf(temp);
        return n + " F";
    }
}