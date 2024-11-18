
import java.util.Scanner;

public class Dem 
 {
 public static void main(String[] args) {
     try (Scanner scanner = new Scanner(System.in)) {
         int a,b,c ;
         System.out.println("Enter First Number ");
         a=scanner.nextInt();
         System.out.println("Enter Second Number ");
         b=scanner.nextInt();
         c=a+b;
         System.out.println("Sum = "+c);
         
     }
   
 }  
}
