package com.company;
import java.util.Scanner;

public class FK_19_PR4_PROG5 {
    public static void main(String[] args) {
        System.out.println("Enter your Website Endwith");
        Scanner sc = new Scanner(System.in);
        String website = sc.next();
        
        if (website.endsWith(".org")){
            System.out.println("This is an organizational website");
        }
        else if (website.endsWith(".com")){
            System.out.println("This is commercial website");
        }
        else if (website.endsWith(".in")){
            System.out.println("This is an india website");
        }

    }
}
