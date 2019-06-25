import java.util.ArrayList;
import java.util.List;

/**
 * @author Catalin Moldovan
 */
class TeacherManager {

    private static List<Teacher> teachersList = new ArrayList<>();

    static void addTeacher (Teacher newTeacher){
        teachersList.add(newTeacher);
    }

    static boolean contains(String teacherName){
        for (Teacher teacher: teachersList) {
            if(teacher.name.equals(teacherName))
                return  true;
        }
        return false;
    }

    static Teacher getTeacher (String teacherName) throws Exception {
        for (Teacher teacher:
             teachersList) {
            if(teacher.name.equals(teacherName))
                return teacher;
        }
        throw new Exception();
    }
}
