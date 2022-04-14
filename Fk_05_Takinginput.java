package com.company;
import java.util.Scanner;

public class Fk_05_Takinginput {
    public static void main(String[] args) {
        System.out.println("It works");
        Scanner sc = new Scanner(System.in);
        System.out.println("enter number 1");
      //  int a = sc.nextInt();
        float a = sc.nextFloat();
        System.out.println("enter number 2");
        //int b = sc.nextInt();
        float b = sc.nextFloat();
        float sum = a+b;
        System.out.println(sum);
    }

}
