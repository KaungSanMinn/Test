package Lesson;

import java.util.Scanner;

public class controlflow {

    public static void main(String[] args) {
        System.out.println("Enter Your Marks");
        Scanner mark = new Scanner(System.in);
        int a = mark.nextInt();

        if (a <= 39) {
            System.out.println("fail");
        }
        else if (a >= 40 && a <= 79 ) {
            System.out.println("pass");
        }
        else {
            System.out.println("D");

        }

    }
}
