package Loops.Assingment_2;

public class atozVer {
    public static void main (String [] args)
    {
      String str="abcdefghijklmnopqrstuvwxyz";
      char[]alphabets=str.toCharArray();

      // FOR LOOP 
      for(int i=0; i<alphabets.length; i++)
      {
        System.out.println(alphabets[i]+"");
      }
      System.out.println();
      // WHILE LOOP
      int i=0;
      while (i<alphabets.length) 
        {
        System.out.println(alphabets[i]+"");
        i++;
      }
      System.out.println();
    //  DO WHILE LOOP
     i=0;
     do {
      System.out.println(alphabets[i]+"");
      i++;
     } while(i<alphabets.length);
    }
}
