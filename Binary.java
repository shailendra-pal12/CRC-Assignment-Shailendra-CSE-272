class Binary {
 public static void main(String[] args){
  int a[]={1,2,3,4,5};
  int l=0,h=4,key=4;
  while(l<=h){
   int m=(l+h)/2;
   if(a[m]==key){
    System.out.println("Found");
    break;
   }else if(key>a[m])
    l=m+1;
   else
    h=m-1;
  }
 }
}
