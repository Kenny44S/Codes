import java.util.HashMap;

public class BinarySearchTree
{
    Node root;
    
    HashMap<Integer, Integer> hmap;
    
    
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
        root = insert(root, value);
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
    
    public void inorderTraversal()
    {
        hmap = new HashMap<Integer, Integer>();
        traverse(root, 0, hmap);
    }
    
    public void traverse(Node root, int hd, HashMap<Integer, Integer> hmap)
    {
        if(root == null)  return;
        
        traverse(root.leftChild, (hd-1), hmap);                     
        int previousSum = hmap.get(hd) == null ? 0 : hmap.get(hd);
        hmap.put(hd, previousSum + root.data);
        traverse(root.rightChild, (hd+1), hmap);
    }
    
    public static void main(String[] args)
    {
        BinarySearchTree bstree = new BinarySearchTree();
        
        bstree.insertValue(60);
        bstree.insertValue(40);
        bstree.insertValue(50);
        bstree.insertValue(30);
        bstree.insertValue(20);
        bstree.insertValue(80);
        bstree.insertValue(100);
        bstree.insertValue(70);
        
        bstree.inorderTraversal();
        
        System.out.println(bstree.hmap);
        
    }
}