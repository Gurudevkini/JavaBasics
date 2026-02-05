package Loops.Assingment_2;


public class add {
  public static void main(String[] args) {
    //FOR LOOP
     int sum=0;
    for(int i=1; i<=5; i++)
    {
     
      sum+=i;
      
    }
    System.out.println(sum);
 // WHILE LOOP
 sum=0;
 int i=1;
    while (i<=5) {
  sum+=i;
  i++;
  }
  System.out.println(sum);
// DO WHILE LOOP
sum=0;
i=0;
  do {
    sum+=i;
    i+=1;
  } while (i<=5);
  
  System.out.println(sum);
}
}
  

//multi*=