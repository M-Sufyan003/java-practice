public class UrgentParcel extends Parcel {
    protected int additionalFeePerGram;
    
    public void setAdditionalFeePerGram(int additionalFeePerGram)
    {
        this.additionalFeePerGram=additionalFeePerGram;
    }
    public int getAdditionalFeePerGram()
    {
        return additionalFeePerGram;
    }

    @Override
    public void printRecipiet()
    {
        int overWeightCharges=0;
        float totalCharges=0;
        int totalOverWeight=0;
        float basicCharges=this.fee;
        basicCharges=(basicCharges+(basicCharges*0.5f));
        
        if(this.weight>900)
        {
            totalOverWeight=this.weight - 900;
            overWeightCharges= totalOverWeight*this.feePerGram;
            // totalCharges=(basicCharges+(overWeightCharges+additionalFeePerGram)*totalOverWeight);
            totalCharges = basicCharges + totalOverWeight * (feePerGram + additionalFeePerGram);

        }
         System.out.println("\n\n Shipment Recipiet");
        System.out.println("-------------------------------");
        System.out.println("Recipiet No.  :"+this.id);
        System.out.println("Sender Name :"+this.senderName);
        System.out.println("Sender Address :"+this.senderAddress);
        System.out.println("Reciever Name  :"+this.recieverName);
        System.out.println("Reciever Address :"+this.recieverAddress);

        System.out.println("Parcel weight :"+this.weight);
        System.out.println("Over Weight :"+totalOverWeight);
        System.out.println("Basic Charges :"+this.fee);
        System.out.println("Over Weight Charges :"+overWeightCharges +" per Gram");
        System.out.println("Parcel Shipment Charges :"+totalCharges);
    }
}
