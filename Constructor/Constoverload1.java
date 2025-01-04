import java.util.*;
class Demo
{
 int a;
 Demo()
 {
   System.out.println("Default constructor is called");
a=25;
 }
 Demo(int x)
{
   System.out.println("parameter constructor is caller");
   a=x;
}
void show()
{
  System.out.println("Square of no="+(a*a));
 System.out.println("cube of no="+(a*a*a));
}
}
class Constoverload1
{
 public static void main(String args[])
 {
   Scanner S=new Scanner(System.in);
   System.out.println("Enter a no=");
   int num; 
   num=S.nextInt();
   Demo D=new Demo(num);
   D.show();
   Demo D1=new Demo();
   D1.show();
 }
}
  
   
   