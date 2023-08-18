package java.com.example.demo;

import java.util.Iterator;

public class Instructors <InstructorType extends Instructor> extends People {
    public Instructors(InstructorType... instructor) {
        super(instructor);
    }
    @Override
    public Iterator iterator() {
        return null;
    }
}
