package com.company;

public class FK_10_Increment_Decrement_operators {
    public static void main(String[] args) {
        int i = 56;
        // int b = i++;// first b is assigned i then is incremented
        int  j = 67;
        int c = ++j; // first j is incremented then C is assigned j (68)

        System.out.println(i++);
        System.out.println(i);
        System.out.println(++i);
        System.out.println(i);
        int  y = 7;
        System.out.println(++y * 8);
        char ch = 'a';
        System.out.println(ch++);
        System.out.println(ch);

    }
}
