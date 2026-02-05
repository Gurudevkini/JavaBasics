import java.util.*;
public class nameswith {
    public static void main (String [] args)
    {
      Scanner sc=new Scanner(System.in);
      System.out.println("Enter the Numbers to ");
      String name =sc.next();

      switch(name)
      {
        case "k":
        {
        System.out.println("kannada");
        break;
        }
        case "H":
          {
            System.out.println("Hindi");
            break;
          }
          case "E":
            {
              System.out.println("English");
              break;
            }
      }

    }
}
