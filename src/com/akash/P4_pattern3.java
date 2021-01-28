package com.akash;

public class P4_pattern3 {
    public static void main(String[] args) {
        int row, c, n=4;
        for (row = 1; row <= n; row++)
        {
            for (c = 1; c <= n-row; c++)
                System.out.print(" ");

            for (c = 1; c <= 2*row - 1; c++)
                System.out.print("*");

            System.out.println();
        }
    }
}