class RemoveDup {
 public static void main(String[] args){
  int a[]={1,2,2,3};
  for(int i=0;i<a.length;i++){
   int flag=0;
   for(int j=0;j<i;j++){
    if(a[i]==a[j]) flag=1;
   }
   if(flag==0)
    System.out.print(a[i]+" ");
  }
 }
}
