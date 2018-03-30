public class TwoSumSimple {
    
    public static int[] search(int array[], int target)
    {
        int i = 0;
        int index1, index2 = 0;
        
        // [1,2,3,4,5,6,7,8,9];
        
        for(i = 0; i < array.length; i++)
        {
            index1 = i;

            for(int j = 1; j < array.length; j++)
            {
                index2 = j;
                if( (array[i] + array[j]) == target)
                {
                    return new int[] { index1, index2 };
                }
            }
        }
        return new int[] { 0, 0 };
    }
}
