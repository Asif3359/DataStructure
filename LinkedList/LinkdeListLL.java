class LinkedListLL {

    Node head;
    private int size ;

    LinkedListLL()
    {
        this.size = 0 ;
    }

    class Node {
        String data;
        Node next;

        Node(String data) {
            this.data = data;
            this.next = null;
            size++;
        }
        // add first
    }

    public void addFirst(String data) {
        Node newNode = new Node(data);
        if (head == null) {
            head = newNode;
            return;
        }
        newNode.next = head;
        head = newNode;

    }

    public void addLast(String data) {
        Node newNode = new Node(data);
        Node current;
        current = head;

        if (head == null) {
            head = newNode;
            return;
        }
        while (current.next != null) {
            current = current.next;
        }
        current.next = newNode;

    }
    public void deleteFirst ()
    {
        if (head == null) {
            System.out.println("List is Empty");
            return;
        }
        size--;
        head=head.next;
    }
    public void deleteLast ()
    {
        if(head == null)
        {
            System.out.println("List is Empty");
            return;
        }
        size--;
        if (head.next == null)
        {
            head = null;
            return;
        }
        Node secondLast = head;
        Node lastNode = head.next;
        while (lastNode.next != null) {
            lastNode = lastNode.next;
            secondLast= secondLast.next;
        }
        secondLast.next = null;
    }

    public void printNode ()
    {
        if (head == null) {
            System.out.println("List Is Empty");
            return;
        }
        Node current;
        current = head;
        while (current != null) {
            System.out.print(current.data + " -> ");
            current = current.next;
        }
        System.out.println("Null");
    }

    public int getSize()
    {
        return size;
    }

    public void reverseList()
    {

        if(head == null || head.next == null)
        {
            return ;
        }
        Node PrevNode =head ;
        Node currNode = head.next;
       
        while (currNode != null) {
            Node nextNode = currNode.next;
            currNode.next = PrevNode ;

            // update 
            PrevNode = currNode;
            currNode = nextNode;
        }
        head.next = null;
        head = PrevNode;

    }

    public Node reverseListRec(Node head)
    {
        if(head == null || head.next == null)
        {
            return head;
        }
        Node newHead = reverseListRec(head.next);
        head.next.next = head ;
        head.next=null;
        return newHead ;
    }

    public static void main(String[] args) {
        LinkedListLL list = new LinkedListLL();
        list.addFirst("a");
        list.addFirst("is");

        list.addLast("List");
        list.addFirst("This");
        
        list.printNode();
        list.reverseList();
        list.printNode();

        list.head = list.reverseListRec(list.head);
        list.printNode();
        

        System.out.println(list.getSize());

    }
}
