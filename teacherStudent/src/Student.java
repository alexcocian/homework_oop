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

    //TOOD: aici ceva nu-i kosher. cineva creaza un skill si ti-l da tie, da tu te prinzi ca il aveai deja asa ca numa ii faci increment. pare ca universul asta nu e in perfecta armonie, ca nu s-ar fi creat ceva inutil daca era.
    //hint: cine "owns" the skill? they should be producing/maintaining it, mi se pare mie. nu? tu cand primesti de afara primesti o bucata, un increment, o informatie. da skillul e al tau...
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
