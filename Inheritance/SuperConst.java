class First
{
 First(int a)
 {
    System.out.println("A="+a);
 }
}
class SuperConst extends SuperConst
{
 SuperConst(int x , int y)
 {
  super();
    System.out.println("X="+x);
 }
 public static void main(String args[])
 {
  SuperConst S=new SuperConst();
 }
} 
 
