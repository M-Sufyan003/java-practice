// package Java_Object_Orientation.Inheritance;

public class ContractualEmployee extends Employee{
    private int contractDuration;

    public int getContractDuration()
    {
        return contractDuration;
    }
    public void setContractDuration(int contractDuration)
    {
        this.contractDuration=contractDuration;
    }
    public float calculateSalary()
    {
        System.out.println("Calculating Contractual Employee's Salary: ");
        return salary;
    }
}
