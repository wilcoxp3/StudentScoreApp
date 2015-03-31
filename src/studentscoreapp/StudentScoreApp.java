

package studentscoreapp;
import java.util.Arrays;
/**
 * <img src="/StudentScoreApp/dist/javadoc/resources/puppy.png">
 * <p>Project 11-2: Student Scores</p>
 * <ul>
 * <li>Professor: Tedd Sperling</li>
 * <li>Course: Introduction to JAVA - (22150)</li>
 * <li>Student: Paul Wilcox</li></ul>
 * This program allows the user to enter student information. It prompts the
 * user to first enter the number of students to be entered, then asks for the
 * first name, last name, and score of each student, then stores each student
 * as an object in an array. It then sorts the array by student last name, and
 * displays the information for all students entered in alphabetical order.
 * @author Paul Wilcox
 * @version 1.0
 */
public class StudentScoreApp
{
    public static void main(String[] args)
    {
        // Print opening message and get prompt for number of students.
        System.out.println("Welcome to the Student Scores Application\n");
        int numStudents = Validation.getInt("Enter number of students to enter: ", 0, 100);
        System.out.println();
        
        // Create array of Student objects of length specified by user
        Student[] students = new Student[numStudents];
        for (int i = 0; i < numStudents; i++)
        {
            // Add one to index for displaying student number
            int studentNum = i + 1;
            // Get last name, first name, and score from user
            String lastName = Validation.getString("Student " + studentNum + " last name: ");
            String firstName = Validation.getString("Student " + studentNum + " first name: ");
            int score = Validation.getInt("Student " + studentNum + " score: ", 0, 100);
            
            // Create new student object and set all fields
            students[i] = new Student();
            students[i].setLastName(lastName);
            students[i].setFirstName(firstName);
            students[i].setScore(score);
            
            System.out.println();
        }
        // Sort array by student last name
        Arrays.sort(students);
        
        // Print information for each student
        for (Student s : students)
        {
            System.out.print(s.toString() + "\n");
        }
        System.out.println("DONE");
    }
}
