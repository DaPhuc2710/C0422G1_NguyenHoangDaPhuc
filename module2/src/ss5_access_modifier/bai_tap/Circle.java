package ss5_access_modifier.bai_tap;

public class Circle {
     private double radius=1.0;
     private String color="Red";
     public Circle(){}

     public Circle(double r){
          this.radius=r;
     }

     public double getRadius() {
          return radius;
     }

     public double getArea() {
          return radius*radius*Math.PI;
     }
}