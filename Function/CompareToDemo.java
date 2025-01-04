class CompareToDemo
{
 public static void main(String args[])
 {
  String s1="Abcd";
  String s2="ABCD";
  String s3="xder";
  System.out.println(s1.compareTo(s2));
  System.out.println(s1.compareTo(s1));
  System.out.println(s1.compareTo(s3));
}
}