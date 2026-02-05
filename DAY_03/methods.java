package DAY_03;
public class methods {

  public static void demo(){ // NO ARRGUMENT METHOD
    System.out.println("Hello world");
  }
  public static void main(String[] args) {
    System.out.println("Main starts world");
  
    demo();
    add(10,20);
    // ethier you have to store it or directly add it 
    System.out.println( add(10,20));
    // method call statment 
    int result=add(20,20);
    System.out.println("added value is " +result);

    System.out.println("main ends");
}
public static int add(int a , int b)
{
  int res=a+b;
  return res;
}
  
}