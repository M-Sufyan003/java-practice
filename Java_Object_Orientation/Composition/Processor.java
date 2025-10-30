// package Java_Object_Orientation.Composition;

public class Processor {
    private double clockSpeed;
    private ArithmaticAndLogicUnit alu;
    private ControlUnit cu;
    private MemoryUnit mu;

    public Processor()
    {
        clockSpeed=2.5;
        alu=new ArithmaticAndLogicUnit();
        cu= new ControlUnit();
        mu=new MemoryUnit();
    }
    
    public Processor(double clockSpeed)
    {
        this.clockSpeed=clockSpeed;
        alu=new ArithmaticAndLogicUnit();
        cu= new ControlUnit();
        mu=new MemoryUnit();
    }

    double getClockSpeed()
    {
        return clockSpeed;
    }
    
    void setClockSpeed(double clockSpeed)
    {
        this.clockSpeed=clockSpeed;
    }

    void printSpec()
    {
        System.out.println("Processor Specifications:");
        System.out.println("--------------------------");
        System.out.println("Clock Speed: " + clockSpeed + " GHz");
        alu.printUnitName();
        cu.printUnitName();
        mu.printUnitName();
    }
}
