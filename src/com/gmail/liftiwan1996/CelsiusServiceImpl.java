package com.gmail.liftiwan1996;

public class CelsiusServiceImpl implements TemperatureService {

  @Override
  public double getConvertedTemperature(double tempC) {
    return tempC - 273;
  }
}