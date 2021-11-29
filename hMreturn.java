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
    }

    public static float checkHigherGrade(float grade1, float grade2, float grade3){

        return  Math.max(Math.max(grade1, grade2),grade3);
    }

}
