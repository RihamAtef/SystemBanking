import java.util.ArrayList;
import java.util.List;

public class Accounts
{
   // Represents a bank account
    private int accountNum;
    private float Balance;
    private List<String> transactionHistory;




// constructor
    public Accounts( int accountNum) {

        this.accountNum = accountNum;
       this. Balance =0;
        this.transactionHistory = new ArrayList<>();
    }
    // getters
    public int getAccountNum() {
        return accountNum;
    }

    public float getBalance() {
        return Balance;
    }

    public List<String> getTransactionHistory() {
        return transactionHistory;
    }




  public void deposit(double amount)
  {
      Balance+=amount;
      transactionHistory.add("deposit +:"+ amount);
  }
  public void withdraw(double amount) {
      if (Balance >= amount) {
          Balance -= amount;
          transactionHistory.add("withdraw-:" + amount);
      } else {
          System.out.println("insufficient amount is found");

      }


  }}
