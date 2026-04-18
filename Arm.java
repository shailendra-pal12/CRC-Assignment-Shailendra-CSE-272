class Arm {
 public static void main(String[] args){
  int n=153,sum=0,temp=n;
  while(n>0){
   int r=n%10;
   sum=sum+r*r*r;
   n=n/10;
  }
  if(sum==temp)
   System.out.println("Armstrong");
 }
}
