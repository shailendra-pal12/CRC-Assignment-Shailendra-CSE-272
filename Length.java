class Length {
 public static void main(String[] args){
  
  String s = "hello";
  int count = 0;

  
  for(int i = 0; i < s.length(); i++){
   count = count + 1;
  }

  System.out.println("Length = " + count);
 }
}