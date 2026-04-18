class DNode {
 int data;
 DNode prev, next;

 DNode(int d){
  data = d;
 }
}

class DLL {

 DNode head;

 void insert(int data){
  DNode n = new DNode(data);

  if(head == null){
   head = n;
   return;
  }

  DNode temp = head;
  while(temp.next != null){
   temp = temp.next;
  }

  temp.next = n;
  n.prev = temp;
 }

 void display(){
  DNode temp = head;
  while(temp != null){
   System.out.print(temp.data + " ");
   temp = temp.next;
  }
 }

 public static void main(String[] args){

  DLL d = new DLL();

  d.insert(10);
  d.insert(20);
  d.insert(30);

  d.display();
 }
}
