package com.company;
 /* class Employee{
    int salary;
    String name;
    public int getSalary(){
        return salary;
    }
    public String getName(){
        return name;
    }
    public void setName(String n){
        name = n;
    }
} */

class cellphone{
    public void ringing(){
        System.out.println("Ringing...");
    }
    public void vibrating(){
        System.out.println("Vibrating...");
    }


}

public class FK_39_CH8_PS1 {
    public static void main(String[] args) {

      /*  // Problem 1
        Employee farukh = new Employee();
        farukh.setName("agra");
        farukh.salary = 255;
        System.out.println(farukh.getSalary());
        System.out.println(farukh.getName());  */

        // Problem 2
        cellphone asus =  new cellphone();
        asus.vibrating();
        asus.ringing();
    }
}

