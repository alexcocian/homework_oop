/**
 * @author Catalin Moldovan
 */
class Teacher extends Person {

    Teacher(String teacherName) {
        this.name = teacherName;
    }

    void teach(String skillName, Student student) throws Exception {
        Skill newSkill = new Skill(skillName);
        newSkill.setHolder(this);
        student.learn(newSkill);
    }

}
