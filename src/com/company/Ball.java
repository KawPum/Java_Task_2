package com.company;

public class Ball {
    private String material = "rubber";
    private double diameter = 0.2;

    public void Throw()
    {
        System.out.println("Ball was thrown.");
    }

    public void pumpUp()
    {
        this.diameter += 0.05;
    }

    @Override
    public String toString() {
        return "This ball is made of " + material + " and it has a diameter of " + diameter + " meters";
    }
}
