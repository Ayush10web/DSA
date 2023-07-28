public class singlyLinkedList {

    private ListNode head;

    private static class ListNode {
        private int data;
        private ListNode next;

        public ListNode(int data) {
            this.data = data;
            this.next = null;
        }
    }

    public void display() {
        ListNode current = head;
        while (current != null) {
            System.out.println(current.data);
            current = current.next;
        }
        System.out.println("Null");
    }

    public int length() {
        ListNode current = head;
        if (current == null){
            return 0;
        }
        int count = 0 ;
        while(current != null) {
            count++;
            current = current.next;
        }
        return count;
    }

    public void inserAtStart(int value) {
        ListNode newNode = new ListNode(value);
        newNode.next = head;
        head = newNode;
    }

    public void insert (int position , int value) {

        ListNode newNode = new ListNode(value);

        if(position == 1) {
            newNode.next = head;
            head = newNode;
        }
        else {
            ListNode previousNode = head;
            int count = 1; 

            while(count < position -1) {
                previousNode = previousNode.next;
                count++;
            }

            ListNode currentNode = previousNode.next;
            previousNode.next = newNode;
            newNode.next = currentNode;
        }
    }

    public void insertAtEnd(int value) {
        ListNode newNode = new ListNode(value);
        if(head == null){
            head = newNode;
            return;
        }
        ListNode current = head;
        while(current.next != null){
            current = current.next;
        }
        current.next = newNode;
    }

    public ListNode deleteFirst() {
        if (head == null){
            return head;
        }
        ListNode temp = head;
        head = head.next;
        temp.next = null;
        return temp;
    }

    public static void main(String[] args) {
        singlyLinkedList sll = new singlyLinkedList();
        sll.head = new ListNode(10);
        ListNode second = new ListNode(30);
        ListNode third = new ListNode(60);
        ListNode fourth = new ListNode(90);

        sll.head.next = second;
        second.next = third;
        third.next = fourth;

        sll.inserAtStart(100);

        sll.insertAtEnd(50);

        sll.insert(4, 45);

        sll.display();

        System.out.println(sll.deleteFirst().data);

        System.out.println(sll.length());

    }

}