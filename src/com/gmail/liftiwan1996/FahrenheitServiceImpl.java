package com.gmail.liftiwan1996;

public class FahrenheitServiceImpl implements TemperatureService {

  @Override
  public double getConvertedTemperature(double tempF) {
    return 1.8 * (tempF - 273) + 32;
  }
}