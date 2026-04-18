class Count {
 public static void main(String[] args){
  String s="hi 123";
  int v=0,d=0,sp=0;
  for(int i=0;i<s.length();i++){
   char c=s.charAt(i);
   if("aeiou".indexOf(c)!=-1) v++;
   else if(c>='0'&&c<='9') d++;
   else if(c==' ') sp++;
  }
  System.out.println(v+" "+d+" "+sp);
 }
}
