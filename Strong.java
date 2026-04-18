class Strong {
 public static void main(String[] args){
  int n=145,sum=0,temp=n;
  while(n>0){
   int r=n%10,f=1;
   for(int i=1;i<=r;i++)
    f=f*i;
   sum=sum+f;
   n=n/10;
  }
  if(sum==temp)
   System.out.println("Strong");
 }
}