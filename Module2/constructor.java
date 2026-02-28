//Write a program that uses a default constructor and a parameterized constructor to initialize objects of a class Student.

package Module2;

class Student {
    String name;
    int age;

    // Default Constructor
    Student() {
        name = "Appu";
        age = 17;
    }

    // Parameterized Constructor
    Student(String name, int age) {
        this.name = name;
        this.age = age;
    }

    void display() {
        System.out.println("Name: " + name);
        System.out.println("Age: " + age);
        System.out.println();
    }
}

public class constructor {
    public static void main(String[] args) {
        Student s1 = new Student();
        Student s2 = new Student("raj", 20);

        s1.display();
        s2.display();
    }
}
