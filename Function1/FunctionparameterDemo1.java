class First
{
 void abc(int x,float y)
 {
  System.out.println("X="+x);
  System.out.println("Y="+y);
 }
}
class FunctionparameterDemo1
{
 public static void main(String args[])
 {
  First F=new First();
  F.abc(7,9.4f);
 }
}