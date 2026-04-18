class Node{
 int data;
 Node next;
 Node(int d){data=d;}
}
class LL{
 public static void main(String[] args){
  Node n1=new Node(1);
  Node n2=new Node(2);
  n1.next=n2;
  System.out.println(n1.data+" "+n1.next.data);
 }
}
