import java.util.ArrayList;
import java.util.List;

/**
 * @author Catalin Moldovan
 */
class StudentManager {

    private List<Student> studentList;

    StudentManager() {
        this.studentList = new ArrayList<>();
    }

    Student ensureStudentExists(String studentName) throws Exception {
        if (studentListContains(studentName)) {
            return getStudent(studentName);
        }
        Student newStudent = new Student(studentName);
        studentList.add(newStudent);
        return newStudent;
    }

    private boolean studentListContains(String studentName) {
        for (Student student : studentList) {
            if (student.name.equals(studentName))
                return true;
        }
        return false;
    }

    private Student getStudent(String studentName) throws Exception {
        for (Student student : studentList) {
            if (student.name.equals(studentName))
                return student;
        }
        throw new Exception();
    }
}
