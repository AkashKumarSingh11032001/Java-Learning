package com.akash;

public class P5_pattern4 {
    public static void main(String[] args) {
        int row=4, i, j, S = 1;
        S = row - 1;
        for (j = 1; j<= row; j++)
        {
            for (i = 1; i<= S; i++)
            {
                System.out.print(" ");
            }
            S--;
            for (i = 1; i <= 2 * j - 1; i++)
            {
                System.out.print("*");
            }
            System.out.println("");
        }
        S = 1;
        for (j = 1; j<= row - 1; j++)
        {
            for (i = 1; i<= S; i++)
            {
                System.out.print(" ");
            }
            S++;
            for (i = 1; i<= 2 * (row - j) - 1; i++)
            {
                System.out.print("*");
            }
            System.out.println("");
        }

    }
}