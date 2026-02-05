package Decsion_Statment;

import java.util.*;
public class days {
  public static void main (String[]args)
  {
    Scanner sc= new Scanner(System.in);
    System.out.println("Enter the Day");
    int day= sc.nextInt();

    switch(day)
    {
      case 1 -> 
      {
        System.out.println("Monday");
      }
        case 2 -> 
      {
        System.out.println("Tuesday");
      }
        case 3 -> 
      {
        System.out.println("Wednesday");
      }
        case 4 -> 
      {
        System.out.println("thrusday");
      }
        case 5 -> 
      {
        System.out.println("Friday");
      }
        case 6 -> 
      {
        System.out.println("Saturday");
      }
        case 7 -> 
      {
        System.out.println("Sunday");
      }
      default ->
      {
       System.out.println("THIS IS AN INVALID INPUT ");
      }
    }
  }
  
}
