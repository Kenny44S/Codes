public class Stack {

    private int[] stack;
    private int stackSize = -1;
    private int currentPosition = -1;
    private int nextEmptySlot = 0;

    Stack(int size)
    {
        this.stackSize = size;
        this.stack = new int[this.stackSize];
        System.out.println("Stack of size "+ this.stackSize +" created successfully");
        System.out.println("Functions available: getSpace(), push(int), pop(), currentPosition() ");
        System.out.println("------------------------------------------------------------------");
    }

    public void push(int valueToInsert)
    {
        if( (this.currentPosition + 1) == this.stackSize)
        {
            System.out.println("Stack is already full. INSERT failed.");
        }else
        {
            this.stack[currentPosition+1] = valueToInsert;
            System.out.println("Value " + valueToInsert + " inserted at index stack["+(currentPosition+1)+"] successfully.");
            this.currentPosition++;
            this.nextEmptySlot++;
            this.getSpace();
        }
    }

    public void pop()
    {
        if( (this.nextEmptySlot - 1) < 0)
        {
            System.out.println("Stack is already empty. Can not POP");
        }else
        {
            this.stack[this.nextEmptySlot-1] = 0;
            System.out.println("Value has been removed from Stack");
            this.currentPosition--;
            this.nextEmptySlot--;
            this.getSpace();
        }
    }

    public void currentPosition()
    {
        System.out.println("Current position is: " + (this.currentPosition+1) );
    }

    public void nextEmptySlot(){
        System.out.println("Next empty slot at: stack["+this.nextEmptySlot+"]");
    }

    public void displayStack()
    {
        if(this.stackSize <= 0)
        {
            System.out.println("Stack is empty");
        }else
        {
            System.out.println("--------------------------------------------");
            for(int i=0; i < this.stackSize; i++)
            {
                System.out.print("|"+ i +"|");
            }
            System.out.println(" <-- Index");
            for(int z=0; z < this.stackSize; z++)
            {
                System.out.print("|"+this.stack[z]+"|");
            }
            System.out.print(" <-- Values");
            System.out.print("\n--------------------------------------------");
        }

    }

    public void getSpace()
    {
        int size = 0;
        if(this.stackSize < 0)
        {
            System.out.println("Stack not initiated..");
        }else
        {
            size = this.stackSize - (this.currentPosition + 1);
            System.out.println("Available space is: " + size);
        }
    }
    
    public static void main(String[] args){
        Stack stack = new Stack(14);
        stack.push(10);
        stack.push(2);
        stack.push(22);
        stack.push(24);
        stack.push(40);
        stack.push(42);
        stack.push(84);
        stack.push(100);
        stack.push(48);
        stack.push(82);
        stack.push(100);
        stack.push(48);
        stack.push(82);
        stack.push(100);
        stack.push(1);

    }
}