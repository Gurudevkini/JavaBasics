import java.util.Scanner;

public class Voterid {
  public static void main( String [] args)
  {
    Scanner sc = new Scanner(System.in);
    System.out.println("Enter you age :");
    int age =sc.nextInt();
    if(age<18)
    {
      System.out.println("You cant apply, you r a minor");
    }
    else
    {
      System.out.println("You can apply for voter id ");
    }
    sc.close();
  }
  
}
