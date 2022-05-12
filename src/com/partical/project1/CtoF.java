package com.partical.project1;

import java.util.Arrays;
import java.util.Scanner;

public class CtoF {
    public static void main(String[] args) {
        System.out.println("Please Choose: \n 1.Celcius to Farenhein \n 2.Farenheit to Celcius");

        Scanner a = new Scanner(System.in);
        int userinput1 = a.nextInt();

        if (userinput1 == 1) {
            String[] aa = {
                    "Enter Celcius number"
            };
            Arrays.stream(aa).forEach(System.out::println);

            Scanner b = new Scanner(System.in);
            double userinput2 = b.nextDouble();

            double f = (userinput2 * 9 / 5) + 32;
            System.out.println(f + "°F");
        }
        if (userinput1 == 2) {
            String[] bb = {
                    "Enter Fahrenheit number"
            };
            Arrays.stream(bb).forEach(System.out::println);
        }

        Scanner b = new Scanner(System.in);
        double userinput2 = b.nextDouble();

        double c = (userinput2 -32 ) * 5/9 ;
        System.out.println(c +"°C");


    }
    }

