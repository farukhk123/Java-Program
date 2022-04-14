package com.company;

class A{
    public int a;
    public int Farukh(){
        return 5;
    }
    public void meth2(){
        System.out.println("I am method 2 class A ");
    }
}

class B extends A {
    public void meth2() {
        System.out.println("I am method 2 class B ");
    }
    public void meth3() {
        System.out.println("I am method 3 class B ");
    }
}
public class FK_48_Method_Overloding {
    public static void main(String[] args) {
      A a =  new A();
      a.meth2();
      B b = new B();
      b.meth2();
    }
}
