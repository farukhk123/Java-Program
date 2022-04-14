package com.company;
import java.util.Scanner;
public class FK_CH1_PS_PROG4 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.println("Enter your KM");
        int km = sc.nextInt();
        double mil = km*0.621371;
        System.out.println(mil);
    }
}
