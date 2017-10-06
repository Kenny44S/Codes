
public class MinMaxSum {


    public static void main(String[] args)
    {
        int lowestNum = 0;
        int highestNum = 0;

        long lowestSum = 0;
        long highestSum =0;

        int[] array = {1, 2, 3, 4, 5};

        highestNum = array[0];
        lowestNum = array[0];

        for(int i=0; i<array.length; i++)
        {
            if(array[i] > highestNum)
            {
                highestNum = array[i];
            }
            if(array[i] < lowestNum)
            {
                lowestNum = array[i];
            }
            highestSum += array[i];
            lowestSum += array[i];
        }
        System.out.println("Lowest Sum of 4 number is: " + (highestSum - highestNum));
        System.out.println("Highest Sum of 4 number is: " + (highestSum - lowestNum));
    }
}

