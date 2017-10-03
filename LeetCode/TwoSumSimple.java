public class TwoSumSimple {

    private int[] array = {2, 1, 3, 8, 11, 6, 7, 18};
    private int target = 15;
    private int index1 = -1;
    private int index2 = -1;

    public int[] start()
    {
        for(int i = 0; i < this.array.length; i++)
        {
            for(int j = i+1; j < this.array.length; j++)
            {
                if(this.array[i] + this.array[j] == target)
                {
                    this.index1 = i;
                    this.index2 = j;
                    i = this.array.length;
                    j = i;
                }
            }
        }
        return new int[] {index1, index2};
    }
}

