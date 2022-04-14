package com.company;
class  MyEmployee{
     private int id;
     private String name;

     public String getName(){
         return name;
     }
     public void setName(String n){
         name = n;
     }
     public void setId(int i){
         id = i;
     }
     public int getId(){
         return id;
     }

}
public class FK_40_CH9 {
    public static void main(String[] args) {
        MyEmployee farukh = new MyEmployee();
        //farukh.id = 34;
        //farukh.name = "khan";

        farukh .setName("Mirja");
        System.out.println(farukh.getName());
        farukh.setId(355);
        System.out.println(farukh.getId());

    }
}
