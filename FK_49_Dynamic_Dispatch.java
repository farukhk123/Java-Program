package com.company;
class phone{
    public void greet(){
        System.out.println("Hello Good Morning");
    }

    public void name(){
        System.out.println("My name is Farukh");
    }
}

class smatphone extends phone {
    public void rahul(){
        System.out.println("Hey I am Rahul");
    }

    public void name() {
        System.out.println("My name is Farukh in class two");
    }
}
public class FK_49_Dynamic_Dispatch {
    public static void main(String[] args) {
    phone obj = new smatphone();
    obj.greet();
    obj.name();
    }
}
