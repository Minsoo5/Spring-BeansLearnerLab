package java.com.example.demo.Config;

import org.springframework.context.annotation.Bean;

import java.com.example.demo.Student;
import java.com.example.demo.Students;

public class StudentConfig {

    @Bean(name = "students")
    public Students currentStudents() {

        Students st = new Students();
        st.add(new Student(1l, "Joe"));
        st.add(new Student(2l, "Brent"));
        st.add(new Student(3l, "Maggie"));

        return st;
    }
    @Bean()
    public Students previousStudents() {
        Students st = new Students();
        st.add(new Student(1l, "Joe"));
        st.add(new Student(2l, "Brent"));
        st.add(new Student(3l, "Maggie"));

        return st;
    }
}
