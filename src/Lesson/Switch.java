package Lesson;

import com.sun.org.apache.xpath.internal.objects.XString;

import java.util.Scanner;

public class Switch {
    public static void main(String[] args) {
        System.out.println("Enter Day");
        Scanner day= new Scanner(System.in);
        String a = day.next();
        switch (a){
            case  "Mon" :
                System.out.println("အိပ်ရမယ်");
                break;
            case "Tue":
                System.out.println("ထရမယ်");
                break;
            case  "Wed":
                System.out.println("စားရမယ်");
                break;
            case  "Thu":
                System.out.println("ဘာလဲ");
                break;
            case  "Fri":
                System.out.println("ok");
                break;
            default:
                System.out.println("error");
        }
    }
}
