import java.util.Arrays;

public class PlusMinus {

    public static double[] fractionOf(int[] array, int size)
    {
        double zerosCount = 0;
        double positiveNumCount = 0;
        double negativeNumCount = 0;

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
        int[] array = {1, -3, 6, -1, 0, 7, 0, -4, 10, -12, 13, 0, 4};

        System.out.println(Arrays.toString(fractionOf(array, array.length)));
    }
}

