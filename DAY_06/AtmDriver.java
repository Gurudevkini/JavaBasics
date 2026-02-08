package DAY_06;

public class AtmDriver {
  public static void main(String[] args) {
    Atm a= new Atm();
    a.atmName ="Canara";
    a.location = "Canara college";
    a.details();
    a.atmName="Bank of India";
    a.money=1000;
    a.details();

    new Atm(); //THIS KEYWORD IS BEEN USED !!
  }
  
}
