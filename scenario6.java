package scenario.pkg6;
import java.util.Scanner;

public class Scenario6 {

   
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        
        System.out.println("Enter your 1st number");
        int a = sc.nextInt();
        System.out.println("Enter your 2nd number");
        int b = sc.nextInt();
        
        int c;
           c = a-b;
           
           if(a>=b) {
                   System.out.println("The 1st number and 2nd number are the same");
           }
          
           else{         System.out.println("The 1st number and 2nd number are not the same");
           }

    }
}
