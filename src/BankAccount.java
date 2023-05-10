public class BankAccount {
    private String ownerName;
    private String accountNumber;
    private double balance;

    public BankAccount(String ownerName, String accountNumber, double initBalance) {
        this.ownerName = ownerName;
        this.accountNumber = accountNumber;
        
        if (initBalance < 50000) {
            System.out.println("Initial balance is less than VND 50.000");
            this.balance = 50000;
        }
        else {
        	this.balance = initBalance;
    }
    }

    public void deposit(double amount) {
    	if (amount > 0) {
    		balance += amount;
    	}
    	else {
    		System.out.println("Invalid amount");
    	}
    }
    
    public void withdraw(double amount) {	
    	if (amount > 0) {
    		balance -= amount + 5000;
    		if (balance < 50000) {
    			System.out.println("Insufficient balance");
    			balance += amount + 5000; 
    		}
    	}
    	else {
    		System.out.println("Invalid amount");
    	}
    }

    public String getOwnerName() {
        return ownerName;
    }

    public String getAccountNumber() {
        return accountNumber;
    }

    public double getBalance() {
        return balance;
    }
}
