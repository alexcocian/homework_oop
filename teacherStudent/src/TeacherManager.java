import java.util.ArrayList;
import java.util.List;

/**
 * @author Catalin Moldovan
 */
class TeacherManager {

    private List<Teacher> teachersList;

    TeacherManager() {
        teachersList = new ArrayList<>();
    }

    Teacher ensureTeacherExists(String teacherName) throws Exception {
        if (teacherListContains(teacherName)) {
            return getTeacher(teacherName);
        }
        Teacher newTeacher = new Teacher(teacherName);
        teachersList.add(newTeacher);
        return newTeacher;
    }

    private boolean teacherListContains(String teacherName) {
        for (Teacher teacher : teachersList) {
            if (teacher.name.equals(teacherName))
                return true;
        }
        return false;
    }

    private Teacher getTeacher(String teacherName) throws Exception {
        for (Teacher teacher :
                teachersList) {
            if (teacher.name.equals(teacherName))
                return teacher;
        }
        throw new Exception();
    }
}
