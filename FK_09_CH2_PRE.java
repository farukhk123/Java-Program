package com.company;

public class FK_09_CH2_PRE {
    public static void main(String[] args) {
        int a = 6*5-34/2;
        /*
        Hightest precedence gose to * and /. Thay are then evaluated on the basis of left to right associativity
        =30-34/2
        =30-17
        13
         */
        int b = 60/5-34*2;
        /*
        12-34*2
        12-68
        -56
         */
        System.out.println(a);
        System.out.println(b);
        //Precdence & Associativity
    }
}
