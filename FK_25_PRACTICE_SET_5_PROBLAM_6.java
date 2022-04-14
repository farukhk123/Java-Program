package com.company;

public class FK_25_PRACTICE_SET_5_PROBLAM_6 {
    public static void main(String[] args) {
        // What is factorial n = n * n-1 * n-2.....1
        //5! = 5*4*3*2*1

    /*    int n = 5;
        int i = 1;
        int factorial = 1;
        while (i<=n){
            factorial *= i;
            i++;
        }
        System.out.println(factorial);
*/

          int n = 8;
          int sum = 0;
        //for (int i=0;i<10; i++) -Goes form i-0 to i-9
        for (int i=1; i<=10; i++){
            sum += n*i;
        }
        System.out.println(sum);
    }
}
