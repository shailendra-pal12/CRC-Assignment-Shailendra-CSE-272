class Node {
 int data;
 Node next;

 Node(int d){
  data = d;
 }
}

class StackLL {

 Node top = null;

 void push(int x){
  Node n = new Node(x);
  n.next = top;
  top = n;
 }

 void pop(){
  if(top == null){
   System.out.println("Underflow");
   return;
  }
  System.out.println("Popped: " + top.data);
  top = top.next;
 }

 void display(){
  Node temp = top;
  while(temp != null){
   System.out.print(temp.data + " ");
   temp = temp.next;
  }
 }

 public static void main(String[] args){

  StackLL s = new StackLL();

  s.push(5);
  s.push(10);
  s.push(15);

  s.display();
  System.out.println();

  s.pop();

  s.display();
 }
}
