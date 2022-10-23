package com.weeks.week4;

import java.util.Scanner;

public class ScannerLogicOperators {

    public static void main(String[] args) {


        Scanner sc = new Scanner(System.in);

        System.out.print("Insert a number: ");
        int number = sc.nextInt(); // \n
        System.out.println("number = " + number);

        sc.nextLine();

        String text1 = sc.nextLine();
        System.out.println("text1 = " + text1);

        double d = 3.98;



    }
}
