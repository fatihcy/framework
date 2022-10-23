package com.weeks.week6;

import java.util.Scanner;

public class StudyWeek6 {
    public static void main(String[] args) {
//        String s1 = "Java";
//        String st1 = "Java";
//
//        String s2 = new String("Java");
//        String s3 = new String("Java");
//
//        String s4 = "java";
//
//        System.out.println(s1 == s2); // false, diff object, diff reference
//        System.out.println(s1 == st1); // true, same object, same reference
//        System.out.println(s1.equals(s2)); // true
//        System.out.println(s2.equals(s3)); // true
//        System.out.println(s1 == s4); // false
//        System.out.println(s1.equalsIgnoreCase(s4)); // true
//
//        String str1 = "abc";
//        String str2 = "abc";
//
//        System.out.println( "str1==str2 is :" + str1 == str2); // true
//                            // "str1==str2 is :abc" == "abc"
//
//        String str = "Cydeo";
//
//        System.out.println("str.concat(\" School\") = " + str.concat(" School")); // Cydeo School
//
//        System.out.println(str); // Cydeo

        /*
        *  Write a program that will accept two Strings and determine if they
        *  are Anagrams of each other

	->  listen
		silent
	->  mary
		army
	 */
        Scanner input = new Scanner(System.in);
        String answer;

        do {
            System.out.println("Please enter the first string : ");
            String one = input.next();
            one = one.toLowerCase();
            System.out.println("Please enter the second string : ");
            String two = input.next();
            two = two.toLowerCase();

            boolean isAnagram;

            if (one.length() != two.length()) {
                isAnagram = false;
            }

            //I will remove the letters of one string from two String one by one in a loop
            for (int i = 0; i < one.length(); i++) {
                char letter = one.charAt(i);
                two = two.replaceFirst(letter + "", "");
            }

            if (two.isEmpty()) {
                isAnagram = true;
            } else {
                isAnagram = false;
            }

            System.out.println(isAnagram);

            System.out.println("Do you want to play again (Yes or No) : ");
            answer = input.next();

        } while (answer.equals("Yes"));



        /*
        while(answer.isEquals("yes") {

            while(
        }
         */


    }
}
