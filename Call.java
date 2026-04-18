class Call {
 static void change(int a){
  a=50;
 }
 public static void main(String[] args){
  int x=10;
  change(x);
  System.out.println(x);
 }
}
