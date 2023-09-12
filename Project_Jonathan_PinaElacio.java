import java.util.Scanner;

public class Project_Jonathan_PinaElacio
{
   public static void main(String[] args)
   {
      Policy insurance = new Policy();
      Scanner Keyboard = new Scanner(System.in);
      
      System.out.println("Please enter the policy number: ");
      double policyNumber = Keyboard.nextDouble();
      insurance.setPolicyNumber(policyNumber);
      
      Keyboard.nextLine();
      
      System.out.println("Please enter the the Provider Name");
      String providerName = Keyboard.nextLine();
      insurance.setProviderName(providerName);
      
      System.out.println("Please enter the Policyholder's First Name: ");
      String firstName = Keyboard.nextLine();
      insurance.setFirstName(firstName);
      
      System.out.println("Please enter the Policyholder's Last Name: ");
      String lastName = Keyboard.nextLine();
      insurance.setLastName(lastName);
      
      System.out.println("Please enter the Policyholder's Age :");
      double age = Keyboard.nextDouble();
      insurance.setAge(age);
      
      Keyboard.nextLine();
      
      System.out.println("Please enter the Policyholder's Smoking Status (Smoker/Non-smoker): ");
      String smokeStatus = Keyboard.nextLine();
      insurance.setSmokeStatus(smokeStatus);
      
      System.out.println("Please enter the Policyholder's Height (in inches): ");
      double height = Keyboard.nextDouble();
      insurance.setHeight(height);
      
      System.out.println("Please enter the Policyholder's Weight (in pounds): ");
      double weight = Keyboard.nextDouble();
      insurance.setWeight(weight);
      
      double BMI = insurance.getBMI();
      
      System.out.printf("Policy Number: %.0f%n", insurance.getPolicyNumber());
      System.out.println("Provider Name: " + insurance.getProviderName());
      System.out.println("Policyholder's First Name: " + insurance.getFirstName());
      System.out.println("Policyholder's Last Name: " + insurance.getLastName());
      System.out.printf("Policyholder's Age: %.0f%n", insurance.getAge());
      System.out.println("Policyholder's Smoking Status: " + insurance.getSmokeStatus());
      System.out.printf("Policyholder's Height: %.1f%n", insurance.getHeight());
      System.out.printf("Policyholder's Weight: %.1f%n", insurance.getWeight());
      System.out.printf("Policyholder's BMI: %.2f%n", BMI);
      System.out.printf("Policy Price: $%.2f%n", insurance.getInsurancePrice(BMI));
   }

}