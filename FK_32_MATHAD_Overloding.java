package com.company;

import org.w3c.dom.ls.LSOutput;

public class FK_32_MATHAD_Overloding {
    static void foo(){
        System.out.println("Good Morning bro!");
    }

    static void foo(int a) {
        System.out.println("Good morning " + a + "bro!");
    }
    static void foo(int a, int b){
        System.out.println("Good morning " + a + "bro!");
        System.out.println("Good morning " + b + "bro!");
    }

    static void change(int [] arr){
        arr[0] = 98;
    }
    static void telljoke() {
        System.out.println("I invented a new word!\n" + "Plagiarism!");
    }

    public static void main(String[] args) {
       // telljoke();
     /*   int [] marks = {52,73,77,89,98,94};
        change(marks);
        System.out.println("The value of x after running change is " + marks[0]); */

        // Method Overloading
        foo();
        foo( 2000);
        foo(3000,4000);



    }
}
