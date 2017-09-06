public class SimpleStack {

    private int[] stack;
    private int stackSize = -1;
    private int currentPosition = 0;

    SimpleStack(int size)
    {
        this.stackSize = size;
        this.stack = new int[this.stackSize];
        System.out.println("Stack of size "+ this.stackSize +" created successfully");
        System.out.println("Functions available: getSpace(), push(int), pop(), currentPosition() ");
    }

    public void push(int valueToInsert)
    {
        if( (this.currentPosition + 1) > this.stackSize)
        {
            System.out.println("Stack is already full. INSERT failed.");
        }else
        {
            this.stack[currentPosition] = valueToInsert;
            System.out.println("Value " + valueToInsert + " inserted at index stack["+currentPosition+"] successfully.");
            currentPosition++;
            this.getSpace();
        }
    }

    public void pop()
    {
        if( (this.currentPosition - 1) < 0)
        {
            System.out.println("Stack is already empty. Can not POP");
        }else
        {
            this.stack[this.currentPosition] = 0;
            System.out.println("Value has been removed from Stack");
            this.getSpace();
            this.currentPosition--;
            this.stackSize++;
        }
    }

    public void currentPosition()
    {
        System.out.println("Current position is: " + this.currentPosition );
    }

    public void displayStack()
    {
        if(this.stackSize <= 0)
        {
            System.out.println("Stack is empty");
        }else
        {
            for(int i=0; i < this.stackSize; i++)
            {
                System.out.print((i+1) + " -> ");
                System.out.print(this.stack[i]);
                System.out.println();
            }
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
            size = this.stackSize - this.currentPosition;
            System.out.println("Space is: " + size);
        }
    }
}
