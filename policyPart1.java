import java.util.Scanner;

public class policyPart1
{
  public static void main(String[] args)
  {
  /**
  @param main method
  @return main method
  */
  
   String policyNumber;
   String providerName;
   String firstName;
   String lastName;
   int age;
   String smokingStatus;
   double height;
   double weight;
   Scanner keyboard = new Scanner(System.in);
   
   System.out.print("Please enter the policy number: ");
   policyNumber = keyboard.nextLine();
   
   System.out.print("Please enter the provider name: ");
   providerName = keyboard.nextLine();
   
   System.out.print("Please enter the policyholder's first name: ");
   firstName = keyboard.nextLine();
   
   System.out.print("Please enter the policyholders's last name: ");
   lastName = keyboard.nextLine();
   
   System.out.print("Please enter the policyholder's age: ");
   age = keyboard.nextInt();
   keyboard.nextLine();
   
   System.out.print("Please enter the policyholder's smoking status(smoker/non-smoker): ");
   smokingStatus = keyboard.nextLine();
   
   System.out.print("Please enter the policyholder's height(in inches): ");
   height = keyboard.nextDouble();
   
   System.out.print("Please enter the policyholder weigh(in pounds): ");
   weight = keyboard.nextDouble();
   
   Policy policy = new Policy(policyNumber, providerName, firstName, lastName, age, smokingStatus, height, weight);   
   System.out.println();
   
   System.out.println("Policy Number: " + policy.getPolicyNumber());
   System.out.println("Provider Name: " + policy.getProviderName());
   System.out.println("Policyholder's First Name: " + policy.getFirstName());
   System.out.println("Policyholder's Last Name: " + policy.getLastName());
   System.out.println("Policyholder's Age: " + policy.getAge());
   System.out.println("Policyholder's Smoking Status: " + policy.getSmokingStatus());
   System.out.println("Policyholder's Height: " + policy.getHeight() + " inches");
   System.out.println("Policyholder's Weight: " + policy.getWeight() + " pounds");
   System.out.printf("Policyholder's BMI: %.2f\n", policy.getBMI());
   System.out.printf("Policy Price: $%.2f\n", policy.getPrice());
   }
   
   
   
   public class Policy
   {  //fields
   
   /**
   @param method displays fields
   @return fields
   */
   
   private String policyNumber;
   private String providerName;
   private String firstName;
   private String lastName;
   private int age;
   private String smokingStatus;
   private double height;
   private double weight;

   //constructors
   public Policy()
   /**
   @param displays variables
   @retuen variables
   */
   {
      policyNumber = "";
      providerName = "";
      firstName = "";
      lastName = "";
      age = 0;
      smokingStatus = "";
      height = 0;
      weight = 0;
   }
   
   public Policy(String pNumber, String pName, String fName, String lName,int a, String sStatus, double h, double w)
   {
      policyNumber = pNumber;
      providerName = pName;
      firstName = fName;
      lastName = lName;
      age = a;
      smokingStatus = sStatus;
      height = h;
      weight = w;
   }
   
   /**
   @param setters
   @return setters
   */
   

   public void setPolicyNumber(String pNumber)
   {
      policyNumber = pNumber;
   }
   
   public void setProviderName(String pName)
   {
      providerName = pName;
   }
   
   public void setFirstName(String fName)
   {
      firstName = fName;
   }
   
   public void setLastName(String lName)
   {
      lastName = lName;
   }
   
   public void setAge(int a)
   {
      age = a;
   }
   
   /**
   @param variable info
   @return variable info
   */
   
   public void setSmokingStatus(String sStatus)
   {
      smokingStatus = sStatus;
   }
   
   public void setHeight(double h)
   {
      height = h;
   }
   
   public void setWeight(double w)
   {
      weight = w;
   }

   
   /**
   @param getters
   @return getters
   */
   
   public String getPolicyNumber()
   {
      return policyNumber;
   }
   
   public String getProviderName()
   {
      return providerName;
   }                                /**
                                      @param vaiable info
                                      @return variable info
                                    */
   
   public String getFirstName()
   {
      return firstName;
   }
   
   public String getLastName()
   {
      return lastName;
   }
   
   public int getAge()
   {
      return age;
   }
   
   public String getSmokingStatus()
   {
      return smokingStatus;
   }
   
   public double getHeight()
   {
      return height;
   }
   
   public double getWeight()
   {
      return weight;
   }
   
   /**   
   @param Calculates the Policyholder's BMI
   @return BMI
   */
   public double getBMI()
   {
      final double CONVFACTOR = 703;
      
      return (weight * CONVFACTOR) / (height * height);
   }
   
   /** 
   @param Calculates the Policy's price
   @return policys price
   */
   public double getPrice()
   {
      final double BASE_PRICE = 600;
      final double ADDITIONAL_FEE_AGE = 75;
      final double ADDITIONAL_FEE_SMOKING = 100;
      final double ADDITIONAL_FEE_PER_BMI = 20;
      
      final int AGE_THRESHOLD = 50;
      final int BMI_THRESHOLD = 35;
      
      double price = BASE_PRICE;
      
      if(age > AGE_THRESHOLD) //over 50 years
         price += ADDITIONAL_FEE_AGE; //75
         
      if(smokingStatus.equalsIgnoreCase("smoker")) 
         price += ADDITIONAL_FEE_SMOKING; //100
            
      //call the getBMI method
      if(getBMI() > BMI_THRESHOLD) //BMI over 35
         price += ((getBMI() - BMI_THRESHOLD) * ADDITIONAL_FEE_PER_BMI); //additional BMI fee - 20
         
      return price;
   }
   
  }
}
