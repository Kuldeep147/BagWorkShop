package com.bzl.workshop;

public class Bag {
    private Ball[] balls = new Ball[12];
    private int count = 0;
    private int red = 0;
    private int blue = 0;
    private int green = 0;
    private int yellow = 0;
    public void addBall(Ball balls){

        if(balls.getColor() .equals("yellow") && yellow <= (red + blue + green + yellow) * 0.4 && (red + blue + green + yellow) * 0.4 > 0){
            this.balls[count++] = balls;
            System.out.println("yellow ball is added");
            yellow++;
        }else if(balls.getColor() .equals("red") && green > 0 && red <= 2 * green){
            this.balls[count++] = balls;
            System.out.println("red ball is added");
            red++;
        }else if(balls.getColor() .equals("green") && green <= 3){
            this.balls[count++] = balls;
            System.out.println("green ball is added");
            green++;
        }else if(balls.getColor() .equals("blue")){
            this.balls[count++] = balls;
            System.out.println("blue ball is added");
            blue++;
        }else{
            System.out.println("you can not add this ball");
        }
    }

    public Ball[] getBalls() {

        return balls;
    }


}

