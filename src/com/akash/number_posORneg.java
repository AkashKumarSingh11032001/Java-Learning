package com.akash;

import java.util.Scanner;

public class number_posORneg {
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);

        int n = input.nextInt();

        if (n < 0) {
            System.out.println("negative");

        }else {
            System.out.println("Positive");
        }


    }
}