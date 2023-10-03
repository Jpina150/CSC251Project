import java.util.Scanner;
import java.util.ArrayList;
import java.io.File;
import java.io.IOException;

public class Project_Jonathan_PinaElacio
{
   public static void main(String[] args) throws IOException
   {
      
      File file = new File("PolicyInformation.txt");
      Scanner inputFile = new Scanner(file);
      
      double age, height, weight;
      String policyNumber, providerName, firstName, lastName, smokerStatus;
      
      ArrayList<Policy> policyList = new ArrayList<Policy>();
      
      while(inputFile.hasNext())
      {
         policyNumber = inputFile.nextLine();
         providerName = inputFile.nextLine();
         firstName = inputFile.nextLine();
         lastName = inputFile.nextLine();
         age = inputFile.nextDouble();
         inputFile.nextLine();
         smokerStatus = inputFile.nextLine();
         height = inputFile.nextDouble();
         weight = inputFile.nextDouble();
         
         if(inputFile.hasNext())
            inputFile.nextLine();
         if(inputFile.hasNext())
            inputFile.nextLine();
            
         policyList.add(new Policy(policyNumber, providerName, firstName, lastName, age, smokerStatus, height, weight));
      }
      
      for(Policy policy : policyList)
      {
         System.out.println("Policy Number: " + policy.getPolicyNumber());
         System.out.println("Provider Name: " + policy.getProviderName());
         System.out.println("Policyholder's First Name: " + policy.getFirstName());
         System.out.println("Policyholder's Last Name: " + policy.getLastName());
         System.out.printf("Policyholder's Age: %.0f%n", policy.getAge());
         System.out.println("Policyholder's Smoking Status: " + policy.getSmokeStatus());
         System.out.printf("Policyholder's Height: %.1f%n", policy.getHeight());
         System.out.printf("Policyholder's Weight: %.1f%n", policy.getWeight());
         System.out.printf("Policyholder's BMI: %.2f%n", policy.getBMI());
         System.out.printf("Policy Price: $%.2f%n", policy.getInsurancePrice());
         System.out.println();
      }

      
      inputFile.close();
   }

}