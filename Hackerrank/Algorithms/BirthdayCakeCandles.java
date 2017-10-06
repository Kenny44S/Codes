public class BirthdayCakeCandles {

    public static void main(String[] args)
    {
        int[] array = {18, 90, 90, 13, 90, 75, 90, 8, 90, 43};
        int highestCandle = array[0];
        int numOfCandles = 1;

        for(int i=1; i<array.length; i++)
        {
            if(array[i] > highestCandle)
            {
                highestCandle = array[i];
                numOfCandles--;
                numOfCandles++;
            }
            else if(array[i] == highestCandle)
            {
                numOfCandles++;
            }
        }
        System.out.println("Number of candles she can blow is: " + numOfCandles);
    }
}

