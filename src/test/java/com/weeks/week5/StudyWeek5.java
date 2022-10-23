package com.weeks.week5;

public class StudyWeek5 {

    public static void main(String[] args) {
        // How to convert numeric String (not contain 0) to an int?
        // For example, if you pass "67263" to the program then it should return 67263.
        //              67263
        //                  3 -> 3
        //                60 -> 63
        //              200 -> 263
        //            7000 -> 7263
        //          60000 -> 67263
        //       +_________
        //          67263

        String input = "67263";
        // int result = Integer.valueOf(input);
        int result = 0;
        int position = 1; // 1, 10, 100, ...

        for (int i = input.length() - 1; i >= 0 ; i--) {
            char c = input.charAt(i);
            int x = 0;

            switch(c) {
                case '1':
                    x = 1;
                    break;
                case '2':
                    x = 2;
                    break;
                case '3':
                    x = 3;
                    break;
                case '4':
                    x = 4;
                    break;
                case '5':
                    x = 5;
                    break;
                case '6':
                    x = 6;
                    break;
                case '7':
                    x = 7;
                    break;
                case '8':
                    x = 8;
                    break;
                case '9':
                    x = 9;
                    break;
                default:
                    System.out.println("Invalid input. One of the letters is not digit.");
            }

            //x = x * position;
            x *= position;

            //result = result + x;
            result += x;

            position *= 10;
        }

        System.out.println(result);

    }
}
