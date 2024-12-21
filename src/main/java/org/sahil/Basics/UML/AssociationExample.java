package org.sahil.Basics.UML;

class Teacher {
    private String name;
    public Teacher(String name) {
        this.name = name;
    }

    public String getName() {
        return name;
    }
    public void teach(Student student) {
        System.out.println(name + " is teaching " + student.getName());
    }
}

class Student {
    private String name;

    public Student(String name) {
        this.name = name;
    }

    public String getName() {
        return name;
    }
}

public class AssociationExample {
    public static void main(String[] args) {
        Teacher teacher = new Teacher("Miss Teach");
        Student student = new Student("Sahil");

        // Association between teacher and student
        teacher.teach(student);
    }
}
