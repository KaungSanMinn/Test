package com.partical.project1;

import javax.xml.bind.SchemaOutputResolver;
import java.util.Arrays;
import java.util.Scanner;

public class MobilePackSwitch {
    public static void main(String[] args) {

        System.out.println("Tpye 979");

        Scanner test = new Scanner(System.in);
        int a = test.nextInt();
        if (a == 979) {
            String[] show = {
                    "1.data",
                    "2.sms",
                    "3.phone call",
                    "4.promo"};
            Arrays.stream(show).forEach(System.out::println);

            Scanner test1 = new Scanner(System.in);
            int aa = test1.nextInt();

            if (aa == 1) {
                String[] tess = {

                        "0.999ks = 480MB",
                        "1.799ks = 385MB",
                        "2.1199ks = 575MB",
                        "3.1899ks = 910MB",
                        "4.2199ks = 1GB",
                        "5.Back"};
                Arrays.stream(tess).forEach(System.out::println);
            }

            Scanner state = new Scanner(System.in);
            int koko = state.nextInt();
            switch (koko) {
                case 1:
                    System.out.println("1.buy\n" +
                            "2.gift");
                    break;
                case 2:
                    System.out.println("1.buy\n" +
                            "2.gift");
                    break;
                case 3:
                    System.out.println("1.buy\n" +
                            "2.gift");
                    break;
                case 4:
                    System.out.println("1.buy\n" +
                            "2.gift");
                    break;
                case 5:
                    Arrays.stream(show).forEach(System.out::println);
                    break;
            }
                    Scanner nyinyi = new Scanner(System.in);
                    int ball = nyinyi.nextInt();

                    switch (ball) {
                        case 1:
                            System.out.println("Thanks You");
                            break;
                        case 2:
                            System.out.println("Enter Phone Number");
                            break;
                    }}
                    }
                }

//    case 2:
//                System.out.println("Ooredoo Onnet SMS,\n"+"1.Monthly - 999ks\n"+"2.Weekly - 399ks\n"+"3.2days - 99ks\n");




