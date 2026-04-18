class SortStr {
 public static void main(String[] args){
  String a[]={"banana","apple","cat"};
  for(int i=0;i<a.length;i++){
   for(int j=i+1;j<a.length;j++){
    if(a[i].compareTo(a[j])>0){
     String t=a[i];a[i]=a[j];a[j]=t;
    }
   }
  }
  for(String s:a)
   System.out.print(s+" ");
 }
}
