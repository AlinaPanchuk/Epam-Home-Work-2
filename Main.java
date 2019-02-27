package com.Epam.company.HomeWork2;

public class Main {

    public static void main(String[] args) {
        int firstVariable=42;
        int secondVariable=14;
        firstVariable = firstVariable + secondVariable;
        secondVariable = secondVariable - firstVariable;
        secondVariable = -secondVariable;
        firstVariable = firstVariable - secondVariable;
        System.out.println("first variable = " +firstVariable);
        System.out.println("second variable = " +secondVariable);
    }
}