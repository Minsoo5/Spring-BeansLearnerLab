package com.example.demo.Config;

import com.example.demo.*;
import org.springframework.context.annotation.Bean;
import org.springframework.context.annotation.Configuration;
import org.springframework.context.annotation.DependsOn;

@Configuration
public class ClassroomConfig {
    @Bean
    @DependsOn({"instructors", "students"})
    public Classroom currentCohort() {

        Instructors inst = new Instructors<>();
        inst.add(new Instructor(1l, "Kris"));
        inst.add(new Instructor(2l, "Dolio"));
        inst.add(new Instructor(3l, "Razz"));

        Students st = new Students();
        st.add(new Student(1l, "Joe"));
        st.add(new Student(2l, "Brent"));
        st.add(new Student(3l, "Maggie"));

        Classroom classroom = new Classroom<>(inst, st);
        return classroom;
    }

    @Bean
    @DependsOn({"instructors", "students"})
    public Classroom previousCohort() {

        Instructors inst = new Instructors<>();
        inst.add(new Instructor(1l, "Kris"));
        inst.add(new Instructor(2l, "Dolio"));
        inst.add(new Instructor(3l, "Razz"));

        Students st = new Students();
        st.add(new Student(1l, "Adam"));
        st.add(new Student(2l, "Jen"));
        st.add(new Student(3l, "Nina"));

        Classroom classroom = new Classroom<>(inst, st);
        return classroom;
    }

}
