package com.company;
import java.util.Scanner;

public class FK_18_Else_If {
    public static void main(String[] args) {
        int age;
        System.out.println("Enter your Age");
        Scanner sc = new Scanner(System.in);
        age = sc.nextInt();
        if (age>56){
            System.out.println("You are exprienced");
        }
        else if (age>46){
            System.out.println("you are semi-exprienced");
        }
        else if (age>36){
            System.out.println("you are semi-semi-exprienced");
        }
        else{
            System.out.println("you are not exprienced");
        }
    }
}
