package OOPS;
// objects and classes
class Pen{
    String color;
    String type; // like - ballpoint


    public void write() {
        System.out.println("writing something");
    }

    public void printColor(){
        System.out.println(this.color);
    }
}


class Student{
    String name;
    int age;

    public void printInfo(){
        System.out.println(this.name);
        System.out.println(this.age);

    }
    // constructor for class (non-parameterised)
    // Student(){
    //     System.out.println("constructor called");
    // }
    // contructor for class (parameterised)
    Student(String name, int age){
        this.name = name;
        this.age = age;
    // }

    // Student(Student s2){
    //     this.name = s2.name;
    //     this.age = s2.age;
    // }
    // Student(){

     }

}



public class Main {
    public static void main(String[] args) {
    //     Pen pen1 = new Pen();
    // //  type (class name) name = new Pen()
    //     pen1.color = "blue"; // properties define kar di
    //     pen1.type = "gel"; // properties define kar di

    //     Pen pen2 = new Pen();
    //     pen2.color = "black";
    //     pen2.type = "ball point";

    //     // ab method kese call kare
    //     pen1.printColor();
    //     pen2.printColor();

        Student s1 = new Student("aman", 25); 
        // s1.name = "Lakshit";
        // s1.age = 20;

        // Student s2 = new Student(s1); // copy constructor
        s1.printInfo();

    }
}
