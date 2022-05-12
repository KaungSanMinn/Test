package com.partical.project1;

import com.sun.xml.internal.ws.api.ha.StickyFeature;
import javafx.scene.transform.Scale;

import java.text.BreakIterator;
import java.util.Arrays;
import java.util.Scanner;

public class BankingSystem {
    int id;
    String name;
    double amount; //10000

    BankingSystem(int id, String name, double amount) {
        this.id = id;
        this.name = name;
        this.amount = amount;

    }

    void addAmount(int amt)
    {
        amount += amt;
    }

    void withDraw(int a) {
        if (amount > a) {
            amount = amount - a;
            System.out.println("Your Balance is " + amount);
        } else {
            System.out.println("Your amount is lower than need");
        }

    }

    public static void main(String[] args) {


        System.out.print("Enter Your Name:");
        Scanner name1 = new Scanner(System.in);
        String name11 = name1.nextLine();
        System.out.println(name11);

        System.out.print("Enter Your Password:");
        Scanner pwd1 = new Scanner(System.in);
        int pwd11 = pwd1.nextInt();

        if (pwd11 == 123456) {
            String[] show1 = {
                    "1.Check Your Amount",
                    "2.Add Amount",
                    "3.Withdraw Amount",
                    "4.Log Out"
            };
            Arrays.stream(show1).forEach(System.out::println);
        } else
            System.out.println("Your Password is Wrong");

        Scanner input1 = new Scanner(System.in);
        int input11 = input1.nextInt();

        BankingSystem user1 = new BankingSystem(1, "mg mg", 1000000);

        if (input11 == 1) {
            System.out.println("Your Balance is " + user1.amount + "\n");

            String[] testamount = {
                    "1.Add Amount",
                    "2.WithDraw Amount"
            };
            Arrays.stream(testamount).forEach(System.out::println);

            Scanner input2 = new Scanner(System.in);
            int input22 = input2.nextInt();
            if (input22 == 1) {
                String[] show2 = {
                        "Enter Add Amount"
                };

                Arrays.stream(show2).forEach(System.out::println);

                Scanner entamt1 = new Scanner(System.in);
                int entamt11 = entamt1.nextInt();

                user1.addAmount(entamt11);
                System.out.println("Your Balance is " + user1.amount);
            }
            else if (input22 == 2) {
                String[] show3 = {
                        " Enter Withdraw Amount"
                };
                Arrays.stream(show3).forEach(System.out::println);
            }
            Scanner withd = new Scanner(System.in);
            int withd1 = withd.nextInt();

            user1.withDraw(withd1);
        }
            if (input11 == 2) {
                 String [] add2 = {
                         "Enter Add Amount"
                 };
                 Arrays.stream(add2).forEach(System.out::println);

                Scanner entamt1 = new Scanner(System.in);
                int entamt11 = entamt1.nextInt();

                user1.addAmount(entamt11);
                System.out.println("Your Balance is " + user1.amount);
                }
            if (input11 == 3) {
                String[] add3 = {
                        "Enter Withdraw Amount"
                };
                Arrays.stream(add3).forEach(System.out::println);

                Scanner withd = new Scanner(System.in);
                int withd1 = withd.nextInt();

                user1.withDraw(withd1);

            }
           if ( input11 == 4) {
               String[] add4 = {
                       "Logging out"
               };
               Arrays.stream(add4).forEach(System.out::println);
           }
               }
           }







