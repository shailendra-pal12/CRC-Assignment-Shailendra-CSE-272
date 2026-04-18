class Alpha {
 public static void main(String[] args){
  String s="a1b2c";
  String res="";
  for(int i=0;i<s.length();i++){
   char c=s.charAt(i);
   if(Character.isLetter(c))
    res+=c;
  }
  System.out.println(res);
 }
}
