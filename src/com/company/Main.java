package com.company;

public class Main {

    public static void main(String[] args) {
        // write your code here
        System.out.println(supTotCil(4.3, 2.1));
    }

    private static double supTotCil(double r, double h) {
        return (2 * Math.PI * r * (h + r));
    }


}

