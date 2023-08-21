package com.example.demo.Config;

import com.example.demo.Instructor;
import com.example.demo.Instructors;
import org.springframework.context.annotation.Bean;
import org.springframework.context.annotation.Primary;

public class InstructorConfig {
    @Bean
    public Instructors tcUsaInstructors() {

        Instructors inst = new Instructors<>();
        inst.add(new Instructor(1l, "Kris"));
        inst.add(new Instructor(2l, "Dolio"));
        inst.add(new Instructor(3l, "Razz"));

        return inst;
    }

    @Bean
    public Instructors tcUkInstructors() {

        Instructors inst = new Instructors<>();
        inst.add(new Instructor(4l, "UK Kris"));
        inst.add(new Instructor(5l, "UK Dolio"));
        inst.add(new Instructor(6l, "UK Razz"));

        return inst;
    }

    @Primary
    @Bean
    public Instructors instructors() {

        Instructors inst = new Instructors<>();
        inst.add(new Instructor(1l, "Kris"));
        inst.add(new Instructor(2l, "Dolio"));
        inst.add(new Instructor(3l, "Razz"));
        inst.add(new Instructor(4l, "UK Kris"));
        inst.add(new Instructor(5l, "UK Dolio"));
        inst.add(new Instructor(6l, "UK Razz"));

        return inst;
    }

}
