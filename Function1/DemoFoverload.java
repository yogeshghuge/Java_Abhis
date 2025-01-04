class First
{
 void abc(int X)
 {
  System.out.println("x="+X);
 }
 void abc()
 {
  System.out.println("Java");
 }
}
class DemoFoverload
{
 public static void main(String args[])
 {
  First F=new First();
  F.abc();
  F.abc(34);
 }
}
    