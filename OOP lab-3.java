First Task:Write a java program to create a class called “Shape”with abstract methods for calculating area and perimeter,and subclasses for “Rectangle”.
Source  Code:
package oop;
public abstract class Shape {
    public abstract double getArea();
    public abstract double getPerimeter();
    }

package oop;

public class Rectangle extends Shape {
    private double length;
  private double width;
 public Rectangle(double length, double width) {
    this.length = length;
    this.width = width;
  }
 public double getArea() {
    return length * width;
  }
  public double getPerimeter() {
    return 2 * (length + width);
  }
}


package oop;

public class Test {
    public static void main(String[] args){
       Shape rectangle = new Rectangle(10, 12);
       System.out.println("\nRectangle: Length-10, Width-12");
    System.out.println("Area: " + rectangle.getArea());
    System.out.println("Perimeter: " + rectangle.getPerimeter());
    }
    
}
 
Second Task:
 Q1.What is an interface in Java and how is it diﬀerent from a class?
 Source Code:
package newpackage;
public class JavaTester {
      public static void main(String args[]) {
      Animal tiger = new Tiger();
      tiger.eat();
      Tiger tiger1 = new Tiger();
      tiger1.eat();
   }
}
interface Animal {
   public void eat();
}
 
