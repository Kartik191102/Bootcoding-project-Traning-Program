// Online Java Compiler
// Use this editor to write, compile and run your Java code online
import java.util.Scanner;
public class Input {
    public static void main(String[] args) {
        Scanner myObj=new Scanner(System.in);
        System.out.println("Enter username");
        String userName =myObj.nextLine();
        System.out.println("UserName is:"+userName);
        
        System.out.println("Enter Age");
        int age=myObj.nextInt();
        System.out.println("Age is :"+age);
        
    }
}
