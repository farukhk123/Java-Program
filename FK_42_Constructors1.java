package com.company;
class  MyMainEmployee{
    private int id;
    private String name;


    public MyMainEmployee(){
        id = 45;
        name = "Your-Name- Here";
    }

    public MyMainEmployee(String myName, int myId){
        id = 45;
        name = myName;
    }

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

public class FK_42_Constructors1 {
    public static void main(String[] args) {
        MyMainEmployee farukh = new MyMainEmployee("Farukh khan mirja", 41);
        System.out.println(farukh.getId());
        System.out.println(farukh.getName());
    }
}
