class ReplaceDemo
{
 public static void main(String args[])
 {
  String s1="Sachin is best Indian Batsman";
  String s2=s1.replace('a','e');
  System.out.println("After Replacement="+s2);
  String s3=s1.replace("is","was");
  System.out.println("After Replacement="+s3);
 }
}