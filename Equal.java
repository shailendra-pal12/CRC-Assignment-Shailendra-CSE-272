class Equal {
 public static void main(String[] args){
  int a[][]={{1,2},{3,4}};
  int b[][]={{1,2},{3,4}};
  int flag=1;
  for(int i=0;i<2;i++){
   for(int j=0;j<2;j++){
    if(a[i][j]!=b[i][j])
     flag=0;
   }
  }
  if(flag==1)
   System.out.println("Equal");
 }
}
