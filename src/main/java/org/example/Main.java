package org.example;

import java.util.ArrayList;
import java.util.Collections;
import java.util.HashMap;

public class Main
{
    public static void main(String[] args)
    {
        ArrayList<String> cars = new ArrayList<String>();
        cars.add("Volvo");
        cars.add("BMW");
        cars.add("Ford");
        cars.add("Mazda");
        cars.set(0, "Opel");
        System.out.println(cars.get(0));
        for (int i = 0; i < cars.size(); i++)
        {
            System.out.println(cars.get(i));
        }
        System.out.println("------------------------------");
        ArrayList<String> carsTwo = new ArrayList<String>();
        carsTwo.add("Volvo");
        carsTwo.add("BMW");
        carsTwo.add("Ford");
        carsTwo.add("Mazda");
        Collections.sort(carsTwo);  // Sort cars
        for (String i : carsTwo) {
            System.out.println(i);
        }
        System.out.println("------------------------------");
        ArrayList<Integer> myNumbers = new ArrayList<Integer>();
        myNumbers.add(33);
        myNumbers.add(15);
        myNumbers.add(20);
        myNumbers.add(34);
        myNumbers.add(8);
        myNumbers.add(12);

        Collections.sort(myNumbers);  // Sort myNumbers

        for (int i : myNumbers) {
            System.out.println(i);
        }

        System.out.println("------------------------------");
        //A HashMap can store different types: String keys and Integer values
        HashMap<String, String> capitalCities = new HashMap<String, String>();

        // Add keys and values (Country, City)
        capitalCities.put("England", "London");
        capitalCities.put("Germany", "Berlin");
        capitalCities.put("Norway", "Oslo");
        capitalCities.put("USA", "Washington DC");
        System.out.println(capitalCities);
        // we can print the method values()
        for (String i : capitalCities.keySet()) {
            System.out.println(i);
        }
    }
}