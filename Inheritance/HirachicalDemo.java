class First
{
 int a,b,ans;
}
class Second extends First
{
  void cal()
  {
   a=5;
   b=10;
   ans=a+b;
  }
  void display()
  {
   System.out.println("Addition="+ans);
  }
}
class Third extends First
{
 void calculation()
 {
  a=10; 
  b=34;
  ans=a*b;
 }
 void show()
 {
  System.out.println(" Multiplication="+ans);
 }
}
class HirachicalDemo
{
 public static void main(String args[])
 {
  Second S=new Second();
  Third T=new Third();
  S.cal();
  S.display();
  T.calculation();
  T.show();
 }
} 
   