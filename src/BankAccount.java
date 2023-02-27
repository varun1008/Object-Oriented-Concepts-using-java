public class BankAccount {
    private int accountNumber;
    private double accountBalance;
    private String customerName;
    private String email;
    private long phoneNumber;

    public int getAccountNumber(){
        return accountNumber;
    }

    public double getAccountBalance() {
        return accountBalance;
    }

    public String getCustomerName() {
        return customerName;
    }

    public String getEmail() {
        return email;
    }

    public long getPhoneNumber() {
        return phoneNumber;
    }

    public void setAccountNumber(int accountNumber){
        this.accountNumber = accountNumber;
    }

    public void setAccountBalance(double accountBalance) {
        this.accountBalance = accountBalance;
    }

    public void setCustomerName(String customerName) {
        this.customerName = customerName;
    }

    public void setEmail(String email) {
        this.email = email;
    }

    public void setPhoneNumber(long phoneNumber) {
        this.phoneNumber = phoneNumber;
    }

    public void depositFunds(double amount){
        accountBalance += amount;
        System.out.println("Amount deposited successfully");
        System.out.println("Account balance : "+ accountBalance);
    }

    public void withdrawFunds(double amount){
        if (amount <= accountBalance){
            accountBalance -= amount;
            System.out.println("Amount withdraw successfully");
            System.out.println("Account balance : "+ accountBalance);
        }else {
            System.out.println("Insufficeint balance");
        }
    }
}
