package com.company;

 class  cylinder{
     private int radius;
     private  int height;

     public int getRadius() {
         return radius;
     }

     public void setRadius(int radius) {
         this.radius = radius;
     }

     public   int getHeight(){
         return height;
     }

     public void setHeight(int height) {
         this.height = height;
     }
 }
public class FK_44_PS9 {
    public static void main(String[] args) {
        cylinder MyCylinder = new cylinder();
        MyCylinder.setHeight(12);
        int h = MyCylinder.getHeight();
        System.out.println(h);
        MyCylinder.setRadius(9);
        System.out.println(MyCylinder.getRadius());
    }
}
