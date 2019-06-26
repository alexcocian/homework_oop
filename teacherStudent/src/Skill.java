/**
 * @author Catalin Moldovan
 */
class Skill {

    String name;
    private int skillLevel;
    private Teacher holder;

    Skill(String name){
        this.name = name;
        this.skillLevel = 1;
    }

    Teacher getHolder() {
        return holder;
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

    String name() {
        return name;
    }
}
