package com.partical.project1;

import java.security.Signature;
import java.util.Arrays;
import java.util.Scanner;

public class MobilePackage {
    public static void main(String[] args) {

        System.out.println("Enter Code '979'");

        Scanner code = new Scanner(System.in);
        int input = code.nextInt();

        if (input == 979) {
            String[] packs = {
                    "1.Data",
                    "2.SMS Packs",
                    "3.Phone Call",
                    "4.Promo"};
            Arrays.stream(packs).forEach(System.out::println);

            Scanner code2 = new Scanner(System.in);
            int input2 = code2.nextInt();

            if (input2 == 1) {

                String[] data = {

                        "0.999ks = 480MB",
                        "1.799ks = 385MB",
                        "2.1199ks = 575MB",
                        "3.1899ks = 910MB",
                        "4.2199ks = 1GB",
                        "5.Back"
                };
                Arrays.stream(data).forEach(System.out::println);

                Scanner code3 = new Scanner(System.in);
                int input3 = code3.nextInt();

                if (input3 == 0) {
                    String[] data1 = {
                            "1.buy",
                            "2.gift",
                            "3.back"};
                    Arrays.stream(data1).forEach(System.out::println);

                    Scanner code4 = new Scanner(System.in);
                    int input4 = code4.nextInt();

                    if (input4 == 1) {
                        System.out.println("Successfully Buy");
                    } else if (input4 == 2) {
                        System.out.println("Enter phone Number");
                        Scanner phone = new Scanner(System.in);
                        long phone1 = phone.nextLong();

                        System.out.println("Successfully Gift");

                    } else if (input4 == 3) {

                        Arrays.stream(data).forEach(System.out::println);
                    }
                }
                if (input3 == 1) {
                    String[] data2 = {
                            "1.buy",
                            "2.gift",
                            "3.back"};

                    Arrays.stream(data2).forEach(System.out::println);
                }
                Scanner code5 = new Scanner(System.in);
                int input5 = code5.nextInt();

                if (input5 == 1) {
                    System.out.println("Successfully Buy");
                } else if (input5 == 2) {
                    System.out.println("Enter phone Number");
                    Scanner phone = new Scanner(System.in);
                    long phone1 = phone.nextLong();

                    System.out.println("Successfully Gift");
                }
                   else if (input5 == 3) {
                        Arrays.stream(data).forEach(System.out::println);
                    }
                    }

                    if ( input2 == 2 ) {

                        String[] SMS = {
                                "Ooredoo Onnet SMS",
                                "1.Monthly - 999ks",
                                "2.Weekly - 399ks",
                                "3.2days - 99ks"};

                        Arrays.stream(SMS).forEach(System.out::println);
                        Scanner code6 = new Scanner(System.in);
                        int input6 = code6.nextInt();

                        if (input6 == 1) {
                            String[] SMS1 = {
                                    "1.buy"};
                            Arrays.stream(SMS1).forEach(System.out::println);

                            Scanner code7 = new Scanner(System.in);
                            int input7 = code7.nextInt();

                            if (input7 == 1) {
                                System.out.println("Thank You");
                            }

                            if (input6 == 2) {
                                String[] SMS2 = {
                                        "1.buy"};
                                Arrays.stream(SMS2).forEach(System.out::println);

                                Scanner code8 = new Scanner(System.in);
                                int input8 = code8.nextInt();

                                if (input8 == 1) {
                                     System.out.println("Thank You");
                                }
                            }
                        }
                    }}}}


















