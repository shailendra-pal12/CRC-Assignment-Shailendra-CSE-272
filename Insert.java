class Insert {
 public static void main(String[] args){
  int a[]=new int[6];
  a[0]=1;a[1]=2;a[2]=4;a[3]=5;
  int pos=2,val=3;
  for(int i=4;i>=pos;i--)
   a[i]=a[i-1];
  a[pos]=val;
  for(int i=0;i<5;i++)
   System.out.print(a[i]+" ");
 }
}
    

