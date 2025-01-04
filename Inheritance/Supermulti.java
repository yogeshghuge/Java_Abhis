class First
{
 First(int a)
 {
    System.out.println("A="+a);
 }
}
class Second extends First
{
 Second(int b, int m)
 {
  super(m);
    System.out.println("B="+b);
 }
}
class Supermulti extends Second
{
  Supermulti(int x,int y,int z)
  {
   super(y,z);
    System.out.println("X="+x);
  }
  public static void main(String args[])
  {
   Supermulti S=new Supermulti(5,4,7);
  }
}
 
