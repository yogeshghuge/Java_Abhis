class First
{
 int a,b;
}
class SuperDemo1 extends First
{
 int a,b;
 void display()
 {
  a=10;
  b=20;
  super.a=50;
  super.b=50;
  System.out.println("I am in second");
  System.out.println("A="+a);
  System.out.println("B="+b);
  System.out.println("A="+super.a);
  System.out.println("B="+super.b);
 }
 public static void main(String args[])
 {
  SuperDemo1 S=new SuperDemo1();
  S.display();
 }
} 




   
   