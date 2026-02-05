package DAY_03;

public class calculator {

  public static void add(int a, int b){
    System.out.println("Additon of two numbers is :"+(a+b));

    
  }
  public static void add(){
    System.out.println("Hi , i am adder function");

    
  }
  public static void add(int a, int b,int c){
    System.out.println("addition of three numbers is :"+(a+b+c));

  }
  public static void add(double a , double b) {
        System.out.println("(double)sum of two numbers is :"+(a+b));

  }
  public static void div(double a , double b) {
        System.out.println("Divison of two numbers is :"+(a/b));

  }

  public static void main(String[] args) {
    add(10,20);
    add(10.3,12.78);
    add();
    add(10,20,30);

  


  }
  
}
