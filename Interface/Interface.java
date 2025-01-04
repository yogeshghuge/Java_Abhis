interface First
{
 void show();
}
interface Second
{
 void display();
}
class Interface implements First,Second
{
 public void show()
 { 
   System.out.println(" I am in show");
 }
 public void display()
 {
 }
 public static void main(String args[])
 {
  Interface I=new Interface();
 I.show();
}
}