interface First
{
 int a=5;
 public void show();
}
class Demointer implements First
{
  public void show()
  {
     System.out.println("Square="+(a*a));
  }
  public static void main(String args[])
  {
   Demointer D=new Demointer();
  D.show();
  }
}
