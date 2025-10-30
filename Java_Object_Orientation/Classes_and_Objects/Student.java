public class Student {
    private int rollNumber;
    private String firstName;
    private String lastName;

    public Student(int rollNumber)
    {
        this.rollNumber=rollNumber;
    }
    
    public void setRollNumber(int rollNumber)
    {
        this.rollNumber=rollNumber;
    }
    public int getRollNumber()
    {
        return this.rollNumber;
    }
    public void setFirstName(String firstName)
    {
        this.firstName=firstName;
    }
    public String getFirstName()
    {
        return this.firstName;
    }
    public void setLastName(String lastName)
    {
        this.lastName=lastName;
    }
    public String getLastName()
    {
        return this.lastName;
    }
}
