package com.company;

import java.util.Scanner;

public class Main {

    //Tirgul:
    //1. create a function that get 3 different grades(float), and checks what is the higher grade and return it from function.
    //2. create function that get an array of int[] and return the average of array's values. {5, 10, 15}
    //3. create a function that gets 2 arrays and return the name of the array with the larger size. (return String)

    static Scanner s = new Scanner(System.in);

    public static void main(String[] args) {
        float g1 = s.nextFloat();
        float g2 = s.nextFloat();
        float g3 = s.nextFloat();

        float hG = checkHigherGrade(g1, g2, g3);
        System.out.println(hG);
        System.out.println("rest of the code");
        
        int array1 [] = {5,10,15};
        int avgArray1 = avgArray(array1);
        System.out.println(avgArray1);
        
         int array2 [] = {20,30,70,90,100};
        int avgarray2 = avgArray(array2);
        System.out.println(avgarray2);
        
         int arr1 [] = {9,5,2,0};
        int arr2 [] = {0,0,8,7};
        String result = maxArray(arr1, arr2);
        System.out.println(result);
    }
    
       public static String maxArray(int array1[], int array2 []){
        if(array1.length > array2.length){
            return "array1";
        }
        else if (array2.length > array1.length){
            return "array2";
        }
        else {
            return "equals";
        }
    }
    
    public static int avgArray(int [] array){
        int sum = 0;  // will sun array values
        for(int i = 0; i < array.length; i++){
            //sum = sum + array[i];
            sum += array[i];
        }
        int avg = sum / array.length;
        return avg;
    }
    
    public static float checkHigherGrade(float grade1, float grade2, float grade3){

        return  Math.max(Math.max(grade1, grade2),grade3);
    }

}
