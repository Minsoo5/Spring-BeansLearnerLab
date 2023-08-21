package com.example.demo;

import java.util.Iterator;
import java.util.List;

public class Students <StudentType extends Student> extends People  {

    public Students(StudentType... students) {
        super(students);
    }

    public Students(List personList) {
        super(personList);
    }

    @Override
    public Iterator iterator() {
        return null;
    }
}
