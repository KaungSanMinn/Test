package com.partical.project1;

import java.util.Scanner;

public class Calculator {
    public static void main(String[] args) {
        Scanner i = new Scanner(System.in);
        int a , b , operator , c = 0 ;

        System.out.println( " Enter the first number");
        a = i.nextInt();
        System.out.println("Enter the second number");
        b = i.nextInt();
        System.out.println("Choose the operation \n" +
                " '1 = +' " + " '2 = -' " + " '3 = *' " + " '4 = /' \n" +
                 " Choice Number ");
        operator = i.nextInt();

        int addition = 1;
        int subtraction = 2;
        int multiplication = 3;
        int dibision = 4;
        if (operator == addition ) {
            c = a + b;
            System.out.println(a + " + " + b + " = " + c  );
        }
            else if ( operator == subtraction ) {

            c = a - b;
            System.out.println(a + " - " + b + " = " + c);
        }
            else if ( operator == multiplication ) {
            c = a * b;
            System.out.println( a + " * " + b + " = " + c);
        }
            else if ( operator == dibision) {
                c = a / b ;
            System.out.println( a + " / " + b + " = " + c );


            }

        }

    }

