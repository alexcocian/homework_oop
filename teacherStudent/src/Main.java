import java.io.IOException;
import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;

/**
 * @author Catalin Moldovan
 */
public class Main {

    public static void main(String[] args) throws Exception {

        InputFromFile fileReader = new InputFromFile();
        String lineFromFile = fileReader.readFromFile();

        while (lineFromFile != null) {
            String[] lineElements = lineFromFile.split(" ");

            if (lineElements.length == 1) {
                String studentName = lineElements[0];
                if (StudentManager.contains(studentName))
                    StudentManager.getStudent(studentName).printSkillList();
                else
                    System.out.println("Student " + studentName + " has no skills. Sad");
            }

            else{
                String newTeacherName = lineElements[0];
                Teacher currentTeacher = TeacherManager.manageNewTeacher(newTeacherName);
                String newStudentName = lineElements[2];
                Student currentStudent = StudentManager.manageNewStudent(newStudentName);
                String newSkillName = lineElements[3];
                if (currentStudent.skillListContains(newSkillName)){
                    currentStudent.getSkill(newSkillName).increaseSkillLevel();
                }
                else{
                    currentTeacher.teach(newSkillName, currentStudent);
                    System.out.println(currentTeacher.name + " has taught " + currentStudent.getName() + " " + newSkillName);
                }

            }

            lineFromFile = fileReader.readFromFile();
        }
    }

}
