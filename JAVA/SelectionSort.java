public class SelectionSort {

    private int[] arrayToSort;
    private int sizeOfArray;
    private int nextIndexToSort = 0;

    /*
     * @params integer sizeOfInteger : size of array to sor
     * @params integer maxRange      : Random numbers from 0 - maxRange will be inserted into array.
     *
     */

    SelectionSort(int sizeOfArray, int maxRange)
    {
        this.arrayToSort = new int[sizeOfArray];
        this.sizeOfArray = sizeOfArray;
        this.fillArray(maxRange);
    }

    public void fillArray(int limit)
    {
        int i;
        for(i=0; i < this.sizeOfArray; i++)
        {
            this.arrayToSort[i] = this.generateRandomNumber(limit);
        }
        System.out.println("Array created & filled with random numbers successfully.");
        System.out.println("Original array: ");
        this.displayArray();

    }

    void displayArray()
    {
        int i;
        for(i=0; i < this.sizeOfArray; i++)
        {
            System.out.print(" | " + this.arrayToSort[i]);
        }
        System.out.println("\n-------------------------------------------------------------------------");
    }

    public int generateRandomNumber(int endRange)
    {
        int randomNumber = 0;
        randomNumber = (int) (Math.random() * endRange);
        return randomNumber;
    }

    public void startSort()
    {
        this.sort(this.nextIndexToSort);
    }

    private void sort(int nextIndexToSort)
    {
        this.nextIndexToSort = nextIndexToSort;
        int minimum = this.arrayToSort[this.nextIndexToSort];
        int temp;

        if( (this.nextIndexToSort+1) == this.sizeOfArray) {
            System.out.println("Your array has been sorted successfully.");
        }else
        {
            for(int i = this.nextIndexToSort + 1; i < this.sizeOfArray; i++ )
            {
                if(this.arrayToSort[i] < minimum)
                {
                    temp = minimum;
                    minimum = this.arrayToSort[i];
                    this.arrayToSort[i] = temp;
                }
            }
            this.arrayToSort[this.nextIndexToSort] = minimum;
            nextIndexToSort++;
            this.displayArray();
            this.sort(nextIndexToSort);
        }
    }
}
