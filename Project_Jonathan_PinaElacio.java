import java.io.*;
import java.util.Scanner;

public class Project_Jonathan_PinaElacio
{
   public static void main(String[] args) throws IOException
   {
      
      File file = new File("PolicyInformation.txt");
      Policy insurance = new Policy();
      
      Scanner inputFile = new Scanner(file);
      
      double[] policyNumber, age, height, weight, BMI;
      long[] providerName, firstName, lastName, smokeStatus;
      
      
      
      while(inputFile.hasNext())
      {
         
      }
      
      inputFile.close();
   }

}