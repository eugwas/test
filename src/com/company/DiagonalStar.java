package com.company;

public class DiagonalStar {
    public static void printSquareStar(int number) {
        if (number < 5) {
            System.out.println("Invalid ValueM");                
        } else {
            printFirstOrLastRow(number);
            printMiddleRows(number);
            printFirstOrLastRow(number);
        }
    }

    public static void printFirstOrLastRow(int number) {
        for (int i = 0; i < number; i++) {
            System.out.print("*");
        }
        System.out.println();
    }

    public static void printMiddleRows(int number) {
        for (int i = 1; i < number - 1; i++) {
            System.out.print("*");
            for (int j = 1; j < number - 1; j++) {
                if (j == i) {
                    System.out.print("*");
                } else if (j == number - 1 - i) {
                    System.out.print("*");
                } else {
                    System.out.print(" ");
                }
            }
            System.out.println("*");
        }
    }
}
