/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package temperatureconverter;

import java.text.NumberFormat;

/**
 *
 * @author Ching Vang
 */
public class TemperatureConverterService {
    
    NumberFormat nf = NumberFormat.getInstance();
    public double getCelciusFromFaherenheit(double fahrenheit) throws NumberFormatException{
    return (fahrenheit - 32) * 5/9;
    
    }
    public String getCelciusFromFaherenheit(String fahrenheit) throws NumberFormatException {
    double f = Double.valueOf(nf.format(fahrenheit));
    double celsius = (f - 32) * 5/9;
    return String.valueOf(celsius);
    }
    
    public String getFahrenheitFromCelsius(String celsius) throws NumberFormatException {
    double fahrenheit = (Double.valueOf(celsius) * 9/5) + 32;
    return String.valueOf(nf.format(fahrenheit));
    }
}
