public class BinarySearchTree
{
    Node root;
    
    static class Node
    {
        int data;
        Node leftChild;
        Node rightChild;
        
        public Node(int data)
        {
            this.data = data;
        }
    }
    
    public void insertValue(int value)
    {
        root = this.insert(this.root, value);
    }
    
    public Node insert(Node root, int value)
    {
        if( root == null)
        {
            root = new Node(value);
            return root;
        }
        
        if( value < root.data )
        {
            root.leftChild = insert(root.leftChild, value);
        }else if( value > root.data )
        {
            root.rightChild = insert(root.rightChild, value);
        }
        
        return root;
    }
    
    public void searchValue(int value)
    {
         System.out.println("Root..");
         Node n = search(this.root, value);
         if( n == null) System.out.println("NOT FOUND.");
         else System.out.println("FOUND.");
    }
    
    public Node search(Node root, int value)
    {
        if( root == null || root.data == value)
        {
            return root;
        }
        
        if( value < root.data )
        {
            System.out.println("Left Child..");
            return search(root.leftChild, value);
        }else if(value > root.data )
        {
            System.out.println("Right Child..");
            return search(root.rightChild, value);
        }
        return root;
    }
    
    public static void main(String[] args)
    {
        BinarySearchTree btree = new BinarySearchTree();
        
        btree.insertValue(60);
        btree.insertValue(40);
        btree.insertValue(48);
        btree.insertValue(44);
        btree.insertValue(50);
        btree.insertValue(70);
        btree.insertValue(440);
        btree.insertValue(74);
        btree.searchValue(44);
    }
}
