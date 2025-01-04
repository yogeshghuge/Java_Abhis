import java.util.*;
class SUM
{
 public static void main(String args[])
 {
  Scanner S=new Scanner(System.in);
  int i,n,sum=0;
  System.out.println("Enter no");
  n=S.nextInt();
  for(i=1;i<=n;i++)
  {
   sum=sum+i;
  }
  System.out.println(sum);
}
}
  