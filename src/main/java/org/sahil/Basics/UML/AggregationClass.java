package org.sahil.Basics.UML;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;

// Professor Class
class Professor {
    private String name;

    public Professor(String name) {
        this.name = name;
    }

    public String getName() {
        return name;
    }
}

// Department Class (Aggregation Relationship)
class Department {
    private String name;
    private List<Professor> professors;

    public Department(String name, List<Professor> professors) {
        this.name = name;
        this.professors = professors;
    }

    public void showProfessors() {
        System.out.println("Department: " + name);
        for (Professor professor : professors) {
            System.out.println(professor.getName());
        }
    }
}



public class AggregationClass {
    public static void main(String[] args) {
        Professor professor1 = new Professor("Dr. John");
        Professor professor2 = new Professor("Dr. Brown");

        List<Professor> professors = Arrays.asList(professor1, professor2);
        Department department = new Department("Computer Science", professors);

        department.showProfessors();
    }
}
