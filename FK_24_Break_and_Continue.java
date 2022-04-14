package com.company;

public class FK_24_Break_and_Continue {
    public static void main(String[] args) {
        // Break And Continue using loops!
       /* for (int i=0;i<5;i++){
            System.out.println(i);
            System.out.println("Java is great");
            if (i==2){
                System.out.println("Ending The loops");
                break;
            }
        } */


        int i=0;
        while (i<5) {
            System.out.println(i);
            System.out.println("Java is great");
            if (i == 2) {
                System.out.println("Ending The loops");
                break;
            }
            i++;
        }
        System.out.println("Loops end");
    }
}
