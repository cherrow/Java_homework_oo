package com.cherrow.model;

public class Rectangle {

    private float length;

    private float width;

    public Rectangle(float length, float width) {
        this.length = length;
        this.width = width;
    }

    public float area() {
        return length * width;
    }

    public float circumference() {
        return 2 * (length + width);
    }
}
