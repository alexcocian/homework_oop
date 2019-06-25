import java.util.ArrayList;
import java.util.List;

/**
 * @author Catalin Moldovan
 */
class Student extends Person {

    private List<Skill> skillList;

    Student (String studentName){
        this.name = studentName;
        StudentManager.addStudent(this);
        skillList = new ArrayList<>();
    }

    String getName(){
        return this.name;
    }

    List<Skill> getSkillList() {
        return skillList;
    }

    Skill getSkill(String skillToSearch) throws Exception {
        for (Skill skill : skillList) {
            if (skill.getSkillName().equals(skillToSearch)){
                return skill;
            }
        }
        throw new Exception();
    }

    void printSkillList(){
        for (Skill skill: skillList) {
            System.out.println(skill.getSkillName() + skill.getSkillLevel());
        }
    }

    boolean skillListContains(String skillName){
        for (Skill skill :
            skillList) {
            if(skill.skillName.equals(skillName))
                return true;
        }
        return false;
    }
}
