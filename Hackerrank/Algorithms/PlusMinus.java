import java.util.Arrays;

public class PlusMinus {

    public static double[] fractionOf(int[] array, int size)
    {
        int zerosCount = 0;
        int positiveNumCount = 0;
        int negativeNumCount = 0;

        for(int num: array)
        {
            if(num < 0){ negativeNumCount++; }
            else if(num > 0 ) { positiveNumCount++; }
            else zerosCount++;
        }
        System.out.println("Positive nums: " + positiveNumCount + " | Negative nums: " + negativeNumCount + " | Zeroes: " + zerosCount);
        return new double[] { (double)zerosCount/size, (double)positiveNumCount/size, (double)negativeNumCount/size };
    }

    public static void main(String[] args)
    {
        int[] array = {1, -3, 6, -1, 0, 7, 0, -4, 10, -12};

        System.out.println(Arrays.toString(fractionOf(array, array.length)));
    }
}

