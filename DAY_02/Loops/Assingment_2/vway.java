package Loops.Assingment_2;

public class vway {
  public static void main(String[] args) {
    String src="!@#$%^&*()";
    char[]special=src.toCharArray();
  
  //FOR LOOP
  for(int i=0; i<special.length; i++)
  {
    System.out.println(special[i]+ "");
  }
  //WHILE LOOP
  int i=0;
   while(i<special.length) 
   {
    System.out.println(special[i]+"");
    i++;
   }
    i=0;
   do
   {
 System.out.println(special[i] + "");
 i++;
   }while(i<special.length);

}
}