
public class Demo {
  static int i=10;

  public static void add(int a , int b)
  {
    System.out.println("Addtion of 2 numbers"+(a+b));
  }
  public static void main(String[] args) {
    System.out.println(i);// METHOD 1

    System.out.println(Demo.i);// METHOD 2


    Demo d=new Demo();
    System.out.println(d.i); // METHOD 3
 
      add(10,20);
    Demo.add(20,30);

    Demo d2=new Demo();
    d2.add(30,30);
  }
}

