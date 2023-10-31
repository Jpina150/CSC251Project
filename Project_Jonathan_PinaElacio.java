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
      
      int smokeNum = 0;
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
            
         PolicyHolder holder = new PolicyHolder(firstName, lastName, age, smokerStatus, height, weight);
            
         Policy policy = new Policy(policyNumber, providerName, holder);
         
         policyList.add(policy);
         
      
      }
      
      for(Policy policy : policyList)
      {
         System.out.println(policy.toString());
         System.out.println();
         
         //if(policyholder.getSmokeStatus().equalsIgnoreCase("smoker"))
            //smokeNum++;
      }
         System.out.println("There were " + policyList.size() + " objects created.");
        // System.out.println("The number of policies with a smoker is: " + smokeNum);
         //System.out.println("The number of policies with a non-smoker is: " + (policyList.size() - smokeNum));
   }

}