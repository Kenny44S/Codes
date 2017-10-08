public class DiagonalDifference {

    public static int solveDiagonalDifference(int[][] matrix)  // ** Diagonal difference of a N x N matrix
    {
        displayMatrix(matrix);

        int arrayLength = matrix.length;
        int leftTopToRightBottom = 0;                  // index we will       ->   0, 1, 2...n-1   where n = array length
        int rightTopToLeftBottom = arrayLength-1;      // use to ADD          ->   n-1, n-2, n-3,....

        int leftDiagonalSum = 0;             // LEFT TOP TO RIGHT BOTTOM Diagonal sum
        int rightDiagonalSum = 0;            // RIGHT TOP TO LEFT BOTTOM Diagonal sum

        for(int i=0; i < arrayLength; i++)
        {
            leftDiagonalSum  += matrix[i][leftTopToRightBottom];
            rightDiagonalSum += matrix[i][rightTopToLeftBottom];

            leftTopToRightBottom++;
            rightTopToLeftBottom--;
        }
        return Math.max(leftDiagonalSum, rightDiagonalSum) - Math.min(leftDiagonalSum, rightDiagonalSum);
    }

    public static void displayMatrix(int [][] matrix)
    {
        for(int i=0; i< matrix.length; i++)
        {
            for(int z=0; z< matrix[0].length; z++)
            {
                System.out.format("%8d", matrix[i][z]);
            }
            System.out.println("\n");
        }
    }

    public static int[][] fillMatrix(int arraySize)
    {
        int[][] matrix = new int[arraySize][arraySize];
        for(int i=0; i < arraySize; i++)               // Fill array with random numbers
        {
            for(int z=0; z < arraySize; z++)
            {
                matrix[i][z] = i + (int)(Math.random()*100);
            }
        }
        return matrix;
    }

    public static void main(String[] args) {

        final int arraySize = 4;                       // Size of array  N x N,   here N = 4;
        int[][] matrix;
        matrix = fillMatrix(arraySize);
        System.out.println("Positive Difference between the diagonals is: " + solveDiagonalDifference(matrix));
    }
}

