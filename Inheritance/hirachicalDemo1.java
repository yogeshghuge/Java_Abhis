class First
{
 int a,b,ans;
}
class Second extends First
{
  void cal(int x,int y)
  {
   a=x;
   b=y;
   ans=a+b;
  }
  void display()
  {
   System.out.println("Addition="+ans);
  }
}
class Third extends First
{
 void calculation(int x,int y)
 {
  a=x; 
  b=y;
  ans=a*b;
 }
 void show()
 {
  System.out.println(" Multiplication="+ans);
 }
}
class HirachicalDemo1
{
 public static void main(String args[])
 {
  Second S=new Second();
  Third T=new Third();
  S.cal(2,5);
  S.display();
  T.calculation(3,4);
  T.show();
 }
} 
   