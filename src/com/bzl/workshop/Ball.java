package com.bzl.workshop;

public class Ball {
    private String color ;
    public Ball setColor(String color) {
        this.color = color;
        return null;
    }

    @Override
    public String toString() {
        return "color='" + color ;
    }

    public String getColor() {
        return color;
    }
}
