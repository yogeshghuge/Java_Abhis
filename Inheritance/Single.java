class first
{
 int a,b;
}
class Single extends first
{
 void show()
 {
  a=5;
  b=10;
  System.out.println("A="+a+"  B="+b);
 }
  public static void main(String args[])
  {
   Single S=new Single();
   S.show();
  }
 }
   