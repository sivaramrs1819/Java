import java.util.Scanner;
public class Hellow {
    public static void main(String[] args) {
        Scanner ob = new Scanner(System.in);

        System.out.print("Enter ur name : ");
        String a = ob.nextLine();

        System.out.print("Enter ur ID : ");
        int b = ob.nextInt();
        
        System.out.println("User_Handle : "+a);
        System.out.println("ID : " + b);
    }
}
