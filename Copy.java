class Copy {
 public static void main(String[] args){
  String s="hello";
  String t="";
  for(int i=0;i<s.length();i++)
   t+=s.charAt(i);
  System.out.println(t);
 }
}
