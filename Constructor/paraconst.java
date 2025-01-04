class Demo
{
 int a,b;
 Demo(int x,int y)
 {
  a=x;
  b=y;
 }
 void show()
 {
   System.out.println("A="+a);
    System.out.println("B="+b);
 }
}
class paraconst
{
 public static void main(String args[])
 {
  Demo D=new Demo(20,30);
Demo D1=new Demo(9,8);
  D.show();
D1.show();
 }
}     