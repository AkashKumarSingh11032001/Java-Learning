package com.akash;
import java.util.*;

public class P1_selection_statement {
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);

        int month, year,number_of_days =0;
        String month_name = "";

        System.out.print("Enter month: ");
        month = input.nextInt();
        System.out.print("Enter year: ");
        year = input.nextInt();

        switch (month) {
            case 1 :
                month_name = "January";
                number_of_days = 31;
                break;
            case 2 :
                month_name = "February";
                if((year % 400 == 0) || ((year % 4 == 0) && (year % 100 != 0))){
                    number_of_days = 29;
                }
                else {
                    number_of_days = 28;
                }
                break;
            case 3 :
                month_name = "March";
                number_of_days = 31;
                break;
            case 4 :
                month_name = "April";
                number_of_days = 30;
                break;
            case 5 :
                month_name = "May";
                number_of_days = 31;
                break;
            case 6 :
                month_name = "June";
                number_of_days = 30;
                break;
            case 7 :
                month_name = "July";
                number_of_days = 31;
                break;
            case 8 :
                month_name = "August";
                number_of_days = 31;
                break;
            case 9 :
                month_name = "September";
                number_of_days = 30;
                break;
            case 10 :
                month_name = "October";
                number_of_days = 31;
                break;
            case 11 :
                month_name = "November";
                number_of_days = 30;
                break;
            case 12 :
                month_name = "December";
                number_of_days = 31;
                break;
            default:
                System.out.println("Please enter valid date.");
        }
        System.out.println(month_name +" "+ year+ " has "+number_of_days + " days.");

    }
}