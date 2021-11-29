package com.company;

import java.util.Scanner;

public class Main {

    //1. Write a method named isEven that accepts an int argument.
    // The method should return true if the argument is even, or false otherwise.

    static Scanner s = new Scanner(System.in);

    public static void main(String[] args) {
        
        //1: 
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
        
        //2:
        double array [] = {62.5, 30, 98, 100, 55.5, 80, 75, 40 , 56, 99, 86, 85.5, 55, 90};
        double max = greatestGrade(array);
        System.out.println(max);
        
    }

    public static double greatestGrade(double [] array){
        double maxGrade = 0 ;
        for(int i = 0; i < array.length; i++){   // { 98  > 62.5
            if(array[i] > maxGrade){
                maxGrade = array[i]; // maxGrade = 98
            }
           // maxGrade = Math.max(array[i], maxGrade);
        }
        return maxGrade;
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
