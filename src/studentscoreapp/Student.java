/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */

package studentscoreapp;

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
