class Demo
{
 int a,b;
 Demo(int a,int b)
 {
   this.a=a;
   this.b=b;
 }
 void show()
 {
   System.out.println("A="+a+"  B="+b); 
 }
}
class thisDemo
{
 public static void main(String args[])
 {
  Demo D=new Demo(20,45);
  D.show();
 }
}
 