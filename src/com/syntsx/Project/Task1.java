package com.syntsx.Project;

public class Task1 {
    /*
    Create an Interface 'Shape' with undefined methods as calculateArea and
    calculatePerimiter. Create 2 classes Circle & Square that implements functionality
    defined in the Shape Interface. Test your code.
     */
    public static void main(String[] args) {
        Shape shape = new Square();
        shape.calculatePerimeter(10);
        // ((Square)shape).test();
    }
}
