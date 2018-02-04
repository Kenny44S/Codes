class LinkedList {

    Node head;

    static class Node
    {
        Node next;
        int value;

        Node(int val)
        {
            this.value= val;
            this.next = null;
        }
    }

    public void printLinkedList()
    {
        Node init = this.head;
        while(init != null)
        {
            System.out.print(init.value);
            init = init.next;
            if(init != null)
            System.out.print(" -> ");
        }
    }

    public static void main(String[] args) {
        LinkedList list = new LinkedList();

        list.head = new Node(2);
        Node second = new Node(4);
        Node third = new Node(8);
        Node fourth = new Node(24);
        Node fifth = new Node(44);

        list.head.next = second;
        second.next = fifth;
        fifth.next = third;
        third.next = fourth;

        list.printLinkedList();
    }
}
