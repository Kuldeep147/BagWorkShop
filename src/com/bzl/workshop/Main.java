package com.bzl.workshop;
public class Main {
    public static void main(String[] args) {
        Bag bag = new Bag();
        Main ob = new Main();

        Ball ball1  = new Ball();
        ball1.setColor("red");
        bag.addBall(ball1);

        Ball ball2 = new Ball();
        ball2.setColor("yellow");
        bag.addBall(ball2);

        Ball ball3 = new Ball();
        ball3.setColor("green");
        bag.addBall(ball3);

        Ball ball4 = new Ball();
        ball4.setColor("red");
        bag.addBall(ball4);

        Ball ball5 = new Ball();
        ball5.setColor("green");
        bag.addBall(ball5);

        Ball ball6 = new Ball();
        ball6.setColor("red");
        bag.addBall(ball6);

        Ball ball7 = new Ball();
        ball7.setColor("red");
        bag.addBall(ball7);

        Ball ball8 = new Ball();
        ball8.setColor("green");
        bag.addBall(ball8);

        Ball ball9 = new Ball();
        ball9.setColor("yellow");
        bag.addBall(ball9);

        Ball ball10 = new Ball();
        ball10.setColor("blue");
        bag.addBall(ball10);

        Ball ball11 = new Ball();
        ball11.setColor("red");
        bag.addBall(ball11);

        Ball ball12 = new Ball();
        ball12.setColor("blue");
        bag.addBall(ball12);

        ob.print(bag.getBalls());


    }
    public  void print(Ball[] b){
        for(int i = 0; i < b.length; i++){
            System.out.println(b[i]);
        }
    }

}