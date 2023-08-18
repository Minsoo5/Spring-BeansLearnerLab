package java.com.example.demo;

public class Classroom <PeopleType extends People> {
    private Instructors instructorsList;
    private Students studentsList;

    public Instructors getInstructorsList() {
        return instructorsList;
    }

    public void setInstructorsList(Instructors instructorsList) {
        this.instructorsList = instructorsList;
    }

    public Students getStudentsList() {
        return studentsList;
    }

    public void setStudentsList(Students studentsList) {
        this.studentsList = studentsList;
    }

    public Classroom(Instructors instructorsList, Students studentsList) {
        this.instructorsList = instructorsList;
        this.studentsList = studentsList;
    }

    public void hostLecture(Teacher teacher, double numberOfHours) {
        teacher.lecture(this.studentsList, numberOfHours);
    }

}
