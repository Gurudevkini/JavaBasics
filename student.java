package DAY_06;

public class student {
private String atmName;
  private  String location;
   private  double money ;
 String getAtmName()
  {
    return atmName;
  }
    void setAtmName(String atmName)
    {
      this.atmName = atmName;
    }

    void details ()
    {
      System.out.println("ATM name :" +atmName);
      System.out.println("ATM location :" +location);
      System.out.println("Balance :" +money);
    }
   void checkbal()
{
System.out.println("Balance :" +money);
}
void withdraw()
{
  System.out.println("Withdrawing the amount ");
   

}
}