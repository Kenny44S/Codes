public class BinarySearch {

    int left = 0;
    int right = 0;
    int middle = 0;
    int[] array;

    public void displayArray(int left, int right, int[] array)
    {
        for(int i=left; i <= right; i++)
        {
            System.out.print("|" + array[i] + "|");
        }
    }

    public void startSearch(int[] array, int value)
    {
        this.array = array;
        this.search(left, (array.length - 1), value, this.array);
    }

    private void search(int leftIndex, int rightIndex, int target, int[] array)
    {
        left = leftIndex;
        right = rightIndex;
        middle = (left + right) / 2;

        displayArray(left, right, array);
        System.out.println();
        System.out.println("LeftIndex: " + left + ", RightIndex: " + right + ", MiddleIndex: " + middle + ", Search Value: " + target);
        System.out.println("-----------------------------------------------------------------------------------------");
        
        if(leftIndex == rightIndex)
        {
            System.out.println("Value not found..");
            return;
        }
        
        if(array[middle] == target)
        {
            System.out.println("Value found at index: " + middle);
        }
        else if(array[middle] > target)
        {
            right = middle;
            search(left, right, target, array);

        }else if(array[middle] < target)
        {
            left = middle + 1;
            search(left, right, target, array);
        }
    }
    
    public static void main(String[] args)
    {
        int[] array = {1,2,3,4,5,40,50,54,60,62,70,72,82,100,120,144,148,150,172,186,190,191,200};
        BinarySearch bs = new BinarySearch();
        bs.startSearch(array, 101);
    }
}

