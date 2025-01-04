class First
{
 First(int a)
 {
    System.out.println("A="+a);
 }
}
class SuperConst1 extends First
{
 SuperConst1(int x,int y)
 {
  super(y);
    System.out.println("X="+x);
 }
 public static void main(String args[])
 {
  SuperConst1 S=new SuperConst1(55,33);
 }
} 
 
