// package Java_Object_Orientation.Aggregation;

public class Processor {
    private double clockSpeed;

    public Processor(){
        clockSpeed=2.5;
    }

    public Processor(double clockSpeed){
        this.clockSpeed=clockSpeed;
    }

    public double getClockSpeed(){
        return clockSpeed;
    }

    public void setClockSpeed(double clockSpeed){
        this.clockSpeed=clockSpeed;
    }
}
