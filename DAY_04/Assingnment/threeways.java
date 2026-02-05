package DAY_04.Assingnment;

public class threeways
{
  static int count = 100;
  static String name = "Java";
  static double salary = 50000.50;

  public static void displayViaMethod() {
    System.out.println("Method Access ");
    System.out.println("Count: " + count);
    System.out.println("Name: " + name);
    System.out.println("Salary: " + salary);
  }
  public void displayViaInstance() {
    System.out.println("\n Instance Method Access");
    System.out.println("Count: " + count);
    System.out.println("Name: " + name);
    System.out.println("Salary: " + salary);
  }

  public static void main(String[] args) {
    // Way 1: Access static variable directly using class name
    System.out.println("*** Way 1: Direct Access via Class Name ***");
    System.out.println("Count: " + threeways.count);
    System.out.println("Name: " + threeways.name);
    System.out.println("Salary: " + threeways.salary);

    // Way 2: Access static variable via instance (not recommended but allowed)
    System.out.println("\n*** Way 2: Access via Instance ***");
    threeways obj = new threeways();
    System.out.println("Count: " + obj.count);
    System.out.println("Name: " + obj.name);
    System.out.println("Salary: " + obj.salary);

    // Way 3: Access static variables via static method
    System.out.println("\n*** Way 3: Access via Static Method ***");
    threeways.displayViaMethod();

    // Bonus: Access via non-static method
    obj.displayViaInstance();

    // Modify static variable
    System.out.println("\n*** Modifying Static Variables ***");
    threeways.count = 200;
    threeways.name = "Python";
    System.out.println("Updated Count: " + threeways.count);
    System.out.println("Updated Name: " + threeways.name);
  }
}