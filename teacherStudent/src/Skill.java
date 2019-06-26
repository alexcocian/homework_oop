/**
 * @author Catalin Moldovan
 */
class Skill {

    String skillName;
    private Teacher holder;
    private int skillLevel;

    Skill(String name){
        this.skillName = name;
        this.skillLevel = 1;
    }

    void setHolder(Teacher holder) {
        this.holder = holder;
    }

    int getSkillLevel() {
        return skillLevel;
    }

    void increaseSkillLevel() {
        this.skillLevel += 1 ;
    }

    String getSkillName() {
        return skillName;
    }
}
