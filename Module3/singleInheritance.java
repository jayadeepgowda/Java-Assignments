//Write a program to demonstrate single inheritance with a base class Animal and derived class Dog

package Module3;

class Animal {
    String name;

    void display() {
        System.out.println("Animal name:" + name);
    }
}

class Dog extends Animal {

    void bark() {
        System.out.println(name + " is barking");
    }
}

public class singleInheritance {

    public static void main(String[] args) {

        Dog d = new Dog();
        d.name = "tony";
        d.display();
        d.bark();
    }
}
