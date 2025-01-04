class Demo
{
 int a,b,sum;
 Demo()
 {
  a=10;
  b=40;
 }
 Demo(int x,int y)
 {
  a=x;
  b=y;
 }
 void cal()
 {
  sum=a+b;
 }
 void show()
 {
   System.out.println("Addition="+sum); 
  }
}
class Constoverload
{
 public static void main(String args[])
 {
  Demo D=new Demo();
  Demo D1=new Demo(78,89);
  D.cal();
  D1.cal();
  D.show();
  D1.show();
}
}