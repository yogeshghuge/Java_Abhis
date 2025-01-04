import java.util.*;
class factorial
{
 public static void main(String ards[])
 {
  int n,i,fact=1;
  Scanner S=new Scanner(System.in);
  System.out.println("Enter no");
  n=S.nextInt();
  for(i=1;n>0;i++)
  {
   fact=fact*i;
  }
  System.out.println("Factorial="+fact);
 }
}
   