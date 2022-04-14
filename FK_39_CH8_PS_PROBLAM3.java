package com.company;
/*  class square{
    int side;
    public int area(){
        return side*side;
    }
    public int perimeter(){
        return 4*side;
    }
} */

class Tommy{
    public void hit(){
        System.out.println("Hitting the enemy");
    }
    public void run(){
        System.out.println("Running from the enemy");
    }
    public void fire(){
        System.out.println("Firing on the enemy");
    }
}

public class FK_39_CH8_PS_PROBLAM3 {
    public static void main(String[] args) {

    /*    square sq = new square();
        sq.side = 3;
        System.out.println(sq.area());
        System.out.println(sq.perimeter());  */

        // Problem 5
        Tommy player1 = new Tommy();
        player1.fire();
        player1.run();
        player1.hit();

    }
}
