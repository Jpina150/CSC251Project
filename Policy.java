public class Policy
{
   //Fields
   
   private String policyNumber, providerName;
   private PolicyHolder policyholder;
   
   /**
      Constuctor that accepts arguemnts
         @param pNumnerGiven The policy Number
         @param pNameGiven The policy provider name
         @param firstNameGiven The policyholder's first name
         @param lastNameGiven The policyholder's last name
         @param ageGiven The policyholder's age
         @param smokeStatusGiven The policyholder's smoking status
         @param heightGiven The policyholder's height
         @param Weight The policyholder's weight
   */
   public Policy(String pNumberGiven, String pNameGiven, PolicyHolder holder)
      {
         policyNumber = pNumberGiven;
         providerName = pNameGiven;
         policyholder = new PolicyHolder(holder);
   } 

   /**
   set the policyholder's policy number
         @param pNumberGiven The holder's policy number
   */
      
   public void setPolicyNumber(String pNumberGiven)
      {
         policyNumber = pNumberGiven;
      }
   
   /** 
      sets the policyholder's policy provider name
         @param pNameGiven the policy holder's name
   */   
   public void setProviderName(String pNameGiven)
      {
         providerName = pNameGiven;
      }
   
   /* 
      @param holder - a PolicyHolder object
   */
   
   public void setPolicyHolder(PolicyHolder holder)
      {
         policyholder = new PolicyHolder(holder);
      }
   
   /*
         The getPolicyNumber method returns the policy number
         @return The policy number
   */    
   public String getPolicyNumber()
      {
         return policyNumber;
      }
  
  /**
      The getProviderName method returns the policy provider's name
         @return the policy provider's name
   */
   public String getProviderName()
      {
         return providerName;
      }
      
   public PolicyHolder getPolicyHolder()
      {
         return new PolicyHolder(policyholder);
      }
   
    /** 
      The getBMI method calculates and returns the policyholder's BMI
         @return the policyholders BMI
   */
   public double getBMI()
      {
         double BMI = (policyholder.getWeight() * 703)/ (policyholder.getHeight() * policyholder.getHeight());
      
         return BMI; 
      }
   /** 
      The getInsurancePrice caculates and returns the insurance price
         @param BMI The policyholder's BMI
         @return the insurance price
   */
   public double getInsurancePrice()
   {
      double basePrice = 600;
      double ageFee, smokeFee, bmiFee, insurancePrice;
      
      if(policyholder.getAge() > 50)
         {
            ageFee = 75;
         }
      else
         {
            ageFee = 0;
         }
      
      if(policyholder.getSmokeStatus().equals("Smoker") || policyholder.getSmokeStatus().equals("smoker"))
         {
            smokeFee = 100;
         }
      else
         {
            smokeFee = 0;
         }
      
      if(getBMI() > 35)
         {
            bmiFee = (getBMI() - 35) * 20;
         }
      else
         {
            bmiFee = 0;
         }
         
      insurancePrice = basePrice + ageFee + smokeFee + bmiFee;
      
      return insurancePrice;
   }
   
   public String toString()
   {
      return String.format("Policy Number: " + policyNumber +
             "\nProviderName: " + providerName +
             "\n" + policyholder.toString() + 
             "\nPolicyHolder's BMI: " + getBMI() +
             "\nPolicyholder's price: $" + getInsurancePrice());
   }

}