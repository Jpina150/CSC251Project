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
      
      System.out.println("Policy Number: " + insurance.getPolicyNumber());
      System.out.println("Provider Name: " + insurance.getProviderName());
   }

}