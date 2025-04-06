import java.util.*;

public class input_java {
    public static void main(String args[]) { 
        Scanner sc = new Scanner(System.in); 
        System.out.print("Enter value of a : ");
        int a = sc.nextInt(); 
        System.out.print("Enter value of b : ");
        int b = sc.nextInt(); 
        System.out.print("Enter character : ");
        char operator = sc.next().charAt(0);
        System.out.println(a);
        System.out.println(b);
        System.out.println(operator);
    }
    
}