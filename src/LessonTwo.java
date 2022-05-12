import sun.management.snmp.jvminstr.JvmRTInputArgsEntryImpl;

public class LessonTwo {
    public static void main(String[] args) {
//        int number1 [] = new int[] {3,4,6};
//        System.out.println(number1);


        int number[][] = new int[][]{
                {3, 4, 5, 6},
                {34, 25, 56, 70},
                {343, 567, 543, 452}

        };

        for (int[] num : number){
            for (int i : num) {
                System.out.print(i + "\t");
            }
        }


//        for (int i = 0; i < number.length; i++) {
//            for (int j = 0; j < number.length; j++) {
//                System.out.print(number[i][j] + "\t");
//            }
//        }


    }
}
