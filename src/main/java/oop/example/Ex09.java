
/*
 *  UCF COP3330 Summer 2021 Assignment 1 Solution
 *  Copyright 2021 Michael Hickey
 */

package oop.example;
import java.util.Scanner;

public class Ex09 {
    public static final int feetSqrtPerGallon = 350;
    public static void main(String[] args) {

        int len, wid, area, numGal;

        Scanner scanner = new Scanner(System.in);
        System.out.println("What is the length of the room in feet? ");
        len = scanner.nextInt();

        System.out.println("What is the width of the room in feet? ");
        wid = scanner.nextInt();

        area = len * wid;
        numGal = area / feetSqrtPerGallon;

        if(area % feetSqrtPerGallon > 0)
        {
            numGal++;
        }

        System.out.println("You will need to purchase " + numGal + " gallons of paint to cover " + area + " square feet.");

    }
}