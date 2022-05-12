package Lesson;

import java.util.Scanner;

public class WhileLoop {
    public static void main(String[] args) {
        System.out.println("Enter Number");
        Scanner mark = new Scanner(System.in);
        int a = mark.nextInt();
while (a > 4) {
    System.out.println(a);
    a--;
}

do {
    System.out.print(a + ",");
    a+=2;
}
        while (a < 50 );



}
        }


