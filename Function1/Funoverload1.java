class First
{ 
 void show(int n,int m)
 {
  System.out.println("Sum="+(n+m));
 }
 void show(int x,float y)
 {
  System.out.println("Sum="+(x+y));
 }
}
class Funoverload1
{
 public static void main(String args[])
 {
  First F=new First();
  F.show(1,9);
  F.show(2,5f);
 }
} 