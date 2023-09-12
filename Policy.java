public class Policy
{
   //Fields
   private double policyNumber, age, height, weight;
   private String providerName, firstName, lastName, smokeStatus;
   
   //No Arg constructor
   public Policy()
      {
         policyNumber = 0;
         age = 1;
         height = 1;
         weight = 1;
      }
   
   /**Constuctor that accepts arguemnts
      @param pNumnerGiven The policy Number
      @param pNameGiven The policy provider name
      @param firstNameGiven The policyholder's first name
      @param lastNameGiven The policyholder's last name
      @param ageGiven The policyholder's age
      @param smokeStatusGiven The policyholder's smoking status
      @param heightGiven The policyholder's height
      @param Weight The policyholder's weight
   */
   public Policy(double pNumberGiven, String pNameGiven, String firstNameGiven, String lastNameGiven, double ageGiven, String smokeStatusGiven, double heightGiven, double weightGiven)
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

   //set the policyholder's policy number
   public void setPolicyNumber(double pNumberGiven)
      {
         policyNumber = pNumberGiven;
      }
   
   //sets the policyholder's policy provider name
   public void setProviderName(String pNameGiven)
      {
         providerName = pNameGiven;
      }
   
   //sets the policyholder's first name
   public void setFirstName(String firstNameGiven)
      {
         firstName = firstNameGiven;
      }
   
   //sets the policyholder's last name
   public void setLastName(String lastNameGiven)
      {
         lastName = lastNameGiven;
      }
   
   //sets the policyholder's age
   public void setAge(double ageGiven)
      {
         age = ageGiven;
      }
   
   //sets the policyholder's smoking status
   public void setSmokeStatus(String smokeStatusGiven)
      {
         smokeStatus = smokeStatusGiven;
      }
   
   //Sets the policyholder's height
   public void setHeight(double heightGiven)
      {
         height = heightGiven;
      }
      
   //sets the policyholder's weight
   public void setWeight(double weightGiven)
      {
         weight = weightGiven;
      }
   
   //getPolicyNumber @return The policy number
   public double getPolicyNumber()
      {
         return policyNumber;
      }
  
  // 
   public String getProviderName()
      {
         return providerName;
      }
   
   //   
   public String getFirstName()
      {
         return firstName;
      }
      
   //
   public String getLastName()
      {
         return lastName;
      }
   
   //
   public double getAge()
      {
         return age;
      }
   
   //   
   public String getSmokeStatus()
      {
         return smokeStatus;
      }
      
   //
   public double getHeight()
      {
         return height;
      }
   
   //
   public double getWeight()
      {
         return weight;
      }
   
   public double getBMI()
      {
         double BMI = (weight * 703)/ (height * height);
      
         return BMI; 
      }
   
   public double getInsurancePrice(double BMI)
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
      
      if(BMI > 35)
         {
            bmiFee = (BMI - 35) * 20;
         }
      else
         {
            bmiFee = 0;
         }
         
      insurancePrice = basePrice + ageFee + bmiFee;
      
      return insurancePrice;
   }

}