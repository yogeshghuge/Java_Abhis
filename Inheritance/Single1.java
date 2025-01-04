class First
{
 int a;
  void cal()
  {
   a=7;
  }
}
class Single1 extends First
{
 void show()
 {
  System.out.println("Square="+(a*a));
  System.out.println("cube="+(a*a*a));
 }
 public static void main(String args[])
 {
  Single1 S=new Single1();
  S.cal();
  S.show();
 }
}
 
   
   