package ChatGPtATM;

public class UserInf {
    private String userName;
    private int pin;
    private String accountNo;
    private int amount;

    
    public UserInf(String userName, int pin, String accountNo, int amount) {
        this.userName = userName;
        this.pin = pin;
        this.accountNo = accountNo;
        this.amount = amount;
    }


    // Getter for PIN
    public int getPIN() {
        return pin;
    }

    // Getter for user name
    public String getUser_Name() {
        return userName;
    }

    // Getter for account number
    public String getAccount_NO() {
        return accountNo;
    }

    // Getter for amount
    public int getAmount() {
        return amount;
    }

    // Method to deposit amount
    public void setAmount(int deposit) {
        this.amount += deposit;
    }

    // Method to withdraw amount
    public void setAmount2(int withdraw) {
        if (withdraw <= amount) {
            this.amount -= withdraw;
        } else {
            System.out.println("Insufficient balance!");
        }
    }

    // Method to update PIN
    public void setPIN(int newPin) {
        this.pin = newPin;
    }

    // Method to show user details
    public void ShowUserDetails() {
        System.out.println("Account Holder: " + userName);
        System.out.println("Account Number: XXXXXXXXXXXX" + accountNo);
        System.out.println("Balance: $" + amount);
    }
}


