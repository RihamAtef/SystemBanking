public class BankingSystem {
    public static void main(String[] args) {
        System.out.println("Hello world!");
        Bank bank= new Bank();
        Accounts account1= new Accounts(1153218);
        Accounts account2= new Accounts(41097);
        bank.addAccount(account1);
        bank.addAccount(account2);
        account1.deposit(25000.36);
        account1.withdraw(26000.45);
        account2.deposit(700);
        account2.withdraw(300);
        System.out.println("Account 1 Balance: "+account1.getBalance());
        System.out.println("Account 1 Transactions: " + account1.getTransactionHistory());

        System.out.println("Account 2 Balance: "+account2.getBalance());
        System.out.println("Account 2 Transactions: " + account2.getTransactionHistory());
    }
}