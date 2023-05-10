
public class SavingAccount extends BankAccount {
    private double interestRate;

    public SavingAccount(String ownerName, String accountNumber, double balance, double interestRate) {
        super(ownerName, accountNumber, balance);
        this.interestRate = interestRate;
    }
    
    public double getInterestRate() {
        return interestRate;
    }
    
    public double calculateMonthlyInterest() {
        return getBalance() * interestRate / 12;
    }
    
    public void withdraw(double amount) {
    	System.out.println("Cannot withdraw from a saving account");
    }
}
