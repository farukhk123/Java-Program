package com.company;

public class FK_24_Continue_loop {
    public static void main(String[] args) {
        // Break And Continue using loops!
    /*    for (int i=0;i<5;i++){

            if (i==2){
                System.out.println("Ending The loops");
                continue;
            }
            System.out.println(i);
            System.out.println("Java is great");
        }*/
        int i=0;
        do {
            i++;
            if (i==2){
                System.out.println("Ending The loops");
                continue;
            }
            System.out.println(i);
            System.out.println("Java is great");
        }while (i<5);
        System.out.println("Loop end here");
    }
}
