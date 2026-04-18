class Node1 {
 int data;
 Node1 next;

 Node1(int d){
  data = d;
  next = null;
 }
}

class Reversell {

 Node1 head;

 void insert(int data){
  Node1 n = new Node1(data);

  if(head == null){
   head = n;
   return;
  }

  Node1 temp = head;
  while(temp.next != null){
   temp = temp.next;
  }
  temp.next = n;
 }

 void display(){
  Node1 temp = head;
  while(temp != null){
   System.out.print(temp.data + " ");
   temp = temp.next;
  }
  System.out.println();
 }

 void reverse(){
  Node1 prev = null;
  Node1 curr = head;

  while(curr != null){
   Node1 next = curr.next;
   curr.next = prev;
   prev = curr;
   curr = next;
  }

  head = prev;
 }

 public static void main(String[] args){

  Reversell l = new Reversell();

  l.insert(1);
  l.insert(2);
  l.insert(3);
  l.insert(4);

  System.out.print("Before: ");
  l.display();

  l.reverse();

  System.out.print("After: ");
  l.display();
 }
}