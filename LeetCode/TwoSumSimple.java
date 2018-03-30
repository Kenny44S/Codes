public class MyClass {
    
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
    
    
    public static void main(String args[]) {
        
        int array[]  =  { 1, 4, 6, 3, 20, 14, 44, 24, 30, 80, 60, 20 };
        
        int result[] = search(array, 66);
        System.out.println(result[0] + " - " + result[1]);
    }
}
