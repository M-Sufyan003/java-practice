import java.util.Scanner;

public class ArrayTutorial
{
    public static void main(String[] args) {
        Scanner inputs = new Scanner(System.in);

        int myarray[] = new int[5];
        int counter=0;
        for(int i =0;i<myarray.length;i++)
        {
            
            System.out.println("Enter integer value for Index: "+counter);
            myarray[i]=inputs.nextInt();
            counter++;
        }

        int resultantValue;
        int valueIndex=-1;

        System.out.println("Enter value for searching it's Loaction: ");
        resultantValue=inputs.nextInt();
        
        for(int i=0;i<myarray.length;i++)
        {
            if(myarray[i]==resultantValue)
            {
                valueIndex= i;
            }
        }

        if (valueIndex > -1) {
            System.out.println("Your Desired value is found at index: "+valueIndex);
        }
        else{
            System.out.println("Typed value not found at any index!!");
        }
    }
}