package java.com.example.demo;

public class Classroom <PeopleType extends People> {
    private Instructors instructorsList;
    private Students studentsList;

    public Classroom(Instructors instructorsList, Students studentsList) {
        this.instructorsList = instructorsList;
        this.studentsList = studentsList;
    }

    public void hostLecture(Teacher teacher, double numberOfHours) {
        teacher.lecture(this.studentsList, numberOfHours);
    }

}
