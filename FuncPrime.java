class FuncPrime {
 static void check(int n){
  int f=0;
  for(int i=2;i<n;i++)
   if(n%i==0) f=1;
  if(f==0) System.out.println("Prime");
 }
 public static void main(String[] args){
  check(7);
 }
}
