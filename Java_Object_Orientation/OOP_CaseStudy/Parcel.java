public abstract class Parcel
{
    protected int id;
    protected String senderName;
    protected String senderAddress;
    protected String recieverName;
    protected String recieverAddress;
    protected int weight;
    protected int fee;
    protected int feePerGram;

    public Parcel()
    {
        id=0;
        senderAddress="";
        senderName="";
        recieverName="";
        recieverAddress="";
        weight=0;
        fee=0;
        feePerGram=0;
    }

    public void setSenderName(String senderName)
    {
        this.senderName=senderName;
    }
    public String getSenderName()
    {
        return senderName;
    }

    public void setRecieverName(String recieverName)
    {
        this.recieverName=recieverName;
    }
    public String getRecieverName()
    {
        return recieverName;
    }

    public void setSenderAddress(String senderAddress)
    {
        this.senderAddress=senderAddress;
    }
    public String getSenderAddress()
    {
        return senderAddress;
    }

    public void setRecieverAddress(String recieverAddress)
    {
        this.recieverAddress=recieverAddress;
    }
    public String getRecieverAddress()
    {
        return recieverAddress;
    }

    public void setParcelID(int id)
    {
        this.id=id;
    }
    public int getParcelID()
    {
        return id;
    }

    public void setFeePerGram(int feePerGram)
    {
        this.feePerGram=feePerGram;
    }
    public int getFeePerGram()
    {
        return feePerGram;
    }

    public void setFee(int fee)
    {
        this.fee=fee;
    }
    public int getFee()
    {
        return fee;
    }

    public void setWeight(int weight)
    {
        this.weight=weight;
    }
    public int getWeight()
    {
        return weight;
    }

    public abstract void printRecipiet();
}