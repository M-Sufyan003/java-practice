// package Java_Object_Orientation.Aggregation;

public class Computer {
    private Processor p1;
    private String OS;

    Computer(){

    }

    public void setOS(String OS){
        this.OS=OS;
    }

    public String getOS(){
        return this.OS;
    }

    Processor getProcessor()
    {
        return this.p1;
    }

    void setProcessor(Processor processor)
    {
        this.p1 = new Processor();
        this.p1.setClockSpeed(2.5);
    }

    void print()
    {
        System.out.println("Operating System: "+OS);
        System.out.println("Clock Speed with Aggregation in Computer Class: "+p1.getClockSpeed()+" GHZ");
    }
}
