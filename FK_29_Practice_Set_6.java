package com.company;

public class FK_29_Practice_Set_6 {
    public static void main(String[] args) {
        //problem 1
/*        float[] marks = {45.7f,67.8f,63.4f,99.2f,100.0f};
        float sum = 0;
        for (float element:marks {
            System.out.println("The value of sum is " + sum);
 } */

        // Problem  2
        float[] marks = {45.7f,67.8f,63.4f,99.2f,100.0f};
        float num = 45.07f;
        boolean isInArray = false;
        for (float element:marks){
           if (num==element){
               isInArray = true;
               break;
           }
        }
        if (isInArray){
            System.out.println("The value of  is present in the array"  );
        }
        else {
            System.out.println(" The value is not present in the array");
        }

    }
}
