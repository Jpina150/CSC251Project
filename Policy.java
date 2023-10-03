public class Policy
{
   //Fields
   private double age, height, weight;
   private String policyNumber, providerName, firstName, lastName, smokeStatus;
   
   //No Arg constructor
   public Policy()
      {
         age = 1;
         height = 1;
         weight = 1;
      }
   
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
   public Policy(String pNumberGiven, String pNameGiven, String firstNameGiven, String lastNameGiven, double ageGiven, String smokeStatusGiven, double heightGiven, double weightGiven)
      {
         policyNumber = pNumberGiven;
         providerName = pNameGiven;
         firstName = firstNameGiven;
         lastName = lastNameGiven;
         age = ageGiven; 
         smokeStatus = smokeStatusGiven;
         height = heightGiven;
         weight = weightGiven;
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
   
   /**
      sets the policyholder's first name
         @param firstNameGiven The policyholder's first name
   */
   public void setFirstName(String firstNameGiven)
      {
         firstName = firstNameGiven;
      }
   
   /**
      sets the policyholder's last name
         @param lastNameGiven The policyholder's last name
   */
   public void setLastName(String lastNameGiven)
      {
         lastName = lastNameGiven;
      }
   
   /**
      sets the policyholder's age
         @param ageGiven The policyholder's age
   */
   public void setAge(double ageGiven)
      {
         age = ageGiven;
      }
   
   /**
      sets the policyholder's smoking status
         @param smokeStatusGiven the policyholder's smoker status
   */
   public void setSmokeStatus(String smokeStatusGiven)
      {
         smokeStatus = smokeStatusGiven;
      }
   
   /**
      Sets the policyholder's height
         @param heightGiven The policyholder's height
   */   
   public void setHeight(double heightGiven)
      {
         height = heightGiven;
      }
      
   /**
      sets the policyholder's weight
         @param weightGiven The policyholder's weight
   */
   public void setWeight(double weightGiven)
      {
         weight = weightGiven;
      }
   
   /**
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
   
   /** 
      the getFirstName method returns the policyholder's first name
         @return the policyholder's first name
   */   
   public String getFirstName()
      {
         return firstName;
      }
      
   /** 
      The getLastName method returns the policyholder's last name
         @return the policyholder's last name
   */
   public String getLastName()
      {
         return lastName;
      }
   
   /**
      The getAge method returns the policyholder's age
         @return the policyholder's age
   */
   public double getAge()
      {
         return age;
      }
   
   /** 
      The getSmokeStatus method returns the policyholder's smoker status
         @return The policyholder's smoker status
   */   
   public String getSmokeStatus()
      {
         return smokeStatus;
      }
      
   /** 
      The getHeight method returns the policyholder's height
         @return The policyholder's height
   */
   public double getHeight()
      {
         return height;
      }
   
   /**
      The getWeight method returns the policyholder's weight
         @return The policyholder's weight
   */ 
   public double getWeight()
      {
         return weight;
      }
   /** 
      The getBMI method calculates and returns the policyholder's BMI
         @return the policyholders BMI
   */
   public double getBMI()
      {
         double BMI = (weight * 703)/ (height * height);
      
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
      
      if(age > 50)
         {
            ageFee = 75;
         }
      else
         {
            ageFee = 0;
         }
      
      if(smokeStatus.equals("Smoker") || smokeStatus.equals("smoker"))
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

}