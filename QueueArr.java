class QueueArr {

 int a[] = new int[5];
 int front = 0, rear = 0;

 void add(int x){
  if(rear == 5){
   System.out.println("Full");
   return;
  }
  a[rear++] = x;
 }

 void remove(){
  if(front == rear){
   System.out.println("Empty");
   return;
  }
  System.out.println("Removed: " + a[front++]);
 }

 void display(){
  for(int i=front;i<rear;i++)
   System.out.print(a[i] + " ");
 }

 public static void main(String[] args){

  QueueArr q = new QueueArr();

  q.add(1);
  q.add(2);
  q.add(3);

  q.display();
  System.out.println();

  q.remove();

  q.display();
 }
}
