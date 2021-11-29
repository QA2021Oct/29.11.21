package com.company;

import java.util.Scanner;

public class Main {

    //Write a method named isEven that accepts an int argument.
    // The method should return true if the argument is even, or false otherwise.

    static Scanner s = new Scanner(System.in);

    public static void main(String[] args) {
        // true / false
        System.out.println("Enter a Number - ");
        int numberFromUser = s.nextInt();
        System.out.println("is Even? ");
        boolean result = isEven(numberFromUser);
        System.out.println(result);
        //System.out.println(isEven(numberFromUser));  ///same
        
         // without Scanner:
        int n = 9;
        boolean isZugi = isEven(n);
        System.out.println("is 9 zugi? " + isZugi);
    }

    public static boolean isEven(int number){
        if(number % 2 == 0 ){
            return true;
        }
        else {
          return false;
        }
    }
}
