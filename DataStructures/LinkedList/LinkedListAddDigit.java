public class LinkedListAddDigit
{
    Node head;
    
    class Node
    {
        Node next;
        int data;
        
        public Node(int data)
        {
            this.data = data;
        }
    }

    public void insert(int data)
    {
        head = insertData(head, data);
    }
        
    public Node insertData(Node head, int data)
    {
        if( head == null )
        {
            head = new Node(data);
            return head;
        }
        Node newNode = new Node(data);
        newNode.next = head;
        head = newNode;
            
        return head;
    }
        
    public void printList()
    {
        Node n = head;
        while( n != null)
        {
            System.out.println(n.data);
            n = n.next;
        }
    }
        
    public void addNumber(int num)
    {
        System.out.print("Original: "); print();
        System.out.println("Adding " + num);
        
        startAddition(head, num, 1);

        System.out.print("Result: "); print();
    }
    
    // Function That Adds..
    public int startAddition(Node head, int numToAdd, int lengthCounter)
    {
        int carry = 0;

        if( head == null) return numToAdd;
        
        // Recurse till the end of list and start adding. 
        // Notice we Keep track of LinkedList's Node by adding 1 while recursing DOWN and subtracting 1 while return back.
        // When lengthCounter == 0, it means we are at the HEAD. Which will help us identify whether we have to create 
        // a new Node at the start.. 
        int add = startAddition(head.next, numToAdd, lengthCounter + 1);  

        lengthCounter--;

        int temp = (head.data += add);

        if( (temp > 9) && (lengthCounter == 0) )
        {
            head.data = (temp-10);
            Node newNode = new Node(1);
            newNode.next = this.head;
            this.head = newNode;
            return 0;
        }

        if(temp < 10)  
        {
            carry = 0;
            return carry;
        }
        else
        {
            head.data = (temp -10);
            carry = 1;
            return carry;
        }
    }
    
    // Prints LinkedList
    public void print()
    {
        Node n = head;
        while( n != null )
        {
            System.out.print(" -> " + n.data);
            n = n.next;
        }
        System.out.println();
    }

    // MAIN
    
    public static void main(String[] args)
    {
        LinkedListAddDigit llist = new LinkedListAddDigit();
        
        llist.insert(8);
        llist.insert(9);
        llist.insert(9);
        llist.insert(9);

        
        llist.addNumber(2);
    }
}



/*
Adding a digit to Linked List representing a number.

For Example, Adding 5 to a LinkedList    4 -> 6 -> 8  should output  4 -> 7 -> 3
ie: 468 + 5 = 473


Note how adding 9 to a LinkedList  9 -> 9 -> 1  we create a new Node at the start & output  1 -> 0 -> 0 -> 0



*/