package com.syntsx.class21;
/*Write program: Shape class has a constructor that takes the radius
 and has a subclass as  circle class.
 In circle class create a method to calculate the area of circle.
  Test your code
 */
public class shapeClass {
    double radius;

    public shapeClass(double radius) {
        this.radius = radius;
    }
}
    class circle extends shapeClass{
        public circle(double radius) {
            super(radius);

        }

        void areaOfCurcle() {
            System.out.println(3.14*radius*radius);
        }

    }
    class tester1 {
        public static void main(String[] args) {
            circle obj=new circle(5);
            obj.areaOfCurcle();
        }
    }
