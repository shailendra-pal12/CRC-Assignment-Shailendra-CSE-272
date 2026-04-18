class Roots {
 public static void main(String[] args){
  double a=1,b=5,c=6;
  double d=b*b-4*a*c;
  if(d>=0){
   double r1=(-b+Math.sqrt(d))/(2*a);
   double r2=(-b-Math.sqrt(d))/(2*a);
   System.out.println(r1+" "+r2);
  }else{
   System.out.println("Imaginary roots");
  }
 }
}
