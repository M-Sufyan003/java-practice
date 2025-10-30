import java.util.Scanner;

public class TaxCalculation {
    public static void main(String[] args) {
        Scanner inputs = new Scanner(System.in);
        double annualIncome;
        System.out.println("Enter Your Annual Income to Know Your FBR Tax:");
        annualIncome = inputs.nextDouble();

        double totalTax = 0;

        if (annualIncome <= 600000) {
            totalTax = 0;
        } 
        else if (annualIncome > 600000 && annualIncome <= 1200000) {
            totalTax = (annualIncome - 600000) * 0.05;
        } 
        else if (annualIncome > 1200000 && annualIncome <= 1800000) {
            totalTax = 30000 + (annualIncome - 1200000) * 0.10;
        } 
        else if (annualIncome > 1800000 && annualIncome <= 2500000) {
            totalTax = 90000 + (annualIncome - 1800000) * 0.15;
        } 
        else if (annualIncome > 2500000 && annualIncome <= 3500000) {
            totalTax = 195000 + (annualIncome - 2500000) * 0.175;
        } 
        else if (annualIncome > 3500000 && annualIncome <= 5000000) {
            totalTax = 370000 + (annualIncome - 3500000) * 0.20;
        } 
        else if (annualIncome > 5000000 && annualIncome <= 8000000) {
            totalTax = 670000 + (annualIncome - 5000000) * 0.225;
        } 
        else if (annualIncome > 8000000 && annualIncome <= 12000000) {
            totalTax = 1345000 + (annualIncome - 8000000) * 0.25;
        } 
        else if (annualIncome > 12000000 && annualIncome <= 30000000) {
            totalTax = 2345000 + (annualIncome - 12000000) * 0.275;
        } 
        else if (annualIncome > 30000000 && annualIncome <= 50000000) {
            totalTax = 7295000 + (annualIncome - 30000000) * 0.30;
        } 
        else if (annualIncome > 50000000 && annualIncome <= 75000000) {
            totalTax = 13295000 + (annualIncome - 50000000) * 0.325;
        } 
        else if (annualIncome > 75000000) {
            totalTax = 21420000 + (annualIncome - 75000000) * 0.35;
        }

        System.out.printf("Your Payable Annual FBR Tax is: Rs %, .0f%n", totalTax);

    }
}
