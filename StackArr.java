class StackArr {

 int a[] = new int[5];
 int top = -1;

 void push(int x){
  if(top == 4){
   System.out.println("Overflow");
   return;
  }
  a[++top] = x;
 }

 void pop(){
  if(top == -1){
   System.out.println("Underflow");
   return;
  }
  System.out.println("Popped: " + a[top--]);
 }

 void display(){
  for(int i=top;i>=0;i--)
   System.out.print(a[i] + " ");
 }

 public static void main(String[] args){

  StackArr s = new StackArr();

  s.push(10);
  s.push(20);
  s.push(30);

  s.display();
  System.out.println();

  s.pop();

  s.display();
 }
}
