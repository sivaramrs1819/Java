package construc;

import java.util.Scanner;
public class exercise1 {
    int name;
    int age;
    public static void main(String[] args) {
        try (Scanner obj1 = new Scanner(System.in)) {
            exercise1 obj2 = new exercise1();

            System.out.println("Enter ur name : ");
            obj2.name = obj1.nextInt();

            System.out.println("Enter ur Age : ");
            obj2.age = obj1.nextInt();

            System.out.println("User ID : " + obj2.name);
            System.out.println("Age : " + obj2.age);
        }
    }
}
