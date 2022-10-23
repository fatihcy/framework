package com.cydeo;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.Collections;
import java.util.List;

public class SortLettersAndNumbers {

    public static void main(String[] args) {
        System.out.println("sorted(\"DC501GCCCA098911\") = " + sorted("DC501GCCCA098911"));

        // “CD015ACCCG011899"
    }

    public static String sorted(String s) {

        char[] arr = s.toCharArray();
        String result = "";
        List<Character> temp = new ArrayList<>();

        for (int i = 0; i < arr.length; ++i) {

            while(i < arr.length && Character.isLetter(arr[i])) {
                temp.add(arr[i++]);
            }

            Collections.sort(temp);

            for (Character c : temp) {
                result += c;
            }

            temp.clear();

            while(i < arr.length && Character.isDigit(arr[i])) {
                temp.add(arr[i++]);
            }

            Collections.sort(temp);

            for (Character c : temp) {
                result += c;
            }

            temp.clear();

        }

        return result;
    }

}
