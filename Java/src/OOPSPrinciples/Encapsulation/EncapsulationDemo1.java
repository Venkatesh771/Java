package OOPSPrinciples.Encapsulation;

public class EncapsulationDemo1 {
    private String AccountName = "Venkatesh";

    //Get Method.
    public String getAccountName(){
        return AccountName;
    }

    //Set Method.
    public void setAccountName(String Name){
        this.AccountName = Name;
    }
}
