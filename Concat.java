class Concat {
 public static void main(String[] args){
  String a="hi ";
  String b="there";
  String c="";
  for(int i=0;i<a.length();i++)
   c+=a.charAt(i);
  for(int i=0;i<b.length();i++)
   c+=b.charAt(i);
  System.out.println(c);
 }
}
