package areaofacircle;

import java.util.Scanner;

public class Area {
    // area is a = pi * r * r
    // pi = 3.14
    //r = radius
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);
        System.out.println("Enter a radius: ");

        Double radius = input.nextDouble();
        Double answer = 3.14 * radius * radius;

        System.out.println("The area of a circle of radius " + radius + " is: " + answer);
    }
}

