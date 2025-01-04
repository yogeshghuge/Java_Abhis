import java.util.*;
class Student
{
 public static void main(String args[])
 {
  int a,b,c,total;
  float per;
  Scanner S=new Scanner(System.in);
  System.out.print("Enter marks of three subjects");
  a=S.nextInt();
  b=S.nextInt();  
  c=S.nextInt();
  total=a=b+c;
  per=total/3.0f;
  System.out.println("Total="+total);
  System.out.println("\n percentage="+per);
 }
}