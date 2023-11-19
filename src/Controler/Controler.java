package Controler;

import Data.StudentGroup;
import Data.Type;
import Data.User;
import Data.Student;
import Service.DataService;
import Service.StudentGroupService;
import View.StudentView;

import java.util.List;

public class Controler {
    private final DataService service = new DataService();
    private final StudentGroupService studentGroupService = new StudentGroupService();
    private final StudentView studentView = new StudentView();

    public void createStudent(String firstName, String secondName,
                              String lastName, String dateB){
        service.create(firstName,secondName,lastName,dateB, Type.STUDENT);
    }

    public void createTeacher(String firstName, String secondName,
                              String lastName, String dateB){
        service.create(firstName,secondName,lastName,dateB, Type.TEACHER);
    }

    public void getAllStudent(){
        List<User> userList = service.getAllStudent();
        for (User user: userList){
            studentView.printOnConsole((Student) user);
        }
    }

    public List<Integer> studentIds(){
        return studentGroupService.getStudentById();
    }

    public int teacherId(){
        return studentGroupService.getTeacherId();
    }

    public List<Integer> createStudentGroup(){
        return studentGroupService.createStudentGroup();
    }
}
