import java.util.Scanner;

public class CargoSystem {
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);

        int serviceChoice = 0, receiptnum = 0, weight = 0, charges = 0, overFee = 0;
        String sname = "", saddress = "", rname = "", raddress = "";

        while (true) {
            System.out.println("Enter 1 for Normal and 2 for Urgent Services!!!");
            serviceChoice = Integer.parseInt(input.nextLine());
            System.out.println("Selected Type of Service : " + serviceChoice);

            if (serviceChoice == 1 || serviceChoice == 2) {
                System.out.println("Enter Receipt No.: ");
                receiptnum = Integer.parseInt(input.nextLine());

                System.out.println("Enter Sender Name: ");
                sname = input.nextLine();

                System.out.println("Enter Sender Address: ");
                saddress = input.nextLine();

                System.out.println("Enter Receiver Name: ");
                rname = input.nextLine();

                System.out.println("Enter Receiver Address: ");
                raddress = input.nextLine();

                System.out.println("Enter Weight in Grams of Parcel: ");
                weight = Integer.parseInt(input.nextLine());

                System.out.println("Basic Charges of Parcel: ");
                charges = Integer.parseInt(input.nextLine());

                System.out.println("Fee per Gram (Overweight): ");
                overFee = Integer.parseInt(input.nextLine());

                
                if (serviceChoice == 2) {
                    System.out.println("Enter Additional Fee per Gram: ");
                    int additionalFee = Integer.parseInt(input.nextLine());

                    UrgentParcel up = new UrgentParcel();
                    up.setParcelID(receiptnum);
                    up.setAdditionalFeePerGram(additionalFee);
                    up.setSenderName(sname);
                    up.setSenderAddress(saddress);
                    up.setRecieverName(rname);
                    up.setRecieverAddress(raddress);
                    up.setWeight(weight);
                    up.setFee(charges);
                    up.setFeePerGram(overFee);
                    up.printRecipiet();
                } else {
                    NormalParcel np = new NormalParcel();
                    np.setParcelID(receiptnum);
                    np.setSenderName(sname);
                    np.setSenderAddress(saddress);
                    np.setRecieverName(rname);
                    np.setRecieverAddress(raddress);
                    np.setWeight(weight);
                    np.setFee(charges);
                    np.setFeePerGram(overFee);
                    np.printRecipiet();
                }

                // break; 
            } else {
                System.out.println("Selected Type of Service is Incorrect");
            }
        }

        // input.close();
    }
}
