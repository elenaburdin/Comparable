package com.company;

import java.util.ArrayList;
import java.util.Collections;

class Student implements Comparable<Student> {
    int rollno;
    String name;
    int age;

    public Student(int rollno, String name, int age) {
        this.rollno = rollno;
        this.name = name;
        this.age = age;
    }

    @Override
    public int compareTo(Student st) {
        if (age == st.age) {
            return 0;
        } else if (age > st.age) {
            return 1;
        } else {
            return -1;
        }
    }
}


public class Main {
    public static void main(String[] args) {
        ArrayList<Student> students = new ArrayList<Student>();
        students.add(new Student(101, "Emma", 23));
        students.add(new Student(102, "Alice", 27));
        students.add(new Student(103, "Joe", 29));

        Collections.sort(students);
        for (Student st : students) {
            System.out.println(st.rollno + " " + st.name + " " + st.age);
        }
    }
}