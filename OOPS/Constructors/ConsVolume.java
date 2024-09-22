package Sep9;
import java.util.Scanner;
public class ConsVolume {
    int a,b,c,d,e;

    ConsVolume(int a1,int b1,int c1,int d1,int e1){
        a = a1;
        b = b1;
        c = c1;
        d = d1;
        e = e1;
    }

    int totalMarks(){
        int[] marks = {a,b,c,d,e};

        int total = 0;

        for (int i = 0; i < marks.length; i++) {
            total += marks[i];
        }
        return total;
    }

    public static void main(String[] args) {
            try (Scanner User_Inp = new Scanner(System.in)) {
                ConsVolume Student1 = new ConsVolume(98, 90, 92, 96, 98);
                ConsVolume Student2 = new ConsVolume(75, 92, 92, 66, 88);
                ConsVolume Student3 = new ConsVolume(95, 94, 82, 96, 98);

                System.out.println("Enter Your Name : ");

                String Name = User_Inp.nextLine();

                if ("Sanji".equals(Name)) {
                    System.out.println("Total Marks of Student " + Name + Student1.totalMarks());
                } else if("Robin".equals(Name)) {
                    System.out.println("Total Marks of Student " + Name + Student2.totalMarks());
                }else if("Nami".equals(Name)){
                    System.out.println("Total Marks of Student " + Name + Student3.totalMarks());
            }
        }
    }
}