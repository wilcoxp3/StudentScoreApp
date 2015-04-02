
package studentscoreapp;
/**
 * The Student class contains fields for a student's last name, first name and
 * score, as well as getters and setters for each. It also overrides the
 * toString() method, and the compareTo() method of the comparable interface.
 * @author wilcoxp3
 */
public class Student implements Comparable
{
    private String lastName;
    private String firstName;
    private int score;
    
    public Student() {}
    
    public void setLastName(String lastName)
    {
        this.lastName = lastName;
    }
    
    public void setFirstName(String firstName)
    {
        this.firstName = firstName;
    }
    
    public void setScore(int score)
    {
        this.score = score;
    }
    
    public String getLastName()
    {
        return lastName;
    }
    
    public String getFirstName()
    {
        return firstName;
    }
    
    public int getScore()
    {
        return score;
    }
    
    @Override
    public String toString()
    {
        return this.getLastName() + ", " + this.getFirstName() + ": " + this.getScore();
    }
    
    @Override
    public int compareTo(Object o)
    {
        Student s = (Student) o;
        return this.toString().compareTo(s.toString());
    }
}
