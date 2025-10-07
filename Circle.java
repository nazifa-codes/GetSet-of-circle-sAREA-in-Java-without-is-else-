 
package com.mycompany.democircle;

 
public class Circle {
   private double radius;
   private String color;
   
   public double getRadius(){
       return radius;
   }
   public void setRadius(double r){
       this.radius= r;
   }
   public String getColor(){
       return color;
   }
   public void setColor(String c){
       this.color=c;
   }
   public double getArea(){
        return Math.PI*radius*radius;
   }
   public Circle(double r, String c){
       this.radius=r;
       this.color=c;
   }
}
