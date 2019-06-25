import java.io.BufferedReader;
import java.io.FileNotFoundException;
import java.io.IOException;

/**
 * @author Catalin Moldovan
 */
public class InputFromFile {

    private BufferedReader fileInstructions;

    InputFromFile() throws FileNotFoundException {
        String inputFilePath = "E:\\_Work_Catalin\\Project_J\\TeacherStudentInput.txt";
        fileInstructions = new BufferedReader(new java.io.FileReader(inputFilePath));
    }

    String readFromFile() throws IOException {
        return fileInstructions.readLine();
    }

    void manageLineInstructions (String[] instructions) throws Exception {

        if (instructions.length == 1) {
            String studentName = instructions[0];
            if (StudentManager.contains(studentName))
                StudentManager.getStudent(studentName).printSkillList();
            else
                System.out.println("Student " + studentName + " has no skills. Sad");
        }

        else{
            String newTeacherName = instructions[0];
            Teacher currentTeacher = manageNewTeacher(newTeacherName);
            String newStudentName = instructions[2];
            Student currentStudent = manageNewStudent(newStudentName);
            String newSkillName = instructions[3];
            if (currentStudent.skillListContains(newSkillName)){
                currentStudent.getSkill(newSkillName).increaseSkillLevel();
            }
            else{
                currentTeacher.teach(newSkillName, currentStudent);
                System.out.println(currentTeacher.name + " has taught " + currentStudent.getName() + " " + newSkillName);
            }

        }
    }

    private Teacher manageNewTeacher(String teacherName) throws Exception {
        if(TeacherManager.contains(teacherName)){
            return TeacherManager.getTeacher(teacherName);
        }
        else
            return new Teacher(teacherName);
    }

    private Student manageNewStudent(String studentName) throws Exception {
        if(StudentManager.contains(studentName)){
            return StudentManager.getStudent(studentName);
        }
        else
            return new Student(studentName);
    }

//    private Skill manageNewSkill(String skillName){
//        if()
//    }
}
