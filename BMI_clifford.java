
package clifford;

import java.util.Scanner;

public class BMI_clifford {
    public static void main (String [] args){
        
       Scanner sc = new Scanner(System.in);
        System.out.print("Enter your weight in kilogram: ");
        double weight = sc.nextDouble();
        System.out.print("Enter you height in centimeter: ");
        double height = sc.nextDouble();
        
        double BMI = weight/(height*height);
        System.out.println("your BMI is: " +BMI );
    }
}
