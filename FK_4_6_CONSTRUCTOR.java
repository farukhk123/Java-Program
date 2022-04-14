package com.company;
class MyBase2{
    MyBase2(){
        System.out.println("I am a constructor");
    }
    MyBase2(int x){
        System.out.println("I am an overloaded constructor with value of x as: " + x);
    }
}

class MyDerived2 extends MyBase2{
    MyDerived2(){
        //super(0);
        System.out.println("I am a derived class constructor");
    }
    MyDerived2(int x, int y){
        super(x);
        System.out.println("I am an overloaded constructor of Derived with value of y as: " + y);
    }
}

class MyChildOfDerived extends  MyDerived2{
    MyChildOfDerived(){
        System.out.println("I am a child of derived constructor");
    }
    MyChildOfDerived(int x, int y, int z){
        super(x, y);
        System.out.println("I am an overloaded constructor of Derived with value of z as: " + z);
    }
}
public class FK_4_6_CONSTRUCTOR {
    public static void main(String[] args) {
        // Base1 b = new Base1();
        // Derived1 d = new Derived1();
        // Derived1 d = new Derived1(14, 9);
        // ChildOfDerived cd = new ChildOfDerived();
        MyChildOfDerived cd = new MyChildOfDerived(12, 13, 15);
    }
}
