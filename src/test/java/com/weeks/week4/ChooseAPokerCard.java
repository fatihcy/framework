package com.weeks.week4;

import java.util.Scanner;

public class ChooseAPokerCard {

    public static void main(String[] args) {

        Scanner scan = new Scanner(System.in);
        System.out.println("ENTER A NUMBER BETWEEN 1 AND 52");
        int cardNumber = scan.nextInt();
        scan.close();

        String cardRank = "";
        String cardSuit = "";

        if (cardNumber < 1 || cardNumber > 52) {
            System.out.println("Invalid card number");
        } else {

            switch ((cardNumber - 1) / 13) {
                case 0:
                    cardSuit = "Clubs";
                    break;
                case 1:
                    cardSuit = "Diamonds";
                    break;
                case 2:
                    cardSuit = "Hearts";
                    break;
                case 3:
                    cardSuit = "Spades";
            }

            switch (cardNumber % 13) {
                case 0:
                    cardRank = "King";
                    break;
                case 1:
                    cardRank = "Ace";
                    break;
                case 11:
                    cardRank = "Jack";
                    break;
                case 12:
                    cardRank = "Queen";
                    break;
                default:
                    cardRank = (cardNumber % 13) + "";  // Converting a number to a string.
            }

            System.out.println("The card you picked is " + cardRank + " of " + cardSuit);
        }

    }

    public static void test() {

        Scanner scan = new Scanner(System.in);
        System.out.println("ENTER A NUMBER BETWEEN 1 AND 52");
        int cardNumber = scan.nextInt();
        scan.close();

        String cardRank = "";
        String cardSuit = "";
        boolean flag = true;

        switch ((cardNumber - 1) / 13) { // needs to be 14, not 13, because 14 is the first number of the next card type
            case 0:
                cardSuit = "Clubs";
                break;
            case 1:
                cardSuit = "Diamonds";
                break;
            case 2:
                cardSuit = "Hearts";
                break;
            case 3:
                cardSuit = "Spades";
                break;
            default:
                System.out.println("Invalid card number");
                flag = false;
        }

        if (flag) {

            switch (cardNumber % 13) {
                case 0:
                    cardRank = "King";
                    break;
                case 1:
                    cardRank = "Ace";
                    break;
                case 11:
                    cardRank = "Jack";
                    break;
                case 12:
                    cardRank = "Queen";
                    break;
                default:
                    cardRank = (cardNumber % 13) + "";  // Converting a number to a string.
            }

            System.out.println("The card you picked is " + cardRank + " of " + cardSuit);
        }
    }
}
