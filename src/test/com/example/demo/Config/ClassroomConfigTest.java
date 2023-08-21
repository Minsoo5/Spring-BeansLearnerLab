package com.example.demo.Config;

import com.example.demo.Person;
import com.example.demo.Student;
import org.junit.jupiter.api.Test;
import org.junit.runner.RunWith;
import org.springframework.boot.test.context.SpringBootTest;
import org.springframework.test.context.junit4.SpringRunner;

import static org.junit.jupiter.api.Assertions.*;
@RunWith(SpringRunner.class)
@SpringBootTest(classes = StudentConfig.class)
class ClassroomConfigTest {

    @Test
    void currentCohortTest() {
        //Given
        StudentConfig studentBean = new StudentConfig();
        Student expectedStu = new Student(1L, "Min");

        //When
        Person actualStu =  studentBean.currentStudents().findById(1L);
        System.out.println(actualStu.getClass());
        //Then

    }

    @Test
    void previousCohortTest() {
    }
    
}