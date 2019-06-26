import java.util.ArrayList;
import java.util.List;

/**
 * @author Catalin Moldovan
 */
class TeacherManager {

    private List<Teacher> teachersList = new ArrayList<>();

    void addTeacher (Teacher newTeacher){
        teachersList.add(newTeacher);
    }

    private Teacher manageNewTeacher(String teacherName) throws Exception {
        if(TeacherManager.contains(teacherName)){
            return TeacherManager.getTeacher(teacherName);
        }
        else
            return new Teacher(teacherName);
    }

    boolean contains(String teacherName){
        for (Teacher teacher: teachersList) {
            if(teacher.name.equals(teacherName))
                return  true;
        }
        return false;
    }

    private Teacher getTeacher(String teacherName) throws Exception {
        for (Teacher teacher:
             teachersList) {
            if(teacher.name.equals(teacherName))
                return teacher;
        }
        throw new Exception();
    }
}
