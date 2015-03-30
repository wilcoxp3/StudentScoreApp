/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */

package studentscoreapp;
import java.util.Arrays;     
public class StudentScoreApp
{
    public static void main(String[] args)
    {
        System.out.println("Welcome to the Student Scores Application\n");
        int numStudents = Validation.getInt("Enter number of students to enter: ", 0, 100);
        System.out.println();
        
        Student[] students = new Student[numStudents];
        for (int i = 0; i < numStudents; i++)
        {
            i++;
            String lastName = Validation.getString("Student " + i + " last name: ");
            String firstName = Validation.getString("Student " + i + " first name: ");
            int score = Validation.getInt("Student " + i + " score: ", 0, 100);
            i--;
            
            students[i] = new Student();
            students[i].setLastName(lastName);
            students[i].setFirstName(firstName);
            students[i].setScore(score);
            
            System.out.println();
        }
        
        Arrays.sort(students);
        
        for (Student s : students)
        {
            System.out.print(s.toString() + "\n");
        }
        
        System.out.println("DONE");
    }
}
