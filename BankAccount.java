class BankAccount1 {
    private double balance;
    public void deposit(double amount) {
        if(amount > 0) {
            balance = balance + amount;
        }
    }
    public void withdraw(double amount) {
        if(amount > 0 && amount <= balance) {
            balance = balance - amount;
        }
        else{
            System.out.println("Insufficient balance");
        }
    }
    public double getBalance() {
        return balance;
    }
}

public class BankAccount {
    public static void main(String[] args){
        BankAccount1 account = new BankAccount1();
        account.deposit(1000);
        System.out.println("Balance: " + account.getBalance());
        account.withdraw(500);
        System.out.println("Balance: " + account.getBalance());
        account.withdraw(600);
        System.out.println("Balance: " + account.getBalance());
    }
}