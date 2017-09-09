public class SelectionSort {

    private int[] arrayToSort;
    private int sizeOfArray;
    private int currentSortedIndex = 0;

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
        this.sort(this.currentSortedIndex);
    }

    private void sort(int currentSortedIndex)
    {
        this.currentSortedIndex = currentSortedIndex;
        int minimum = this.arrayToSort[this.currentSortedIndex];
        int temp;

        if( (this.currentSortedIndex+1) == this.sizeOfArray) {
            System.out.println("Your array has been sorted successfully.");
        }else
        {
            for(int i = this.currentSortedIndex; i < this.sizeOfArray; i++ )
            {
                if(this.arrayToSort[i] < minimum)
                {
                    temp = minimum;
                    minimum = this.arrayToSort[i];
                    this.arrayToSort[i] = temp;
                }
            }
            this.arrayToSort[this.currentSortedIndex] = minimum;
            currentSortedIndex++;
            this.displayArray();
            this.sort(currentSortedIndex);
        }
    }
}
