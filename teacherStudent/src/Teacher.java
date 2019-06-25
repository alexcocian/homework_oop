import java.util.List;
import java.util.Optional;

/**
 * @author Catalin Moldovan
 */
class Teacher extends Person{

    Teacher(String teacherName){
        this.name = teacherName;
        TeacherManager.addTeacher(this);
    }

    void teach(String skillName, Student studentName) throws Exception {
        Skill newSkill = new Skill(skillName);
        newSkill.setHolder(this);
        studentName.getSkillList().add(newSkill);
    }

}
