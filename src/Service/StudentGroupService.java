package Service;

import Data.Student;
import Data.StudentGroup;
import Data.Teacher;
import Data.User;

import java.util.ArrayList;
import java.util.List;

public class StudentGroupService extends DataService{
    private List<Student> studentList;
    private Teacher teacher;

    public List<Integer> getStudentById(){
        List<Integer> studentIds = new ArrayList<>();
        for (Student student: studentList) {
            studentIds.add(student.getStudentId());
        }
        return studentIds;
    }

    public int getTeacherId(){
        return teacher.getTeacherId();
    }

    public List<Integer> createStudentGroup(){
        List<Integer> studentGroup = new ArrayList<>();
        studentGroup.addAll(getStudentById());
        studentGroup.add(getTeacherId());
        return studentGroup;
    }

//    public StudentGroup createStudentGroup(List<Student> studentList, Teacher teacher){
//       StudentGroup studentGroup = new StudentGroup(studentList, teacher);
//       return studentGroup;
//    }

    @Override
    public List<User> getAllUser() {
        return super.getAllUser();
    }


}
