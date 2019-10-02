package com.gmail.liftiwan1996;

import java.util.Scanner;

public class Service {

  private FahrenheitServiceImpl fahrenheit = new FahrenheitServiceImpl();
  private KelvinServiceImpl kelvin = new KelvinServiceImpl();
  private CelsiusServiceImpl celsius = new CelsiusServiceImpl();

  void getTemperature() {
    Scanner sc = new Scanner(System.in);
    System.out.println("Please input temperature");
    String temperature = sc.nextLine();
    int temp = Integer.parseInt(temperature.replaceAll("[^0-9]", ""));
    String typeT = temperature.substring(temperature.length() - 1);

    switch (typeT) {
      case "C":
        System.out.println("Your temperature is " + celsius.getConvertedTemperature(temp) + " C");
        break;
      case "F":
        System.out.println("Your temperature is " + fahrenheit.getConvertedTemperature(temp) + " F");
        break;
      case "K":
        System.out.println("Your temperature is " + kelvin.getConvertedTemperature(temp) + " K");
        break;
      default:
        System.out.println("You input invalid type of temperature");
        break;
    }
  }
}
