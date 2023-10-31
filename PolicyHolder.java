
public class PolicyHolder
{
   //fields
   private double age, height, weight;
   private String firstName, lastName, smokeStatus;
   
   /**
   Constuctor that accepts arguemnts
      @param firstNameGiven The policyholder's first name
      @param lastNameGiven The policyholder's last name
      @param ageGiven The policyholder's age
      @param smokeStatusGiven The policyholder's smoking status
      @param heightGiven The policyholder's height
      @param Weight The policyholder's weight
   */
   
   public PolicyHolder(String firstNameGiven, String lastNameGiven, double ageGiven, String smokeStatusGiven, double heightGiven, double weightGiven)
   {
      firstName = firstNameGiven;
      lastName = lastNameGiven;
      age = ageGiven; 
      smokeStatus = smokeStatusGiven;
      height = heightGiven;
      weight = weightGiven;
    }
    
       /* The copy constructor
         @param object2 - the object to copy
      */
   
   public PolicyHolder(PolicyHolder object2)
   {
      firstName = object2.firstName;
      lastName = object2.lastName;
      age = object2.age; 
      smokeStatus = object2.smokeStatus;
      height = object2.height;
      weight = object2.weight;
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

   public String toString()
      {
         return String.format("Policyholder's First Name: " + firstName + 
            "\nPolicyholder's Last Name: " + lastName + 
            "\nPolicyholder's Age: " + age + 
            "\nPolicyholder's Smoking Status: " + smokeStatus + 
            "\nPolicyholder's Height: " + height +    
            "\nPolicyholder's Weight: " + weight);
      }

}