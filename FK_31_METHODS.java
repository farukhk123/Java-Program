package com.company;

public class FK_31_METHODS {
    static int logic(int x, int y){
        int z;
        if(x>y){
            z = x+y;
        }
            else  {
                z = (x +y) * 5;
            }

        return  z;

    }
    public static void main(String[] args) {
        int a = 5;
        int b = 7;
        int c;
        c = logic(a,b);
        int a1= 2;
        int b1= 1;
        int c1;
        if(a1>b1){
            c1 = a1*b1;
        }
        else{
            c1 = logic(a1,b1);

        }
        System.out.println(c);
        System.out.println(c1);

    }
}
