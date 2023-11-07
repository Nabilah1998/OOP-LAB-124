1.	Write a Java program to calculate the area of a Circle. (You have to take input the circle radius from user)

Source Code:

package oop_lab_report_1;
import java.util.Scanner;
public class Area_of_Circle {
public static void main(String[] args) {
double pi = 3.1416;
double area;
int r;
Scanner s = new Scanner(System.in);
System.out.println("Enter Radius");
r = s.nextInt();
area = pi*r*r;
System.out.println("Area :"+area);
}
}
2.	Write a Java program to create a class called "Person" with a name and age attribute. Create two instances of the "Person" class, set their attributes using the constructor, and print their name and age.
Source Code:

package oop_lab_report_1;
public class Person {
private String name;
private int age;
public Person(String name, int age) {
this.name = name;
this.age = age;
}
public String Name() {
return name;
}
public int Age() {
return age;
}
}
//main method
public class Main {
public static void main(String[] args) {
Person person1 = new Person("Misfa", 20);
Person person2 = new Person("Jannat", 26);
System.out.println(person1.Name() + " is " + person1.Age() + " years old.");
System.out.println(person2.Name() + " is " + person2.Age() + " years old.");
}
}
