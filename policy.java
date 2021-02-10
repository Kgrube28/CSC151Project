import java.util.Scanner;
import java.io.*;

public class policy
   {
   
      public static void main(String[] args)
      
      {
         int policyNum, age;
         String firstName, lastName, ProviderName, smoker;
         double height, weight;
         
         Scanner keyboard = new Scanner(System.in);
         
         System.out.println("Please enter the Policy Number: ");
         policyNum = keyboard.nextInt();
         
         System.out.println("Please enter the Provider Name: ");
         ProviderName = keyboard.nextLine();
         
         System.out.println("Please enter the Policyholder’s First Name: ");
         firstName = keyboard.nextLine();
         
         System.out.println("Please enter the Policyholder’s Last Name: ");
         lastName = keyboard.nextLine();
         
         System.out.println("Please enter the Policyholder’s Age: ");
         age = keyboard.nextInt();
         
         System.out.println("Please enter the Policyholder’s Smoking Status (smoker/non-smoker): ");
         smoker = keyboard.nextLine();
         
         System.out.println("Please enter the Policyholder’s Height (in inches): ");
         height = keyboard.nextDouble();
         
         System.out.println("Please enter the Policyholder’s Weight (in pounds): ");
         weight = keyboard.nextDouble();
         
         double BMI = (weight * 703) / (height)*2;
         double extraFee=0;
         double baseFee = 600;
         
          
         if(age > 50)
         {
         baseFee += 75;
         }
        
         if(BMI > 35)
         {
         extraFee = ( BMI - 35 ) * 20;
         }
        
         double totalFee = BMI + extraFee;
        
        
        System.out.print("Policy Number: " + policyNum);
        System.out.print("\nProvider Name: " + ProviderName);
        System.out.print("\nPolicyholder’s First Name: " + firstName);
        System.out.print("\nPolicyholder’s Last Name: " + lastName);
        System.out.print("\nPolicyholder’s Age: " + age);
        System.out.print("\nPolicyholder’s Smoking Status: " + smoker);
        System.out.print("\nPolicyholder’s Height: " + height);
        System.out.print("\nPolicyholder’s Weight: " + weight);
        System.out.print("\nPolicyholder’s BMI: " + BMI);
        System.out.printf("\nPolicy Price: $%,.2f \n" , totalFee);
        
        }
        
        
        }
        
     
        
        
                
         

