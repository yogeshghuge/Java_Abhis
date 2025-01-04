class Demo
{
 int a=10;
 Demo
 {
   System.out.println("A="+a);
protected void finalize()
 {
   
   System.out.println("finalize called");
 }
 public static void main(String args[])
 {
  Demo D=new Demo();
  }
}

  
 