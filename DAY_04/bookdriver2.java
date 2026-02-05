package DAY_04;
public class bookdriver2
{  
  public static void main(String[] args) {
    Books b1=new Books(); //0x1
    Books b2=new Books(); //0x2
    Books b3=b1; //0x1
    Books b4=b2;
    System.out.println(b1==b2);
    System.out.println(b1==b3);
    System.out.println(b2==b3);


    
  }
}