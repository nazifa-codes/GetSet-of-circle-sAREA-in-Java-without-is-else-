 

package com.mycompany.democircle;


public class DemoCircle {

    public static void main(String[] args) {
        Circle c = new Circle(5,"red");
        
        System.out.println("color is "+c.getColor());
        System.out.println("AREA IS "+c.getArea());
        
        Circle c1 = new Circle(7,"yellow");
        System.out.println("changed color is "+c1.getColor());
        System.out.println("AREA IS "+ c1.getArea());
    }
}
