abstract class First
{
 void show()
 {
  System.out.println(" ABC");
 }
 abstract void display();
}
class Demoabstract extends First
{ 
  void display()
  {
   System.out.println(" XYZ");
  }
  public static void main(String abc[])
  {
   Demoabstract D=new Demoabstract();
   D.show();
   D.display();
  }
}