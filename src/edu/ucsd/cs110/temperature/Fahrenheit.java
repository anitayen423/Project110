package edu.ucsd.cs110.temperature;
public class Fahrenheit extends Temperature
{
    public Fahrenheit(float t)
    {
        super(t);
    }

    @Override
    public Temperature toCelsius() {
        return this;
    }

    @Override
    public Temperature toFahrenheit() {
        float value = ((this.getValue()*5)/9) - 32;
        return new Fahrenheit(value);
    }

    public String toString()
    {
        float temp = this.getValue();
        String n = String.valueOf(temp);
        return n + " F";
    }
}