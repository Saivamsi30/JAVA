package OOPs;

public class ATM {
    private String AccountHolderName;

     private int balance;

    ATM(String AccountHolderName,int balance)
    {
        this.AccountHolderName = AccountHolderName;
        this.balance = balance;
    }

    public static void main(String[] args) {
        ATM atm1 = new ATM("Sai Vamsi",10000);
        atm1.atmDetails();
    }
    void atmDetails()
    {
//        System.out.println("Account Holder Name: " + AccountHolderName);
        System.out.println("Your Current Balance: " + balance);
    }
}
