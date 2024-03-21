package ATM;


/**
 *
 * @author "Mayibongwe Ngwenya
 */
public class Transactions {
    private int accountNumber = 123456789;
    private String transactionType;
    private double amount;
    static double bankBalance = 15000;
    static Accounts acc;

    public double getBankBalance() {
        return bankBalance;
    }

    public void setBankBalance(double bankBalance) {
        this.bankBalance = bankBalance;
    }

    public Transactions()
    {
    }
    
    
    /**
     * This is for updating the bank balance after every transaction
     * 
     * @param acc
     * @param transType
     * @param amount 
     */
    void withdrawal(int acc, String transType, double amount)   {
        accountNumber = acc;
        transactionType = transType;
        this.amount = amount;
        
        bankBalance = bankBalance - this.amount;
        Accounts account = new Accounts();
        account.setBankBalance(bankBalance);
        setBankBalance(bankBalance);
    }
    
    void deposit(int acc, String transType, double amount)  {
        accountNumber = acc;
        transactionType = transType;
        this.amount = amount;
        
        bankBalance = bankBalance + amount;
        Accounts account = new Accounts();
        account.setBankBalance(bankBalance);
        setBankBalance(bankBalance);
    }
}
