import java.util.ArrayList;
import java.util.List;

/**
 * @author Catalin Moldovan
 */
class Student extends Person {

    private List<Skill> skillList;

    Student(String studentName) {
        this.name = studentName;
        skillList = new ArrayList<>();
    }

    void learn(Skill newSkill) throws Exception {
        if (skillListContains(newSkill)) {
            getSkill(newSkill.getSkillName()).increaseSkillLevel();
        } else {
            skillList.add(newSkill);
        }
    }

    private Skill getSkill(String skillToSearch) throws Exception {
        for (Skill skill : skillList) {
            if (skill.getSkillName().equals(skillToSearch)) {
                return skill;
            }
        }
        throw new Exception();
    }

    void printSkillList() {
        if (skillList == null)
            System.out.println("Student " + this.name + " has no skills. Sad");
        for (Skill skill : skillList) {
            System.out.println(skill.getSkillName() + ": level " + skill.getSkillLevel());
        }
    }

    private boolean skillListContains(Skill newSkill) {
        for (Skill skill :
                skillList) {
            if (skill.skillName.equals(newSkill.getSkillName()))
                return true;
        }
        return false;
    }
}
