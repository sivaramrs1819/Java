package ChatGPtATM;

import java.util.Scanner;
import java.util.ArrayList;
import java.util.List;

public class atm2Main {
    public static void main(String[] args) {
        ArrayList<UserInf> Users = new ArrayList<>();
        Scanner User_Input = new Scanner(System.in);
        
        
        // Sample data for demonstration (you can also add users dynamically)
        Users.add(new UserInf("ItzzSivv", 4435, "9876543210", 5000000));  // Add first user
        Users.add(new UserInf("Jane Loskin", 5678, "1234567890", 1000000)); // Add second user
        
        int UserIn = 1;
        
        while (UserIn != 0) {
            printSeparator();
            System.out.println("\n1. Insert Card\n0. Exit");
            UserIn = User_Input.nextInt();
            User_Input.nextLine();
            
            if (UserIn == 1) {
                System.out.println("\nEnter your PIN");
                int UserPIN = User_Input.nextInt();
                UserInf currentUser = getUserByPin(Users, UserPIN);
                
                if (currentUser != null) {
                    System.out.println("\nHii " + currentUser.getUser_Name() + ":)");
                    printSeparator();
                    System.out.println("\n1.Withdrawal\n2.Check Account details\n3.Deposit\n4.Update PIN");
                    int UserIn2 = User_Input.nextInt();
                    diffOptions(currentUser, UserIn2, User_Input);
                } else {
                    System.out.println("\nWrong PIN. Please try again.");
                }
            } else if (UserIn != 0) {
                System.out.println("\nInsert Your card Properly");
            } else {
                System.out.println("\nThank you for banking");
            }
        }
        User_Input.close();
    }

    // Method to search for user by PIN
    public static UserInf getUserByPin(List<UserInf> users, int pin) {
        for (UserInf user : users) {
            if (user.getPIN() == pin) {
                return user;
            }
        }
        return null;  // Return null if no user found with that PIN
    }

    private static void printSeparator() {
        for (int i = 0; i < 50; i++) {
            System.out.print("-");
        }
    }

    private static void diffOptions(UserInf UserObj,int UserIn2,Scanner User_Input){
        switch (UserIn2) {
            case 1:
                Withdraw(UserObj,User_Input);
                break;
            case 2:
                UserObj.ShowUserDetails();
                break;
            case 3:
                Deposit(UserObj, User_Input);
                break;
            case 4:
                UpdatePIN(UserObj, User_Input);
                break;
            default:
                System.out.println("Invalid Input");
                break;
        }
    }

    private static void Withdraw(UserInf currentUser,Scanner User_Input){
        System.out.print("\nEnter amount to withdraw\n$");
        int withdr = User_Input.nextInt();
        currentUser.setAmount2(withdr);
        System.out.println("\nAmount successfully debited from XXXXXXXXXXXX" + currentUser.getAccount_NO().substring(6,10));
        System.out.println("Remaining Balance : "+ "$" + currentUser.getAmount());
    }

    private static void UpdatePIN(UserInf currentUser,Scanner User_Input){
        System.out.println("\nEnter new PIN");
        int newPIN = User_Input.nextInt();
        if (newPIN > 999 && newPIN < 10000) {
            currentUser.setPIN(newPIN);
            System.out.println("\nPIN updated..");
        } else {
            System.out.println("PIN should be exactly 4 digits");
        }
    }

    private static void Deposit(UserInf currentUser,Scanner User_Input){
        System.out.print("\nEnter amount to deposit\n$");
        currentUser.setAmount(User_Input.nextInt());
        System.out.println("\nAmount successfully deposited into XXXXXXXXXXXX" + currentUser.getAccount_NO().substring(6,10));
        System.out.println("Updated Balance : "+ "$" + currentUser.getAmount());
    }
}



