public class BirthdayCakeCandles {

    public static void main(String[] args)
    {
        int[] array = {1, 2, 4, 24, 5, 14, 25, 24, 7, 21, 24 };
        int numOfCandles;

        numOfCandles = blowableCandles(array);

        System.out.println("Number of candles she can blow is: " + numOfCandles);
    }

    public static int blowableCandles(int[] array)
    {
        int highestCandle = array[0];
        int numOfCandles = 1;

        for(int i=1; i<array.length; i++)
        {
            if(array[i] > highestCandle)
            {
                highestCandle = array[i];
            }
            else if(array[i] == highestCandle)
            {
                numOfCandles++;
            }
        }
        return numOfCandles;
    }
}

