package Data;

import java.util.List;

public class StudentGroup {
    private List<Student> studentList;
    private Teacher teacher;

    public List<Student> getStudentList() {
        return studentList;
    }

    public Teacher getTeacher() {
        return teacher;
    }

    public StudentGroup(List<Student> studentList, Teacher teacher) {
        this.studentList = studentList;
        this.teacher = teacher;
    }
}
