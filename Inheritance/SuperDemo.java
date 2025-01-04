class First
{
 int a,b;
 void display()
 {
   System.out.println("I am in First");
   System.out.println("A="+a);
    System.out.println("B="+b);
 }
}
class SuperDemo extends First
{
 int a,b;
 void display()
 {
  a=10;
  b=39;
  System.out.println("I am in Second");
  System.out.println("A="+a);
  System.out.println("B="+b);
  super.a=50;
  super.b=30;
  super.display();
 }
 public static void main(String args[])
 {
  SuperDemo S=new SuperDemo();
  S.display();
 }
}
   