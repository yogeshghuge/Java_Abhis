interface First
{
 int a=5;
}
interface Second
{
 int b=2;
}
class  intermul implements First,Second
{
 void show()
 {
    System.out.println("Addition="+(a+b));
 }
 public static void main(String args[])
 {
  intermul I=new intermul();
  I.show();
 }
} 
