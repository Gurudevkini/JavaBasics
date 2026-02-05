import java.util.*;
public class Switch {
    public static void main (String [] args)
    {
      Scanner sc=new Scanner(System.in);
      System.out.println("Enter the choice [1/2/3]");
      int num =sc.nextInt();

      switch(num)
      {
        case 1:
        {
        System.out.println("kannada");
        break;
        }
        case 2:
          {
            System.out.println("Hindi");
            break;
          }
          case 3:
            {
              System.out.println("English");
              break;
            }
      }

    }
}
