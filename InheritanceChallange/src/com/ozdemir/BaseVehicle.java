package com.ozdemir;

public class BaseVehicle {
    private String name;
    private String size;

    private int currentVelocity;
    private int currentDirection;

    public BaseVehicle(String name, String size) {
        this.name = name;
        this.size = size;

        this.currentVelocity = 0;
        this.currentDirection = 0;
    }

    public void steer (int direction) {
        this.currentDirection = direction;
        System.out.println("Vehicle.steer(): Steering ar "+currentDirection + " degrees.");
    }

    public void move(int velocity, int direction) {
        currentDirection = direction;
        currentVelocity = velocity;
        System.out.println("Vehicle.move() : Moving at "+currentVelocity + " in direction "+currentDirection);
    }

    public String getName() {
        return name;
    }

    public String getSize() {
        return size;
    }

    public int getCurrentVelocity() {
        return currentVelocity;
    }

    public int getCurrentDirection() {
        return currentDirection;
    }

    public void stop () {
        this.currentVelocity = 0;
    }
}