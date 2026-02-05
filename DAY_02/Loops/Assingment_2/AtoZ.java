package Loops.Assingment_2;
public class AtoZ
{
  public static void main(String[] args) {
    String str="ABCDEFGHIJKLMNOPQRSTUVWXYZ";
    char []alphabets=str.toCharArray(); // it will convert to character array
    for(int i=0;i<alphabets.length;i++){
      System.out.print(alphabets[i]+" ");
    }
    System.out.println();
    int i=0;
    while(i<alphabets.length)
    {
      System.out.print(alphabets[i]+" ");
      i++;
    }
    System.out.println();
    i=0;
    do{
      System.out.print(alphabets[i]+" ");
      i++;
    } while(i<alphabets.length);
  } 
}