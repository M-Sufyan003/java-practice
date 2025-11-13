public class NormalParcel extends Parcel 
{
    @Override
    public void printRecipiet()
    {
        int overWeightCharges=0;
        int totalOverWeight=0;
        int totalCharges=this.fee;
        if(this.weight>900)
        {
            totalOverWeight=this.weight - 900;
            overWeightCharges= totalOverWeight*this.feePerGram;
            totalCharges=totalCharges+(this.feePerGram*totalOverWeight);
        }
        System.out.println("\n\n Shipment Recipiet");
        System.out.println("-------------------------------");
        System.out.println("Recipiet No.  :"+this.id);
        System.out.println("Sender Name :"+this.senderName);
        System.out.println("Sender Address :"+this.senderAddress);
        System.out.println("Reciever Name  :"+this.recieverName);
        System.out.println("Reciever Address :"+this.recieverAddress);
        System.out.println("Parcel weight :"+this.weight);

        if (totalOverWeight>0) {
            System.out.println("Over Weight :"+totalOverWeight+"g");
        }else{
            System.out.println("Over Weight : No");
        }
        
        System.out.println("Basic Charges :"+this.fee);
        System.out.println("Over Weight Charges :"+overWeightCharges +" per Gram");
        System.out.println("Shipment Total Charges :"+totalCharges);
        System.out.println("Type of Shipment: Normal");
    }
}
