// package Java_Object_Orientation.Aggregation;

public class Test {
    public static void main(String[] args) {
        Processor processor=new Processor(3.5);
        {
        Computer pc1 = new Computer();
        pc1.setOS("Windows Ten");
        pc1.setProcessor(processor);
        pc1.print();
        }
        System.out.println("Clock Speed without Aggregation in Test Class: "+processor.getClockSpeed()+" GHZ");
    }
}
