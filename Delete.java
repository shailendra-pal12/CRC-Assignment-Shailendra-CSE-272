class Delete {
 public static void main(String[] args){
  int a[]={1,2,3,4,5};
  int pos=2;
  for(int i=pos;i<a.length-1;i++)
   a[i]=a[i+1];
  for(int i=0;i<a.length-1;i++)
   System.out.print(a[i]+" ");
 }
}
