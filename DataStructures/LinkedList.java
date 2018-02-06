public class LinkedList{
    
    Node head;
    
    public void getAvailableFunctions()
    {
        System.out.println("Functions available are: insertAtStart(int), insertAfter(node, int), insertAtLast(int) ");
    }
    
    public static class Node{
        
        int data;
        Node next;
        
        Node(int data){
            this.data = data;
            this.next = null;
        }
    }
    
    public void insertAtStart(int data)
    {
        if( this.head == null)
        {
            this.head = new Node(data);
            return;
        }
        
        Node newHead = new Node(data);
        
        newHead.next = this.head;
        this.head = newHead;
        return;
    }
    
    public void insertAfter(Node previousNode, int data)
    {
        if( previousNode.next == null )
        {
            previousNode.next = new Node(data);
            return;
        }
        
        Node newNode = new Node(data);
        
        newNode.next = previousNode.next;
        previousNode.next = newNode;
        return;
    }
    
    public void insertAtLast(int data)
    {
        if( this.head == null )
        {
            this.head = new Node(data);
            return;
        }
        
        Node n = this.head;
        while( n.next != null )
        {
            n = n.next;
        }
        n.next = new Node(data);
        return;
    }
    
    public void printList()
    {
        Node n = this.head;
        while( n != null)
        {
            System.out.print(n.data);
            n = n.next;
            if( n != null) System.out.print(" -> ");
        }
        System.out.println();
    }
    
    public int getSize()
    {   
        int count = 1;
        
        if( this.head == null )
        return 0;
        
        Node n = this.head;
        while( n.next != null )
        {
            count++;
            n = n.next;
        }
        return count;
    }
    
    
    public static void main(String[] args){
        
        LinkedList list = new LinkedList();
        
        list.getAvailableFunctions();
        
        list.head = new Node(1);
        Node second = new Node(2);
        Node third = new Node(3);
        Node fourth = new Node(4);
        Node fifth = new Node(5);
        
        list.head.next = second;
        second.next = third;
        third.next = fourth;
        fourth.next = fifth;
        
        list.printList();
        list.insertAtStart(100);
        list.printList();
        list.insertAfter(second, 200);
        list.printList();
        list.insertAtLast(400);
        list.printList();
        
        System.out.print("Size of LinkedList is: " + list.getSize());
    }
}
