interface First
{
 void show();
}
interface Second
{  
  void display();
}
class mulinheritance implements First,Second
{
 public void show()
 {
    System.out.println("Welcome");
 }
 public void display()
 {
    System.out.println("Hello");
 }
 public static void main(String args[])
 {
  mulinheritance n=new mulinheritance();
  n.show();
  n.display();
 }
}

