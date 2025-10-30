import java.util.Scanner;

public class MultipleArrayUsage {
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);
        int size = 3;
        int rollNo[] = new int[size];
        int Marks[] = new int[size];
        String stdNames[] = new String[size];

        int counter = 1;
        for (int i = 0; i < size; i++) {
            System.out.println("Record No. " + counter);
            System.out.print("Enter Roll Number: ");
            rollNo[i] = Integer.parseInt(input.nextLine());
            System.out.print("Enter Student Name: ");
            stdNames[i] = input.nextLine();
            System.out.print("Enter Marks: ");
            Marks[i] = Integer.parseInt(input.nextLine());
            counter++;
        }
        System.out.printf("%-10s %-15s %-15s %-10s%n",
                "Record#", "Roll Number", "Name", "Marks");
        for (int i = 0; i < size; i++) {
            System.out.printf("%-10d %-15d %-15s %-10d%n",
                    (i + 1), rollNo[i], stdNames[i], Marks[i]);
        }

    }
}
