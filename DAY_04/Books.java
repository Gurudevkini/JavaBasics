package DAY_04;

public class Books {
    String Author;
    String title;
    double price;
  
    public static void main (String []args)
  {
    Books b1= new Books();
    b1.Author="Harsh Naik";
    b1.title= "fundamentals of space";
    b1.price= 1000;
   

     System.out.println("Book Author " +b1.Author);
       System.out.println("Book title " +b1.title);
         System.out.println("Book price "+b1.price);

         System.out.println();

         
    Books b2= new Books();
    b2.Author="Haffez ";
    b2.title= "fundamentals of C";
    b2.price= 1500;
   

     System.out.println("Book Author " +b2.Author);
       System.out.println("Book title " +b2.title);
         System.out.println("Book price "+b2.price);

         System.out.println();

         
    Books b3= new Books();
    b3.Author="Gurudev Kini";
    b3.title= "fundamentals of Chess";
    b3.price= 10000;
   

     System.out.println("Book Author " +b3.Author);
       System.out.println("Book title " +b3.title);
         System.out.println("Book price "+b3.price);
     
      System.out.println();    
  }
}
