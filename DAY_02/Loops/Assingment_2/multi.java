package Loops.Assingment_2;



public class multi {
  public static void main(String[] args) {
  //FOR LOOP
  int mul=1;
 
  for( int i=1; i<10; i++)
  {
    mul=mul*i;
  } 
  System.out.println(mul);
  // WHILE LOOP
  mul=1;
  int i=1;
    while (i<=10) {
    mul*=i;
    i++;
  }System.out.println(mul);
  //DO WHILE LOOP
  mul=1;
   i=1;
  do {
   mul*=i;
   i++;
  } while (i<=11);
System.out.println(mul);

  }
}
