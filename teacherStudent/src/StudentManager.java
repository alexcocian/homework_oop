import java.util.ArrayList;
import java.util.List;

/**
 * @author Catalin Moldovan
 */
class StudentManager {

    private static List<Student> studentList = new ArrayList<>();

    static void addStudent (Student newStudent){
        studentList.add(newStudent);
    }

    static boolean contains(String studentName){
        for (Student student: StudentManager.studentList) {
            if(student.name.equals(studentName))
                return  true;
        }
        return false;
    }

    static Student getStudent (String studentName) throws Exception {
        for (Student student:
                studentList) {
            if(student.name.equals(studentName))
                return student;
        }
        throw new Exception();
    }
}
