class Node {
    int data;
    Node next;

    Node(int d) {
        data = d;
    }
}

class Floyd1 {
    public static void main(String[] args) {

        Node a = new Node(1);
        Node b = new Node(2);
        Node c = new Node(3);

        a.next = b;
        b.next = c;
        c.next = b; // loop created

        Node slow = a, fast = a;

        while (fast != null && fast.next != null) {
            slow = slow.next;
            fast = fast.next.next;

            if (slow == fast) {
                System.out.println("Loop Found");
                return;
            }
        }

        System.out.println("No Loop");
    }
}
