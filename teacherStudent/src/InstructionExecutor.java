/**
 * @author Catalin Moldovan
 */
class InstructionExecutor {

    private StudentManager studentRegister;
    private TeacherManager teacherRegister;

    InstructionExecutor() {
        studentRegister = new StudentManager();
        teacherRegister = new TeacherManager();
    }

    void executeLine(String[] instructions) throws Exception {

        if (instructions.length == 1) {
            Student student = studentRegister.ensureStudentExists(instructions[0]);
            student.printSkillList();
        }
        else {
            Teacher teacher = teacherRegister.ensureTeacherExists(instructions[0]);
            Student student = studentRegister.ensureStudentExists(instructions[2]);
            String skill = instructions[3];
            teacher.teach(skill, student);
            System.out.println(teacher.name + " has taught " + student.name + " " + skill);
        }
    }
}
