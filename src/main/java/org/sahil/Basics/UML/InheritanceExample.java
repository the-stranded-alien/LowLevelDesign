package org.sahil.Basics.UML;

// Superclass: Animal
class Animal {
    public void eat() {
        System.out.println("This animal is eating");
    }
}

// Subclass: Dog (inherits from Animal)
class Dog extends Animal {
    public void bark() {
        System.out.println("This dog is barking");
    }
}

public class InheritanceExample {
    public static void main(String[] args) {
        Dog dog = new Dog();
        dog.eat();
        dog.bark();
    }
}
