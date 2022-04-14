package com.company;

public class FK_27_Arrays {
    public static void main(String[] args) {
       /* float [] marks = {98.0f,55.5f,77.6f,55.4f,44.4f};
        System.out.println(marks.length);
        System.out.println(marks[2]);
       String [] student = {"Farukh","rahul","tushar","divyansh"};
        System.out.println(student.length);
        System.out.println(student[0]);  */

        int [] marks = {98,45,79,99,88};
     //   System.out.println(marks.length);
        System.out.println("Printing using for loops");

        for (int i= 0; i<marks.length; i++){
            System.out.println(marks[i]);
        }
        System.out.println("Printing using for loops in Reverse order ");

        for (int i=  marks.length -1; i>0; i--) {
            System.out.println(marks[i]);
        }
        System.out.println("Printing using for-each loops ");
        for (int element: marks) {
            System.out.println(element);
        }
    }

}
