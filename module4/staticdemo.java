package module4;
// Write a program to demonstrate static variables and static methods

class Student {
    static String schoolName = "primary School";

    String studentName;

    public Student(String name) {
        this.studentName = name;
    }

    static void changeSchoolName(String newName) {
        schoolName = newName;
    }

    void display() {
        System.out.println("Student: " + studentName + " | School: " + schoolName);
    }
}

public class staticdemo {
    public static void main(String[] args) {
        System.out.println("Initial School: " + Student.schoolName);

        Student s1 = new Student("Alice");
        Student s2 = new Student("Bob");

        s1.display();
        s2.display();

        System.out.println("\n Updating school for everyone ");
        Student.changeSchoolName("High school");

        s1.display();
        s2.display();
    }
}