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
            getSkill(newSkill.name).increaseSkillLevel();
        }
        else {
            skillList.add(newSkill);
        }
    }

    void printSkillList() {
        if (skillList.size() == 0)
            System.out.println("Student " + this.name + " has no skills. Sad");
        for (Skill skill : skillList) {
            System.out.println("Student " + this.name + " knows " + skill.name + " -taught by- " +
                    skill.getHolder().name + ": level " + skill.getSkillLevel());
        }
    }

    private boolean skillListContains(Skill newSkill) {
        for (Skill skill :
                skillList) {
            if (skill.name.equals(newSkill.name) &&
                    skill.getHolder().name.equals(newSkill.getHolder().name))
                return true;
        }
        return false;
    }

    private Skill getSkill(String skillToSearch) throws Exception {
        for (Skill skill : skillList) {
            if (skill.name.equals(skillToSearch)) {
                return skill;
            }
        }
        throw new Exception();
    }
}
